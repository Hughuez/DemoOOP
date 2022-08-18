package com.minTicUdea.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {

    private LocalDate orderDate;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

}
