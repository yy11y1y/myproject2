package com.paisley.ticket;

import java.util.ArrayList;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        //Constructur, constant value
        ArrayList<Ticket> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Your start station?(Taipei:1, Taichung:2, Kaohsiung:3)");
            int choice = Integer.parseInt(scanner.next());
            if(choice == 0){
                break;
            }
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
            int choice1 = Integer.parseInt(scanner.next());
            Station endStation = null;
            switch (choice1){
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
            System.out.println("choose type(1: normal ,2: student,3: old,4: return)");
            int type = Integer.parseInt(scanner.next());
            System.out.println("how many:");
            int n = Integer.parseInt(scanner.next());
            switch (type){
                case 1:
                    Ticket ticket = new Ticket(startStation , endStation ,n);
                    list.add(ticket);
                    break;
                case 2:
                    StudentTicket studentTicket = new StudentTicket(startStation , endStation , n);
                    list.add(studentTicket);
                    break;
                case 3:
                    OldTicket grandTicket = new OldTicket(startStation , endStation , n);
                    list.add(grandTicket);
                    break;
                case 4:
                    ReturnTicket returnTicket = new ReturnTicket(startStation , endStation , n);
                    list.add(returnTicket);
            }
        }
        for(Ticket t : list){
            t.print();
        }
    }
}
