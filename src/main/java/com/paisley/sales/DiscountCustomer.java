package com.paisley.sales;

public class DiscountCustomer extends customer{
    public DiscountCustomer(String id, int amount) {
        super(id, amount);
    }
    @Override
    public float backMoney(){
        return amount*off;
    }
}
