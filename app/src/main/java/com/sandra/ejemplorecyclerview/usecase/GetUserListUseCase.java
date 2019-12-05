package com.sandra.ejemplorecyclerview.usecase;

import com.sandra.ejemplorecyclerview.data.User;

import java.util.ArrayList;

public class GetUserListUseCase {

    public ArrayList<User> getUserList() {

        ArrayList<User> list = new ArrayList<>();

        list.add(new User("Pedro", "calle Pedro numero 8", "pedro@pedro.com", "https://lorempixel.com/400/200/people/1"));
        list.add(new User("Maria", "calle Maria de la 0 4", "maria@maria.com", "https://lorempixel.com//400/200/people/2"));
        list.add(new User("Juan", "calle Juan palotes2", "juan@juan.com", "https://lorempixel.com//400/200/people/3"));
        list.add(new User("Pepe", "calle Pepe numero 8", "Pepe@Pepe.com", "https://lorempixel.com//400/200/people/4"));
        list.add(new User("Ramon", "calle Ramon de la 0 4", "Ramon@Ramon.com", "https://lorempixel.com//400/200/people/5"));
        list.add(new User("Antonio", "calle Antonio palotes2", "Antonio@Antonio.com", "https://lorempixel.com//400/200/people/6"));
        list.add(new User("Antonia", "calle Antonia numero 8", "Antonia@Antonia.com", "https://lorempixel.com//400/200/people/7"));
        list.add(new User("Sandra", "calle Sandra de la 0 4", "Sandra@Sandra.com", "https://lorempixel.com//400/200/people/8"));
        list.add(new User("Juana", "calle Juana palotes2", "Juana@Juana.com", "https://lorempixel.com//400/200/people/9"));
        list.add(new User("Elisa", "calle Elisa numero 8", "Elisa@Elisa.com", "https://lorempixel.com//400/200/people/10"));

        return list;
    }
}
