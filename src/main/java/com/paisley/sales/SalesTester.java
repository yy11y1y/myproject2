package com.paisley.sales;

import java.util.ArrayList;

public class SalesTester {
    public static void main(String[] args) {
        ArrayList<customer> list = new ArrayList<>();
        customer c1 = new customer("001",1200);
        customer c2 = new customer("002",800);
        SliverCustomer c3 = new SliverCustomer("003",2000);
        GoldenCustomer c4 = new GoldenCustomer("004",5000);
        DiscountCustomer c5 = new DiscountCustomer("006",900);
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);
        list.add(c5);
        for (customer c :list){
            c.print();
        }

    }
}
