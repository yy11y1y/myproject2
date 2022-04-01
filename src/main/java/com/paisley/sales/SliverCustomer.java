package com.paisley.sales;

public class SliverCustomer extends customer{
    public SliverCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public void print(){
        System.out.println(id + "\t" + amount + "\t" + (amount-backMoney()) + "("+backMoney()+")");
    }
}

