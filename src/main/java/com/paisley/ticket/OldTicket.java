package com.paisley.ticket;

public class OldTicket extends StudentTicket{
    public OldTicket(Station start, Station destination, int amount) {
        super(start, destination ,amount);
        off = 0.5f;
    }
    @Override
    public void print(){
        System.out.println("old ticket"+"\t"+start.name + " to " + destination.name + "\t" + amount + "\t" + price()*amount);
    }
}
