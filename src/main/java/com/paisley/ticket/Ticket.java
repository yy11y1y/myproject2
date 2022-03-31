package com.paisley.ticket;

public class Ticket {
    public static final int TAIPEI_CITY = 100;
    public static int TAICHUNG_CITY = 200;
    public static int KAOHSIUNG_CITY = 300;

    int amount;
    Station start;
    Station destination;
    public Ticket(Station start,Station destination,int amount){
        this.start = start;
        this.destination = destination;
        this.amount = amount;
    }
    public float price(){
        int distance = destination.id - start.id;
        if(destination.id == 200 && start.id == 100 || start.id == 200  && destination.id == 100){
            return 600;
        }else if(destination.id == 300 && start.id == 200 || start.id == 300  && destination.id == 200){
            return 900;
        }else if (distance == 200 || distance == -200){
            return 1500;
        }
        return 0;
    }
    public void print(){
        System.out.println("normal ticket"+"\t"+start.name+"to"+destination.name+"\t"+amount+"\t"+price()*amount);
    }
}
