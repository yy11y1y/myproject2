package com.paisley;

public class Student {
    String name;
    int english;
    int math;
    public Student (String name){
        this.name =  name;
    }
    public Student () {

    }
    public Student(String name,int English,int math){
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public void print (){
        int average = (english + math)/2;
        //System.out.println(name + "/t" + english + "/t" + math + "/t" + average);
        System.out.println("hungry");
        if (average < 60){
            System.out.println("*");
        }
        System.out.println();
    }
}
