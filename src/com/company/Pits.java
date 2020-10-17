package com.company;

import java.awt.*;

public class Pits implements Drawable {

    private int x;
    private int y;

    Pits(int x, int y){
       this.x = x;
       this.y = y;
    }

    @Override
    public void draw(Graphics2D g) {
        drawPits(g);
    }

    private void drawPits (Graphics2D gr){
        gr.setColor(Color.black);
        gr.fillOval(x, y, 100, 50);
        gr.fillOval(x + 40, x - 15, 50, 50);
        gr.fillOval(x + 20, x - 20, 50, 50);
    }
}
