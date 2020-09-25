package com.company;

import javax.swing.*;
import java.awt.*;


public class MyWindow extends JFrame {
    public MyWindow()throws HeadlessException{
        MyCar mc = new MyCar();
        this.add(mc);
    }
}
