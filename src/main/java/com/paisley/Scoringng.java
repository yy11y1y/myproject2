package com.paisley;

public class Scoringng {
    public static void main(String[] args) {
        String[] name = {"Kenny" , "Maggie" , "Benny" , "Anny" , "John"};
        int[] english = {85,56,29,98,66};
        int[] math = {98,75,63,54,64};
        for (int i = 0; i < 5; i++) {
                System.out.println(name[i] + "\t" + english[i] + "\t" + math[i] + "\t" + (english[i]+math[i])/2);
        }
    }
}
