package com.paisley.sales;

public class GoldenCustomer extends SliverCustomer{
    public GoldenCustomer(String id, int amount) {
        super(id, amount);
        off = 0.2f;
    }

}
