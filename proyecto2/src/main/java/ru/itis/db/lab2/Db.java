package ru.itis.db.lab2;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Db {
    private List<Order> orders;


    public String toJSON() {
        String res = "\"orders\":[";
        for (Order order : orders){
            res = res + order.toJSON() + ",";
        }
        res =  res + "]}";
        return res;
    }
}