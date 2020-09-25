package com.company;

import javafx.embed.swing.JFXPanel;

import java.awt.*;

public class MyCar extends JFXPanel {

    public final int FIGUREHEIGHT = 600;
    public final int FIGUREWIDTH  = 800;

    Color REDBROWN = new Color ( 182, 1, 0) ;
    Color DARKBROWN = new Color (8, 6, 12) ;
    Color LTBLUE = new Color ( 35, 206, 255 ) ;
    Color DARKGOLD = new Color ( 240, 181, 16) ;

    public void paint (Graphics myCar) {
        // Фон
        myCar.setColor ( Color.GRAY ) ;
        myCar.fillRect ( 0, 0, FIGUREWIDTH, FIGUREHEIGHT ) ;

        myCar.setColor(Color.WHITE);
        myCar.drawLine(800, 300, 0, 300);

        // Переднее колесо
        myCar.setColor ( Color.black ) ;
        myCar.fillOval ( 20, 170, 100, 100 ) ;
        myCar.setColor ( Color.white ) ;
        myCar.fillOval ( 30, 180, 80, 80 ) ;
        myCar.setColor ( Color.black ) ;
        myCar.drawOval ( 40, 190, 60, 60 ) ;

        // Заднее колесо
        myCar.setColor ( Color.black ) ;
        myCar.fillOval ( 270, 170, 100, 100 ) ;
        myCar.setColor ( Color.white ) ;
        myCar.fillOval ( 280, 180, 80, 80 ) ;
        myCar.setColor ( Color.black ) ;
        myCar.drawOval ( 290, 190, 60, 60 ) ;

        // Капот
        myCar.setColor ( DARKBROWN ) ;
        myCar.fillRect ( 10, 113, 122, 12 ) ;
        myCar.setColor ( REDBROWN ) ;
        myCar.fillRect ( 10, 123, 122, 82 ) ;

        // Фара
        myCar.setColor ( DARKGOLD ) ;
        myCar.fillOval ( 10, 105, 10, 10 ) ;

        //  Лобовое
        myCar.setColor ( LTBLUE ) ;
        myCar.fillRect ( 130, 15, 130, 100 ) ;

        // Дверь
        myCar.setColor ( REDBROWN ) ;
        myCar.fillRect ( 130, 113, 130, 92 ) ;

        // Корпус
        myCar.setColor ( REDBROWN ) ;
        myCar.fillRect ( 258, 15, 122, 190 ) ;

        // Банажник
        myCar.setColor ( REDBROWN ) ;
        myCar.fillRect ( 378, 80, 57, 125 ) ;

        // порог
        myCar.setColor ( DARKBROWN ) ;
        myCar.fillRect ( 118, 205, 154, 10 ) ;

        // козырёк
        myCar.setColor ( Color.black ) ;
        myCar.drawLine ( 131, 15, 110, 30) ;
        myCar.drawLine ( 131, 16, 110, 31) ;
        myCar.drawLine ( 131, 17, 110, 32) ;

        // Ручка
        myCar.setColor ( Color.black ) ;
        myCar.drawLine ( 145, 125, 170, 125) ;
        myCar.drawLine ( 145, 124, 170, 124) ;
        myCar.drawLine ( 145, 123, 170, 123) ;
    }
}