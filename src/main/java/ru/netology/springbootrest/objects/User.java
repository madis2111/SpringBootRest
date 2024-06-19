package ru.netology.springbootrest.objects;

import java.util.Objects;

public class User {
    private String username;
    private String pass;

    public User(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(username, user.username) && Objects.equals(pass, user.pass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, pass);
    }
}