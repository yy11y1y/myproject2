package com.paisley.sales;

public class SliverCustomer extends customer{
    public SliverCustomer(String id, int amount) {
        super(id, amount);
    }
    public int getReturnMoney(){
        return (int) (amount*0.1f*2);
    }

    @Override
    public void print(){
        System.out.println(id + "\t" + amount + "\t" + (amount-getOffMoney()) + "("+getReturnMoney()+")");
    }
}

