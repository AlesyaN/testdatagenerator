package ru.itis.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Account {
    private String login;
    private String password;

    public Account() {
        login = "lesya";
        password = "qwerty";
    }

}
