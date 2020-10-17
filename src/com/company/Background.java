package com.company;

import java.awt.*;

 class Background {

     void drawAmountPits(Graphics2D gr, int amountPits) {
         for (int i = 0; i < amountPits; i++) {
             int x = Random.interval(0, 600);
             int y = Random.interval(0, 250);
             Pits pits = new Pits(x, y);
             pits.draw(gr);
         }
     }
}
