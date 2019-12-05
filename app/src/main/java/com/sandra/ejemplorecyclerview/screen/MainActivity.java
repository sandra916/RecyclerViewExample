package com.sandra.ejemplorecyclerview.screen;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sandra.ejemplorecyclerview.R;
import com.sandra.ejemplorecyclerview.adapter.RecyclerAdapter;
import com.sandra.ejemplorecyclerview.data.User;
import com.sandra.ejemplorecyclerview.usecase.GetUserListUseCase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Declaramos las variables de la vista
    RecyclerView recyclerView;

    //Creamos la variable del use case
    private GetUserListUseCase getUserListUseCase = new GetUserListUseCase();
    ArrayList<User> userArrayList = getUserListUseCase.getUserList();

    //Creamos el adaptador
    private RecyclerAdapter recyclerAdapter = new RecyclerAdapter(getUserListUseCase.getUserList());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        //Asignamos el recycler a su vista
        recyclerView = findViewById(R.id.recycler);

        //Inicializamos el recyclerView
        initView();
    }

    private void initView() {

        recyclerView.setHasFixedSize(true);
        //iniciamos el recycler en vertical
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        //añadimos el metodo onclick al recycler
        addOnClick();

        //iniciamos el recyclerView dandole su adaptador
        recyclerView.setAdapter(recyclerAdapter);
    }

    private void addOnClick() {

        recyclerAdapter.setOnclickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                recyclerView.indexOfChild(v);
                User user = userArrayList.get(recyclerView.getChildAdapterPosition(v));

                //Enviamos el datoa a la otra pantalla
                Intent intent = new Intent(getApplicationContext(), DetailActivity.class);
                intent.putExtra("userName", user.getName());
                startActivity(intent);
            }
        });
    }
}
