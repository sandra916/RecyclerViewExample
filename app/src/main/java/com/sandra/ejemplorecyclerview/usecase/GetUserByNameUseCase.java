package com.sandra.ejemplorecyclerview.usecase;

import com.sandra.ejemplorecyclerview.data.User;

import java.util.ArrayList;

public class GetUserByNameUseCase {

    private GetUserListUseCase getUserListUseCase = new GetUserListUseCase();

    public User getUserByName(String name) {
        ArrayList<User> userArrayList = getUserListUseCase.getUserList();
        User user = new User();

        for (int i = 0; i < userArrayList.size(); i++) {

            if (userArrayList.get(i).getName().equalsIgnoreCase(name)) {
                user = userArrayList.get(i);
            }
        }

        return user;
    }
}
