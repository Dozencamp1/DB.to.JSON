package ru.itis.db.lab2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Client {
    private String name;
    private String phone;
    private String email;
    private String lastname;
    private String discountcard;

    public String toJSON() {
        return
                "{\"name\":\"" + name + "\"," +
                        "\"phone\":\"" + phone + "\"," +
                        "\"email\":\"" + email + "\"," +
                        "\"lastname\":\"" + lastname + "\"," +
                        "\"discountcard\":" + discountcard + "}";

    }

}
