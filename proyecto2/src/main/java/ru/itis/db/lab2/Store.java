package ru.itis.db.lab2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Store {
    private String name;
    private String address;
    private String phone;
    private String email;

    public String toJSON() {
        return
                "{\"name\":\"" + name + "\"," +
                        "\"address\":\"" + address + "\"," +
                        "\"phone\":\"" + phone + "\"," +
                        "\"email\":" + email + "}";

    }
}
