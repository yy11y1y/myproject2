package com.paisley.ticket;

public abstract class Ticket {
    /*public static final int TAIPEI_CITY = 100;
    public static int TAICHUNG_CITY = 200;
    public static int KAOHSIUNG_CITY = 300;*/

    int price;
    int amount;
    Station start;
    Station destination;

    public Ticket(Station start,Station destination,int amount){
        this.start = start;
        this.destination = destination;
        int diff = Math.abs(start.id - destination.id);
        System.out.println("diff:" + diff);
        switch (diff) {
            case 100:
                price = 500;
                break;
            case 200:
                price = 600;
                break;
            case 300:
                price = 1100;
                break;
        }
    }

    public abstract float price();

    /*if (start == Station.TAIPEI_CITY) {
                if (destination ==  Station.TAICHUNG) {
                    price = 500;
                } else {
                    price = 1100;
                }
            } else if (start == Station.TAICHUNG) {
                if (destination == Station.KAOHSIUNG) {
                    price = 600;
                } else {
                    price = 500;
                }
            } else if (start == Station.KAOHSIUNG) {
                if (destination == Station.TAIPEI_CITY) {
                    price = 110;
                } else {
                    price = 600;
                }
            }*/
    public void print(){
        //
    }
}
