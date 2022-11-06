package Handelskalkulation;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Frame {
    private JLabel titel;
    private JTextField bareinkaufstextField;
    private JPanel panel;
    private JLabel bareinkaufLabel;
    private JTextField bezugskostentextField;
    private JLabel bezugLabel;
    private JLabel bezugspreisLabel;
    private JTextField bezugspreistextField;
    private JTextField handelungskostentextField;
    private JLabel selbstkostenLabel;
    private JLabel handelungskostenLabel;
    private JTextField selbstkostentextField;
    private JLabel gewinnLabel;
    private JTextField gewinntextField;
    private JLabel bareinkaufspreis2Label;
    private JTextField bareinkaufspreis2textField;
    private JLabel kundenskontoLabel;
    private JTextField kundenskontotextField;
    private JLabel zielverkaufsLabel;
    private JTextField zielverkaufstextField;
    private JLabel kundenrabatLabel;
    private JTextField kundenrabatttextField;
    private JTextField listenverkaufstextField;
    private JRadioButton a1RadioButton;
    private JRadioButton a2RadioButton;
    private JLabel kundenartLabel;
    private JComboBox comboBox1;
    private JButton berechnenButton;
    private JButton testdatenAnlegenButton;
    private JButton neuButton;
    private JButton endeButton;

    private int skonto;
    private int prozent;


    public Frame(){



        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Object source = e.getSource();
                JRadioButton jb = (JRadioButton) source;

                if (jb.getText().equals(a1RadioButton)){
                    skonto= 1;
                }else skonto= 2;
            }};
        a1RadioButton.addActionListener(listener);
        a2RadioButton.addActionListener(listener);


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int index = comboBox1.getSelectedIndex();
                if (index == 0){
                    prozent =25;
                }else if (index ==1){
                    prozent=12;

                }else prozent = 5;}});


        testdatenAnlegenButton.addActionListener(new ActionListener() {

                                         @Override

                                         public void actionPerformed(ActionEvent e) {


                                             comboBox1.setSelectedIndex(2);

                                             a2RadioButton.setSelected(true);

                                             double zahl1 = 1249.00;
                                             bareinkaufstextField.setText(String.valueOf(zahl1));


                                             double zahl2 = 52.41;
                                             bezugskostentextField.setText(String.valueOf(zahl2));

                                             double zahl3 = 12.50;
                                             handelungskostentextField.setText(String.valueOf(zahl3));

                                             double zahl4 = 25;
                                             gewinntextField.setText(String.valueOf(zahl4));

                                         }

                                     }
        );


        berechnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {





                DecimalFormat df = new DecimalFormat("#0.00 €");

                String bar = bareinkaufstextField.getText();
                double bareinkauf = Double.parseDouble(bar);

                String bezugk = bezugskostentextField.getText();
                double bezugkosten = Double.parseDouble(bezugk);

                double bezugspreis = bareinkauf + bezugkosten;

                bezugspreistextField.setText(""+df.format(bezugspreis));






                String hk = handelungskostentextField.getText();
                double handelungskosten = Double.parseDouble(hk);
                double handelungsprozent= (handelungskosten * bezugspreis) /100;
                double selbstkosten = bezugspreis + handelungsprozent;


                selbstkostentextField.setText(""+df.format(selbstkosten));



                String g = gewinntextField.getText();
                double gewinn = Double.parseDouble(g);

                double gewinnProzent = (selbstkosten * gewinn)/100;
                double barverkaufspreis = gewinnProzent + selbstkosten;

                bareinkaufspreis2textField.setText(""+df.format(barverkaufspreis));

                double kundenskonto;
                if (skonto == 1){

                    kundenskonto=barverkaufspreis * 1/(100 - 1) ;
                }else kundenskonto=barverkaufspreis *2/(100-2);


                kundenskontotextField.setText(""+df.format(kundenskonto));


                double ziel = kundenskonto + barverkaufspreis;
                zielverkaufstextField.setText(""+df.format(ziel));


               double kundenRabatt ;
               if (comboBox1.getSelectedIndex() == 0){
                   kundenRabatt = ziel * 25 /(100-25);
               }else  if (comboBox1.getSelectedIndex()==1){
                   kundenRabatt = ziel * 12/(100-12);
               }else  kundenRabatt = ziel * 5/(100-5);


                kundenrabatttextField.setText(""+df.format(kundenRabatt));

                double listenverkauf = ziel + kundenRabatt;
                listenverkaufstextField.setText(""+df.format(listenverkauf));




            }

        });

        neuButton.addActionListener(new ActionListener() {

                                        @Override

                                        public void actionPerformed(ActionEvent e) {


                                            comboBox1.setSelectedIndex(0);

                                            a1RadioButton.setSelected(false);
                                            a2RadioButton.setSelected(false);


                                            bareinkaufstextField.setText("");
                                            bezugspreistextField.setText("");
                                            bezugskostentextField.setText("");
                                            handelungskostentextField.setText("");
                                            selbstkostentextField.setText("");
                                            gewinntextField.setText("");
                                            bareinkaufspreis2textField.setText("");
                                            kundenskontotextField.setText("");
                                            zielverkaufstextField.setText("");
                                            kundenrabatttextField.setText("");
                                            listenverkaufstextField.setText("");


                                        }

                                    }
        );

        endeButton.addActionListener(new ActionListener() {

                                        @Override

                                        public void actionPerformed(ActionEvent e) {

                                            System.exit(0);
                                        }

                                    }
        );


    }



    public JPanel getPanel() {
        return panel;
    }
}

