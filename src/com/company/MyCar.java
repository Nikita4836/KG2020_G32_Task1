package com.company;

import java.awt.*;

public class MyCar implements Drawable {

    @Override
    public  void draw(Graphics2D g) {
        drawCar(g);
    }

    private static void drawCar(Graphics2D gr){
        hood(gr);
        bottom(gr);
    }

    private static void hood (Graphics2D gr){
        drawHood(gr);
        drawBody(gr);
        drawTrunk(gr);
        drawVisor(gr);
        drawWindshield(gr);
        drawDoorhandle(gr);
        drawHeadlight(gr);
        door(gr);
        drawDPS(gr);
        flashers(gr);
    }

    private static void bottom (Graphics2D gr){
        drawThresHold(gr);
        wheels(gr);
    }

    private static void drawHood(Graphics2D gr) {
        Color white = new Color (253, 253, 255) ;
        Color darkblue = new Color (25, 76, 190) ;

        gr.setColor ( darkblue ) ;
        gr.fillRect ( 10, 113, 122, 12 ) ;
        gr.setColor ( white ) ;
        gr.fillRect ( 10, 123, 122, 82 ) ;
    }

    private static void door (Graphics2D gr){
        Color REDBROWN = new Color (253, 253, 255) ;
        Color DARKBROWN = new Color (25, 76, 190) ;

        gr.setColor ( REDBROWN ) ;
        gr.fillRect ( 130, 113, 130, 92 ) ;
        gr.setColor(DARKBROWN);
        gr.fillRect(125,112,310,12);
    }

    private static void flashers (Graphics2D gr){
        Color redbrown = new Color ( 182, 1, 0) ;

        gr.setColor(redbrown);
        gr.fillRect(220, 0, 50 , 25);
    }

    private static void drawDPS (Graphics2D gr){
        gr.setColor(Color.BLUE);

        gr.drawString("ДПС", 175, 160);
        gr.drawString("102",330, 100);
    }

    private static void drawBody (Graphics2D gr){
        Color white = new Color (253, 253, 255) ;

        gr.setColor ( white ) ;
        gr.fillRect ( 258, 15, 122, 190 ) ;

    }

    private static void drawTrunk (Graphics2D gr){
        Color white = new Color (253, 253, 255) ;

        gr.setColor ( white ) ;
        gr.fillRect ( 378, 80, 57, 125 ) ;
    }

    private static void drawVisor (Graphics2D gr){
        gr.setColor ( Color.black ) ;
        gr.drawLine ( 131, 15, 110, 30) ;
        gr.drawLine ( 131, 16, 110, 31) ;
        gr.drawLine ( 131, 17, 110, 32) ;
    }

    private static void drawThresHold (Graphics2D gr){
        Color darkblue = new Color (25, 76, 190) ;

        gr.setColor ( darkblue ) ;
        gr.fillRect ( 118, 205, 154, 10 ) ;
    }

    private static void drawWindshield (Graphics2D gr){
        Color ltblue = new Color ( 35, 206, 255 ) ;

        gr.setColor ( ltblue ) ;
        gr.fillRect ( 130, 15, 130, 100 ) ;
    }

    private static void drawDoorhandle (Graphics2D gr){
        gr.setColor ( Color.black ) ;
        gr.drawLine ( 145, 125, 170, 125) ;
        gr.drawLine ( 145, 124, 170, 124) ;
        gr.drawLine ( 145, 123, 170, 123) ;
    }

    private static void drawHeadlight (Graphics2D gr){
        Color darkgold = new Color ( 240, 181, 16) ;

        gr.setColor ( darkgold ) ;
        gr.fillOval ( 10, 105, 10, 10 ) ;
    }

    private static void wheels (Graphics2D gr){
        //drawFrontWheel
        gr.setColor ( Color.black ) ;
        gr.fillOval ( 20, 170, 100, 100 ) ;
        gr.setColor ( Color.white ) ;
        gr.fillOval ( 30, 180, 80, 80 ) ;
        gr.setColor ( Color.black ) ;
        gr.drawOval ( 40, 190, 60, 60 ) ;

        //drawRearWheel
        gr.setColor ( Color.black ) ;
        gr.fillOval ( 270, 170, 100, 100 ) ;
        gr.setColor ( Color.white ) ;
        gr.fillOval ( 280, 180, 80, 80 ) ;
        gr.setColor ( Color.black ) ;
        gr.drawOval ( 290, 190, 60, 60 ) ;

    }

   // public final int FIGUREHEIGHT = 600;
   // public final int FIGUREWIDTH  = 800;

    Color REDBROWN = new Color ( 182, 1, 0) ;
    Color DARKBROWN = new Color (8, 6, 12) ;
    Color LTBLUE = new Color ( 35, 206, 255 ) ;
    Color DARKGOLD = new Color ( 240, 181, 16) ;


   // public void paint (Graphics myCar) {
   //     // Фон
   //     myCar.setColor ( Color.GRAY ) ;
   //     myCar.fillRect ( 0, 0, FIGUREWIDTH, FIGUREHEIGHT ) ;
//
   //     myCar.setColor(Color.WHITE);
   //     myCar.drawLine(800, 300, 0, 300);
//
   //     // Переднее колесо
   //     myCar.setColor ( Color.black ) ;
   //     myCar.fillOval ( 20, 170, 100, 100 ) ;
   //     myCar.setColor ( Color.white ) ;
   //     myCar.fillOval ( 30, 180, 80, 80 ) ;
   //     myCar.setColor ( Color.black ) ;
   //     myCar.drawOval ( 40, 190, 60, 60 ) ;
//
   //     // Заднее колесо
   //     myCar.setColor ( Color.black ) ;
   //     myCar.fillOval ( 270, 170, 100, 100 ) ;
   //     myCar.setColor ( Color.white ) ;
   //     myCar.fillOval ( 280, 180, 80, 80 ) ;
   //     myCar.setColor ( Color.black ) ;
   //     myCar.drawOval ( 290, 190, 60, 60 ) ;
//
   //     // Капот
   //     myCar.setColor ( DARKBROWN ) ;
   //     myCar.fillRect ( 10, 113, 122, 12 ) ;
   //     myCar.setColor ( REDBROWN ) ;
   //     myCar.fillRect ( 10, 123, 122, 82 ) ;
//
   //     // Фара
   //     myCar.setColor ( DARKGOLD ) ;
   //     myCar.fillOval ( 10, 105, 10, 10 ) ;
//
   //     //  Лобовое
   //     myCar.setColor ( LTBLUE ) ;
   //     myCar.fillRect ( 130, 15, 130, 100 ) ;
//
   //     // Дверь
   //     myCar.setColor ( REDBROWN ) ;
   //     myCar.fillRect ( 130, 113, 130, 92 ) ;
//
   //     // Корпус
   //     myCar.setColor ( REDBROWN ) ;
   //     myCar.fillRect ( 258, 15, 122, 190 ) ;
//
   //     // Банажник
   //     myCar.setColor ( REDBROWN ) ;
   //     myCar.fillRect ( 378, 80, 57, 125 ) ;
//
   //     // порог
   //     myCar.setColor ( DARKBROWN ) ;
   //     myCar.fillRect ( 118, 205, 154, 10 ) ;
//
   //     // козырёк
   //     myCar.setColor ( Color.black ) ;
   //     myCar.drawLine ( 131, 15, 110, 30) ;
   //     myCar.drawLine ( 131, 16, 110, 31) ;
   //     myCar.drawLine ( 131, 17, 110, 32) ;
//
   //     // Ручка
   //     myCar.setColor ( Color.black ) ;
   //     myCar.drawLine ( 145, 125, 170, 125) ;
   //     myCar.drawLine ( 145, 124, 170, 124) ;
   //     myCar.drawLine ( 145, 123, 170, 123) ;
   // }
}