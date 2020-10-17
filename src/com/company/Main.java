package com.company;

        import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        MyWindow mw = new MyWindow();
        mw.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mw.setSize(800,600);
        mw.setVisible(true);
    }
}
