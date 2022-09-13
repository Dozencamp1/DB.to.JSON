package ru.itis.db.lab2;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private Store store;
    private Book book;
    private Client client;
    private float summ;

    public String toJSON(){
        return
                "{\"store\":" + store.toJSON() + "," +
                        "\"book\":" + book.toJSON() + "," +
                        "\"client\":" + client.toJSON() + "," +
                        "\"summ\":" + summ + "}";
    }
}

