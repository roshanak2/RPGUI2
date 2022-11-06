package Blutalkoholrechner;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame()
    {
        setVisible(true);
        Frame mb = new Frame();
        setContentPane(mb.getRootPanel());
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}