package com.sandra.ejemplorecyclerview.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sandra.ejemplorecyclerview.R;
import com.sandra.ejemplorecyclerview.data.User;

import java.util.ArrayList;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.Holder> implements View.OnClickListener {
    private ArrayList<User> userList;
    private View.OnClickListener listener;


    public RecyclerAdapter(ArrayList<User> userList) {
        this.userList = userList;
    }

    @Override
    public void onClick(View view) {
        if (listener != null) {
            listener.onClick(view);
        }
    }

    public void setOnclickListener(View.OnClickListener listener) {
        this.listener = listener;
    }

    //Creamos la vista y se la asignamos al Holder para poder acceder a ella
    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_view, parent, false);
        view.setOnClickListener(this);
        return new Holder(view);
    }

    // Aqui seteamos los datos de nuestra lista con la vista a traves del Holder
    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        //Seteamos el nombre del usuario
        holder.userName.setText(userList.get(position).getName());
    }

    //En este  metodo siempre devolvemos el tamaño de la lista
    @Override
    public int getItemCount() {
        return userList.size();
    }


    class Holder extends RecyclerView.ViewHolder {

        private TextView userName;
        private ImageView image;

        private Holder(@NonNull View itemView) {
            super(itemView);
            userName = itemView.findViewById(R.id.nameUser);
            image = itemView.findViewById(R.id.imageUser);
        }
    }
}
