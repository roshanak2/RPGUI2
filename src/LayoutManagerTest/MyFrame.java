package LayoutManagerTest;

import javax.swing.*;
import java.awt.*;

public class MyFrame  extends JFrame {

    public MyFrame() {

        initGui();
        setVisible(true);
        pack();

    }
    public void  initGui(){
        this.setTitle("FlowLayoutDemo");
        this.setLayout(new BorderLayout());
        this.add(new JButton("North"), BorderLayout.NORTH);
        this.add(new JButton("West"),BorderLayout.WEST);
        this.add(new JButton("South"),BorderLayout.SOUTH);
        this.add(new JButton("East"),BorderLayout.EAST);
        this.add(new JButton("Center"),BorderLayout.CENTER);

    }
}
