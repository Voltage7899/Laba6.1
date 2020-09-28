package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu {
static JFrame jFrame=getFrame();
public static void main(String[] args)
{
    JPanel jPanel=new JPanel();
jFrame.add(jPanel);
    JTextArea txtArea = new JTextArea(20,20);
    jPanel.add(txtArea);



     Font font1 =new Font("Times new roman",Font.BOLD,20);
     Font font2 =new Font("Serif", Font.BOLD, 24);
     Font font3 =new Font("Calibri", Font.ITALIC, 10);

    JMenuBar jMenuBar=new JMenuBar();

    JMenu font=new JMenu("Font");
    JMenu Colour=new JMenu("Colour");

    jMenuBar.add(font);
    jMenuBar.add(Colour);

    JMenuItem Times =new JMenuItem("TimesNewRoman");
    JMenuItem Ms=new JMenuItem("MS Sans Serif");
    JMenuItem Calibri=new JMenuItem("Calibri");

    JMenuItem red=new JMenuItem("red");
    JMenuItem Green=new JMenuItem("Green");


    font.add(Times).addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
txtArea.setFont(font1);
        }
    });

    font.add(Ms).addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtArea.setFont(font2);
        }
    });

    font.add(Calibri).addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtArea.setFont(font3);
        }
    });

    Colour.add(red).addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtArea.setCaretColor(Color.red);
        }
    });
    Colour.add(Green).addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            txtArea.setCaretColor(Color.green);
        }
    });


    jFrame.setJMenuBar(jMenuBar);
    jFrame.revalidate();
}
static JFrame getFrame()
{
    JFrame jFrame=new JFrame() {};
    jFrame.setVisible(true);
    jFrame.setBounds(750,750,500,500);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    return jFrame;

}
}
