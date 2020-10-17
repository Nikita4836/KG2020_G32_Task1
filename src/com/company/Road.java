package com.company;

import java.awt.*;

public class Road implements Drawable {

    @Override
    public  void draw(Graphics2D g) {
        road(g);
    }


    private static void road (Graphics2D gr){
        drawRoad(gr);
    }

    private static void drawRoad (Graphics2D gr){
        int figureheight = 600;
        int figurewidth  = 800;

        gr.setColor ( Color.GRAY ) ;
        gr.fillRect ( 0, 0, figurewidth, figureheight ) ;
        gr.setColor(Color.white);
        gr.fillRect(0, figureheight / 2, figurewidth, figureheight / 25);
    }


}
