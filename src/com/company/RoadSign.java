package com.company;

import java.awt.*;

public class RoadSign implements Drawable {

    @Override
    public void draw(Graphics2D g) {
        drawRoadSign(g);
    }

    private static void drawRoadSign (Graphics2D gr){
        stick(gr);
        sign(gr);
        figures(gr);
    }

    private static void stick (Graphics2D gr){
        Color gray = new Color(112, 107, 107);

        gr.setColor(gray);
        gr.fillRect(600, 300, 20, 300);

    }

    private static void sign (Graphics2D gr){
        Color redbrown = new Color ( 182, 1, 0) ;
        Color white = new Color (253, 253, 255) ;

        gr.setColor(redbrown);
        gr.fillOval(547, 230, 120, 120);
        gr.setColor(white);
        gr.fillOval(557,240,100,100);
    }

    private static void figures (Graphics2D gr){
        Color redbrown = new Color ( 182, 1, 0);
        Color black = new Color( 1, 1, 1);

        gr.setColor(redbrown);
        gr.fillRect(570,275,35, 25);
        gr.setColor(black);
        gr.fillRect(610, 275,35,25);

    }
}
