package com.minTicUdea.model;

import com.minTicUdea.model.enums.OrderStatus;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDate orderDate;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();
    private OrderStatus status;

    public Order(LocalDate orderDate, Client client, List<OrderItem> items, OrderStatus status) {
        this.orderDate = orderDate;
        this.client = client;
        this.items = items;
        this.status = status;
    }


    public LocalDate getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem (OrderItem item){
        items.add(item);
    }

    public void removeItem (OrderItem item){
        items.remove(item);
    }

    public double total(){
        double sum = 0.0;
            for(OrderItem it: items){
                sum += it.subTotal();
            }
        return sum;
    }

    @Override
    public String toString() {
        return "Order{" +
                "\norderDate=" + orderDate +
                ", \nclient=" + client +
                ", \nitems=" + items +
                ", \nstatus=" + status +
                '}';
    }
}
