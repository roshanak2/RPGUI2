package Handwerker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class Frame {
    private JPanel panel2;
    private JPanel panel1;
    private JLabel eingabe;
    private JComboBox comboBox1;
    private JRadioButton arbeitszeitRadioButton;
    private JRadioButton überstundeRadioButton;
    private JTextField textField11;
    private JTextField textField22;
    private JTextField textField33;
    private JLabel netto;
    private JLabel steuer;
    private JLabel bruttol;
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton rechnenButton;
    private JButton testButton;


    private int zeit1 = 1;
    private int rolle ;

    public Frame(){



        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Object source = e.getSource();
                JRadioButton jb = (JRadioButton) source;

                if (jb.getText().equals("Arbeitszeit")){
                    zeit1=1;
                }else zeit1=2;
            }};
        arbeitszeitRadioButton.addActionListener(listener);
        überstundeRadioButton.addActionListener(listener);


        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int index = comboBox1.getSelectedIndex();
                if (index == 0){
                    rolle =20;
                }else if (index ==1){
                    rolle=40;

                }else rolle = 60;}});




        rechnenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String zahl11 = textField1.getText();
                double zahl1 = Double.parseDouble(zahl11);

                String zahl22 = textField2.getText();
                double zahl2 = Double.parseDouble(zahl22);

                String zahl33 = textField3.getText();
                double zahl3 = Double.parseDouble(zahl33);

                double netto =0;
                double brutto=0;
                double steuer=0;

                double x =0;
                DecimalFormat df = new DecimalFormat("#0.00 €");
                //textField33.setText("" + df.format(z3));


                if (zeit1 == 1) {
                    x= zahl1 * rolle;
                } else x = zahl1 * (rolle+rolle/2);
                brutto=x+zahl2+zahl3*0.5;
                netto=brutto/1.19;
                steuer=brutto-netto;
                textField11.setText(""+df.format(netto));
                textField22.setText(""+df.format(steuer));
                textField33.setText(""+df.format(brutto));
            }

    });

        testButton.addActionListener(new ActionListener() {

                                         @Override

                                         public void actionPerformed(ActionEvent e) {

                                           testMethode();


                                         }

                                     }
        );
}

    public void testMethode(){

        comboBox1.setSelectedIndex(1);

        arbeitszeitRadioButton.setSelected(true);

        double zahl1 = 40;
        textField1.setText(String.valueOf(zahl1));


        double zahl2 = 0;
        textField2.setText(String.valueOf(zahl2));

        double zahl3 = 0;
        textField3.setText(String.valueOf(zahl3));


}


    public JPanel getPanel() {
        return panel;
    }}


