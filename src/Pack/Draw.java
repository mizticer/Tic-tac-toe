package Pack;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.JLabel;

public class Draw extends JLabel {
    private static final long serialVersionUID = 1L;


    protected void paintComponent(Graphics g) {

        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        //draw//
        g.setColor(new Color(255,230,204));
        g.fillRect(0,0,800,600);
        g.setColor(Color.BLACK);


        //pionowe
        g.drawLine(325,50,325,500);
        g.drawLine(475,50,475,500);
        //poziome
        g.drawLine(175,200,625,200);
        g.drawLine(175,350,625,350);
        //gracz
        g.setColor(Color.BLACK);
        if(Gui.player==0){
            g.drawString("Gracz: X",25,50);
        }else if(Gui.player==1){
            g.drawString("Gracz: O",25,50);
        }
        // zwyciezca
        if(Gui.gewinner==1){
            g.drawString("Wygrany: X",25,100);
        }else if(Gui.gewinner==2){
            g.drawString("Wygrany: O",25,100);
        }
        if (Gui.state[0] == 1) {
            g.drawImage(ImageLoader.imgX, 175, 50, 150, 150, null);
        } else if (Gui.state[0] == 2) {
            g.drawImage(ImageLoader.imgO, 175, 50, 150, 150, null);
        }

        if (Gui.state[1] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 50, 150, 150, null);
        } else if (Gui.state[1] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 50, 150, 150, null);
        }

        if (Gui.state[2] == 1) {
            g.drawImage(ImageLoader.imgX, 475, 50, 150, 150, null);
        } else if (Gui.state[2] == 2) {
            g.drawImage(ImageLoader.imgO, 475, 50, 150, 150, null);
        }

        // drugi poziom

        if (Gui.state[3] == 1) {
            g.drawImage(ImageLoader.imgX, 175, 200, 150, 150, null);
        } else if (Gui.state[3] == 2) {
            g.drawImage(ImageLoader.imgO, 175, 200, 150, 150, null);
        }

        if (Gui.state[4] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 200, 150, 150, null);
        } else if (Gui.state[4] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 200, 150, 150, null);
        }

        if (Gui.state[5] == 1) {
            g.drawImage(ImageLoader.imgX, 475, 200, 150, 150, null);
        } else if (Gui.state[5] == 2) {
            g.drawImage(ImageLoader.imgO, 475, 200, 150, 150, null);
        }

        // trzeci poziom

        if (Gui.state[6] == 1) {
            g.drawImage(ImageLoader.imgX, 175, 350, 150, 150, null);
        } else if (Gui.state[6] == 2) {
            g.drawImage(ImageLoader.imgO, 175, 350, 150, 150, null);
        }

        if (Gui.state[7] == 1) {
            g.drawImage(ImageLoader.imgX, 325, 350, 150, 150, null);
        } else if (Gui.state[7] == 2) {
            g.drawImage(ImageLoader.imgO, 325, 350, 150, 150, null);
        }

        if (Gui.state[8] == 1) {
            g.drawImage(ImageLoader.imgX, 475, 350, 150, 150, null);
        } else if (Gui.state[8] == 2) {
            g.drawImage(ImageLoader.imgO, 475, 350, 150, 150, null);
        }
        //poziom kreska czerwona
        if(CompileWin.numberOfLine==1){
            g.drawImage(ImageLoader.imgLine, 155, 100, 500, 50, null);
        }
        if(CompileWin.numberOfLine==2){
            g.drawImage(ImageLoader.imgLine, 155, 250, 500, 50, null);
        }
        if(CompileWin.numberOfLine==3){
            g.drawImage(ImageLoader.imgLine, 155, 400, 500, 50, null);
        }
        //pion kreska czerwona
        if(CompileWin.numberOfLine==4){
            g.drawImage(ImageLoader.imgLinePion, 225, 40, 50, 500, null);
        }
        if(CompileWin.numberOfLine==5){
            g.drawImage(ImageLoader.imgLinePion, 375, 40, 50, 500, null);
        }
        if(CompileWin.numberOfLine==6){
            g.drawImage(ImageLoader.imgLinePion, 525, 40, 50, 500, null);
        }
        //przekatna kreska czerwona
        if(CompileWin.numberOfLine==7){
            g.drawImage(ImageLoader.imgLineRight, 190, 80, 390, 390, null);
        }
        if(CompileWin.numberOfLine==8){
            g.drawImage(ImageLoader.imgLineLeft, 190, 80, 390, 390, null);
        }

        repaint();

    }
}
