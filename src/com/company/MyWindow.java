package com.company;

import javax.swing.*;
import java.awt.*;


public class MyWindow extends JFrame {
    public MyWindow()throws HeadlessException{
        DrawPanel dp = new DrawPanel();
        this.add(dp);
    }
}
