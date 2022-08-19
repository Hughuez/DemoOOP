package com.minTicUdea.model;

import java.time.LocalDate;

public class Client {
    private String name;
    private String email;
    private LocalDate birthdate;

    public Client(String name, String email, LocalDate birthdate) {
        this.name = name;
        this.email = email;
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "\nname='" + name + '\'' +
                ", \nemail='" + email + '\'' +
                ", \nbirthdate=" + birthdate +
                '}';
    }
}
