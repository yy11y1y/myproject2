package com.paisley.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessFrame extends JFrame {
    //Constructors
    public GuessFrame() {
        super();
        setSize(600, 400);
        setLocation(300, 200);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        JButton button = new JButton("Guess");
        JLabel label = new JLabel("Enter a number");
        JTextField number = new JTextField(8);
        int secret = new Random().nextInt(100)+1;
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int num = Integer.parseInt(number.getText());
                System.out.println(num);
                if(num > secret){
                    label.setText("Smaller");
                } else if (num < secret){
                    label.setText("Bigger");
                }else {
                    label.setText("Bingo.The secret number is " + secret);
                }
                //System.out.println("Hello");
                //label.setText("hello");
            }
        });

        setLayout(new FlowLayout());
        add(number);
        add(button);
        add(label);
        setVisible(true);
    }
    public static void main(String[] args) {
        GuessFrame guessFrame = new GuessFrame();
    }

}
