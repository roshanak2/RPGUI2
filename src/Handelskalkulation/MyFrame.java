package Handelskalkulation;

import javax.swing.*;

public class MyFrame extends JFrame {
    public MyFrame()
    {
        setVisible(true);
        Frame mc = new Frame();
        setContentPane(mc.getPanel());
        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
