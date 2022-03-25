package com.paisley.sales;

public class GoldenCustomer extends customer{
    public GoldenCustomer(String id , int amount){
        super(id, amount);
    }
    public int getReturnMoney(){
        return (int) (amount*0.1f);
    }

    @Override
    public void print(){
        System.out.println(id + "\t" + amount + "\t" + (amount-(getOffMoney()*2)) + "("+getReturnMoney()*2+")");
    }
}
