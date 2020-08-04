package Pack;
import sun.awt.CharsetString;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {

    JFrame jf;
    Draw draw;
    static JButton btn[]=new JButton[9];
    JButton btnReset;
    static int state[]=new int[9];
    static int player=0;
    static int gewinner=0;
    public Gui(){
        jf=new JFrame();
        jf.setSize(800,600);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setResizable(false);
        jf.setTitle("Kółko i krzyżyk");

        for(int i =0; i<btn.length;i++)
        {
            btn[i] = new JButton();
            btn[i].setVisible(true);
            btn[i].addActionListener(new ActionHandler());
            btn[i].setFocusPainted(false);
            btn[i].setContentAreaFilled(false);
            btn[i].setBorder(null);
            jf.add(btn[i]);

        }
        ButtonPlacement.place();
        btnReset=new JButton("Reset");
        btnReset.setBounds(675,500,100,40);
        btnReset.setVisible(true);
        btnReset.setBackground(new Color(51,102,153));
        btnReset.setForeground(Color.WHITE);
        btnReset.setFocusPainted(false);
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Funktion.reset();
            }
        });
        jf.add(btnReset);
        draw=new Draw();
        draw.setBounds(0,0,800,600);
        draw.setVisible(true);
        jf.add(draw);
        jf.setVisible(true);
    }
}
