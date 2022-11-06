package Waehrungsrechner;


import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame()
    {
    setVisible(true);
    Frame mb = new Frame();
    setContentPane(mb.getPanel1());
    pack();
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

