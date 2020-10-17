package com.company;

import javax.swing.*;
import java.awt.*;

public class DrawPanel extends JPanel{

    private MyCar car = new MyCar();
    private Road road = new Road();
    private Background bg = new Background();
    private RoadSign rg = new RoadSign();

    @Override
    public void paint(Graphics g) {
        Graphics2D gr = (Graphics2D) g;
        road.draw(gr);
        bg.drawAmountPits(gr, 5);
        rg.draw(gr);
        car.draw(gr);
    }
}
