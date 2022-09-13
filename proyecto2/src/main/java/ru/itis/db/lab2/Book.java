package ru.itis.db.lab2;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Book {
    private Store store;
    private String name;
    private String information;
    private String autorname;
    private String category;
    private float price;

    public String toJSON() {
        return
                "{\"store\":" + store.toJSON() + "," +
                        "\"name\":\"" + name + "\"," +
                        "\"information\":\"" + information + "\"," +
                        "\"autorname\":\"" + autorname + "\"," +
                        "\"category\":\"" + category + "\"," +
                        "\"price\":" + price + "}";

    }

}
