package com.paisley.score;

import java.util.ArrayList;
import java.util.List;

public class Scoring {
    public static void main(String[] args) {
        Student jack = new Student("jack",78,62);
        Student hank = new Student("hank",60,32);
        GraduateStudent jane = new GraduateStudent("jane",65,83,79);
        jack.print();
        hank.print();
        jane.print();

    }
}