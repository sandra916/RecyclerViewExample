package com.sandra.ejemplorecyclerview.screen;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.sandra.ejemplorecyclerview.R;
import com.sandra.ejemplorecyclerview.data.User;
import com.sandra.ejemplorecyclerview.usecase.GetUserByNameUseCase;

public class DetailActivity extends AppCompatActivity {

    private GetUserByNameUseCase getUserByNameUseCase = new GetUserByNameUseCase();

    private TextView userName;
    private TextView adreesUser;
    private TextView emailUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_layout);

        String userNameData = getIntent().getStringExtra("userName");

        userName = findViewById(R.id.nameUser);
        adreesUser = findViewById(R.id.adressUser);
        emailUser = findViewById(R.id.emailUser);

        drawUser(getUserByNameUseCase.getUserByName(userNameData));

    }

    private void drawUser(User user) {
        userName.setText(user.getName());
        emailUser.setText(user.getEmail());
        adreesUser.setText(user.getAdress());
    }
}
