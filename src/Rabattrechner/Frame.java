package Rabattrechner;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
    private JPanel panel1;
    private JTextField textField1;
    private JButton Rabatt;
    private JTextField textField2;
    private JTextField textField3;
    private JLabel Betrag;
    private JLabel EndBetrag;
    private JLabel label2;
    private JSlider slider1;


    public Frame() {

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {

                JSlider js = (JSlider) e.getSource();
                System.out.println(slider1);

                slider1.setMinimum(1);
                slider1.setMaximum(5);
                slider1.setMajorTickSpacing(1);
                //slider1.setValue();

                slider1.setPaintTicks(true);
                slider1.setPaintLabels(true);

                slider1.setValue(10);

            }
        });

        Rabatt.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {


                        String zahl = textField1.getText();
                        int zahl2 = Integer.parseInt(zahl);
                        double x ;



                        if (zahl2 >= 1000) {

                            x = zahl2 * 0.05;
                            //textField2.setText(""+x);
                            textField2.setText(String.valueOf(x));
                            slider1.setValue(zahl2);

                            String text1 = "Sie erhalten einen Rabatt von 5% ";
                            label2.setText(text1);

                            double y = zahl2 - x;
                            textField3.setText("" + y);
                        }else {
                            x = zahl2;

                            textField2.setText("" );
                            textField3.setText("" + zahl2);
                            label2.setText("Sie erhalten erst ab 1000 Euro einen Rabatt");

                        }
                    }
                });



    }
    public JPanel getPanel1() {
        return panel1;
    }

}

