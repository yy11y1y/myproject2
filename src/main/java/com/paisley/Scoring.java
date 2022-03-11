package com.paisley;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("jack");
        jack.name = "Jack";
        jack.english = 85;
        jack.math = 98;
        Student hank = new Student("hank" );
        jack.print();
        hank.print();
    }
}