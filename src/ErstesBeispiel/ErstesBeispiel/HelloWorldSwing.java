package ErstesBeispiel.ErstesBeispiel;

import javax.swing.*;

public class HelloWorldSwing {
    public static void main(String[] args) {

        JFrame frame = new JFrame("HelloWorld");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 500);

        JLabel label = new JLabel("Hello World LABEL");
        frame.add(label);

        //frame.pack();
        frame.setVisible(true);
    }
}
