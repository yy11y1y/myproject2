package com.paisley.score;

public class GraduateStudent extends Student{
    int thesis;
    public GraduateStudent(String name, int english , int math , int thesis){
        super(name , english , math);
        this.thesis = thesis;
    }
    public GraduateStudent(String name) {
        super(name);
    }

    @Override
    public void print(){
        System.out.println(name + "\t"+english+"\t" +math + "\t" +getAverage() + "\t" + thesis);
    }
    public void test(){

    }
}
