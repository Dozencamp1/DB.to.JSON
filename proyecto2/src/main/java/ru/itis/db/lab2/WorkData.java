package ru.itis.db.lab2;

import java.util.ArrayList;
import java.util.List;

public class WorkData {

    public static void main(String ... args) {
        WorkData workData = new WorkData();
        workData.makeOrder();
    }

    public void makeOrder(){

        Db db = new Db ();
        List<Order> orders = new ArrayList<>();
        db.setOrders(orders);


        Order order = new Order();

        //Store
        Store store = new Store ();
        store.setName("Great Library");
        store.setAddress("RU, Moscow, Moscow st., 25 ");
        store.setPhone("8999837152");
        store.setEmail("Storebooks@gmail.com");



        order.setStore(store);
        //book
        Book book = new Book();
        book.setStore(store);
        book.setName("Harry Potter");
        book.setInformation("New");
        book.setAutorname("JK.Rouling");
        book.setCategory("Mistery");
        book.setPrice(5000);

        order.setBook(book);
        //client
        Client client = new Client();
        client.setName("Andres");
        client.setPhone("123456789");
        client.setEmail("And@gmail.com");
        client.setLastname("Melgar");

        order.setClient(client);
        //
        client.setDiscountcard("no");
        order.setSumm(5000);


        orders.add(order);

        System.out.println(db.toJSON());
    }
}
