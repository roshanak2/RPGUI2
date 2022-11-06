package Waehrungsrechner;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;


public class Frame {
    private JPanel panel1;
    private JPanel ueberPanel;
    private JLabel titel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton dollerButton;
    private JButton yenButton;
    private JButton pfundButton;
    private JLabel btragX;
    private JLabel betragEuro;

    public Frame(){

        dollerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String zahl = textField2.getText();
                double zahl2 = Double.parseDouble(zahl);

                double x ;
                x = zahl2 * 1.5814;
                NumberFormat n = NumberFormat.getInstance();
                n.setMaximumFractionDigits(2);

                if (zahl2!=0)
                {
                    textField1.setText(String.valueOf(n.format(x)));
                    btragX.setText("Betrag in Doller");
                }
            }
        });

        yenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String zahl = textField2.getText();
                double zahl2 = Double.parseDouble(zahl);
                double x ;

                x = zahl2 * 157.3839;
                NumberFormat n = NumberFormat.getInstance();
                n.setMaximumFractionDigits(2);

                if (zahl2!=0)
                {
                    textField1.setText(String.valueOf(n.format(x)));
                    btragX.setText("Betrag in Yen");
                }
            }
        });

        pfundButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String zahl = textField2.getText();
                double zahl2 = Double.parseDouble(zahl);
                double x ;

                x = zahl2 * 0.7954;
                NumberFormat n = NumberFormat.getInstance();
                n.setMaximumFractionDigits(2);

                if (zahl2!=0)
                {
                    textField1.setText(String.valueOf(n.format(x)));
                    btragX.setText("Betrag in Pfund");
                }
            }
        });

    }
    public JPanel getPanel1() {
        return panel1;
    }
}

