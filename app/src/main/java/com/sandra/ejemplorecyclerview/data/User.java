package com.sandra.ejemplorecyclerview.data;

public class User {
    private String name;
    private String adress;
    private String email;
    private String image;

    public User(String name, String adress, String email, String image) {
        this.name = name;
        this.adress = adress;
        this.email = email;
        this.image = image;
    }
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
