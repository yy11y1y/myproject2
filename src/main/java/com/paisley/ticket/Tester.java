package com.paisley.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //Constructur, constant value
        Ticket ticket = new Ticket(Station.TAIPEI_CITY,Station.KAOHSIUNG);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?(Taipei:1, Taichung:2, Kaohsiung:3)");
        int choice = Integer.parseInt(scanner.next());
        Station startStation = null;
        switch (choice){
            case 1:
                startStation = Station.TAIPEI_CITY;
                break;
            case 2:
                startStation = Station.TAICHUNG;
                break;
            case 3:
                startStation = Station.KAOHSIUNG;
                break;
        }
        System.out.println("Your destination station?(Taipei:1, Taichung:2, Kaohsiung:3)");
        choice = Integer.parseInt(scanner.next());
        Station endStation = null;
        switch (choice){
            case 1:
                endStation = Station.TAIPEI_CITY;
                break;
            case 2:
                endStation = Station.TAICHUNG;
                break;
            case 3:
                endStation = Station.KAOHSIUNG;
                break;
        }
        //What type of ticket?
        //How many ticket?
        //loop?
        System.out.println("What type of ticket?(adult,student,senior)");
        choice = Integer.parseInt(scanner.next());

    }
}
