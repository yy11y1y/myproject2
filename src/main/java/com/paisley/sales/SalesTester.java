package com.paisley.sales;

public class SalesTester {
    public static void main(String[] args) {
        customer c1 = new customer("001",1200);
        customer c2 = new customer("002",800);
        SliverCustomer c3 = new SliverCustomer("003",2000);
        GoldenCustomer c4 = new GoldenCustomer("004",5000);
        DiscountCustomer c5 = new DiscountCustomer("006",900);
        c1.print();
        c2.print();
        c3.print();
        c4.print();
        c5.print();
        //一般客戶 - 滿千送百
        //銀級客戶 - 滿千送百 + 百元還元金
        //金級客戶 - 滿千送兩百 + 兩百元還元金
        //odded after;
        //customer get 10%off discount
        //customer get 30% off discount and 20% point
        //001 1200 1100
        //002  800  800
        //003 2000 1800(200) <-- 銀級客戶
    }
}
