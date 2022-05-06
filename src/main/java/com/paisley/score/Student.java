package com.paisley.score;

//修飾子 Modifier  public/defoult(package)/private/protected
public class Student implements Printable {
    protected String name;
    protected int english;
    protected int math;
    public Student(String name) {
        this.name = name;
    }
    public Student(String name, int English, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }
    public Student() {
        this("John Doe", -1, -1);
    }
    @Override
    public void print (){
        System.out.print(name + "\t" + english + "\t" + math + "\t" + getAverage());
        if (getAverage() < 60){
            System.out.println("*");
        }
        System.out.println();
    }
    /*    public void print() {
        System.out.print(name + "\t" + english +
                "\t" + math + "\t" + getAverage());
        if (getAverage() < 60) {
            System.out.print("*");
        }
        System.out.println();
    }*/

    public int getAverage() {
        return (english+math)/2;
    }

}