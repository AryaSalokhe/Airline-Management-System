package com.company;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

    public class Cancel extends JFrame{

        private JTextField textField,textField_1,textField_2,textField_3,textField_4;

        public static void main(String[] args) {
            new Cancel();
        }

        public Cancel() {
            initialize();
        }

        private void initialize() {
            setTitle("CANCELLATION");
            getContentPane().setBackground(Color.WHITE);
            setBounds(100, 100, 800, 450);
            setUndecorated(true);
            setLayout(null);

            JLabel NewLabel = new JLabel("");
            NewLabel.setIcon(new ImageIcon("flight_info.jpg"));
            NewLabel.setBounds(0,0,800,450);
            add(NewLabel);

            JLabel Cancellation = new JLabel("CANCELLATION");
            Cancellation.setFont(new Font("Tahoma", Font.PLAIN, 31));
            Cancellation.setForeground(Color.red);
            Cancellation.setBounds(185, 24, 259, 38);
            NewLabel.add(Cancellation);

            ImageIcon i1 = new ImageIcon("cancel.png");
            Image i2 = i1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            JLabel NewLabel1 = new JLabel(i3);
	        NewLabel1.setBounds(470, 100, 250, 250);
            NewLabel.add(NewLabel1);

            JLabel PassengerNo = new JLabel("PNR_NO");
            PassengerNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
            PassengerNo.setBounds(60, 100, 132, 26);
            NewLabel.add(PassengerNo);

            JLabel CancellationNo = new JLabel("CANCELLATION NO");
            CancellationNo.setFont(new Font("Tahoma", Font.PLAIN, 17));
            CancellationNo.setBounds(60, 150, 150, 27);
            NewLabel.add(CancellationNo);

            JLabel CancellationDate = new JLabel("CANCELLATION DATE");
            CancellationDate.setFont(new Font("Tahoma", Font.PLAIN, 17));
            CancellationDate.setBounds(60, 200, 180, 27);
            NewLabel.add(CancellationDate);

            JLabel Flightcode = new JLabel("FLIGHT_CODE");
            Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Flightcode.setBounds(60, 250, 150, 27);
            NewLabel.add(Flightcode);

            /*JLabel Flightcode = new JLabel("FLIGHT_CODE");
            Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Flightcode.setBounds(60, 300, 150, 27);
            add(Flightcode);*/

            JButton Cancel = new JButton("CANCEL");
            Cancel.setFont(new Font("Tahoma", Font.PLAIN, 14));
            Cancel.setBackground(Color.BLACK);
            Cancel.setForeground(Color.WHITE);
            Cancel.setBounds(250, 350, 150, 30);
            NewLabel.add(Cancel);

            textField = new JTextField();
            textField.setBounds(250, 100, 150, 27);
            textField.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(textField);

            textField_1 = new JTextField();
            textField_1.setBounds(250, 150, 150, 27);
            textField_1.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(textField_1);

            textField_2 = new JTextField();
            textField_2.setBounds(250, 200, 150, 27);
            textField_2.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(textField_2);

            textField_3 = new JTextField();
            textField_3.setBounds(250, 250, 150, 27);
            textField_3.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(textField_3);

            /*textField_4 = new JTextField();
            textField_4.setBounds(250, 300, 150, 27);
            textField_4.setFont(new Font("Tahoma", Font.BOLD, 16));
            add(textField_4);*/

            Cancel.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){

                    String pnr_no = textField.getText();
                    String cancellation_no = textField_1.getText();
                    String cancellation_date = textField_2.getText();
                    String flight_code = textField_3.getText();


                    try{
                        conn c = new conn();
                        String str = "INSERT INTO cancellation values('"+pnr_no+"', '"+cancellation_no+"', '"+cancellation_date+"','"+flight_code+"')";

                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Ticket Canceled");
                        setVisible(false);

                    }catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            setVisible(true);
            //setLocation(400,200);
        }
    }