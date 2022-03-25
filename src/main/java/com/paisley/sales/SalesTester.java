package com.paisley.sales;

public class SalesTester {
    public static void main(String[] args) {
        customer c1 = new customer("001",1200);
        customer c2 = new customer("002",800);
        SliverCustomer c3 = new SliverCustomer("003",2000);
        GoldenCustomer c4 = new GoldenCustomer("004",5000);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        //001 1200 1100
        //002 800  800
        //003 2000 1800(200)
    }
}
