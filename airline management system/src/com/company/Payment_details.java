package com.company;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

    public class Payment_details extends JFrame{

        JTextField textField;
        JTable table;
        JLabel Sector;
        JLabel pnr_no,paid_amount,pay_date,cheque_no,card_no,phone_no;

        public static void main(String[] args) {
            new Payment_details();
        }

        public Payment_details(){
            initialize();
        }

        private void initialize(){
            setTitle("PAYMENT_DETAILS");
            getContentPane().setBackground(Color.WHITE);
            setSize(860,600);
            //setUndecorated(true);
            setLayout(null);

            JLabel NewLabel = new JLabel("");
            NewLabel.setIcon(new ImageIcon("flight_info.jpg"));
            NewLabel.setBounds(0,0,860,600);
            add(NewLabel);

            JLabel Fcode = new JLabel("PNR NO");
            Fcode.setFont(new Font("Tahoma", Font.PLAIN, 18));
            Fcode.setForeground(Color.BLUE);
            Fcode.setBounds(103, 164, 150, 14);
            NewLabel.add(Fcode);

            textField = new JTextField();
            textField.setBounds(200, 160, 150, 26);
            textField.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(textField);

            table = new JTable();
            //table.setBackground(Color.BLACK);
            table.setBounds(45, 329, 766, 87);
            NewLabel.add(table);

            JScrollPane pane = new JScrollPane(table);
            pane.setBounds(45,345,766,200);
            pane.setBackground(Color.white);
            NewLabel.add(pane);

            JButton Show = new JButton("SHOW");
            Show.setFont(new Font("Tahoma", Font.PLAIN, 17));
            Show.setBackground(Color.BLACK);
            Show.setForeground(Color.WHITE);
            Show.setBounds(225, 210, 100, 26);
            NewLabel.add(Show);

            Sector = new JLabel("PAYMENT DETAILS");
            Sector.setForeground(Color.red);
            Sector.setFont(new Font("Tahoma", Font.PLAIN, 31));
            Sector.setBounds(51, 40, 300, 49);
            NewLabel.add(Sector);

            pnr_no = new JLabel("PNR_NO");
            pnr_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            pnr_no.setBounds(84, 309, 108, 26);
            NewLabel.add(pnr_no);

            paid_amount = new JLabel("PAID_AMT");
            paid_amount.setFont(new Font("Tahoma", Font.PLAIN, 17));
            paid_amount.setBounds(183, 315, 85, 14);
            NewLabel.add(paid_amount);

            pay_date = new JLabel("PAY_DATE");
            pay_date.setFont(new Font("Tahoma", Font.PLAIN, 17));
            pay_date.setBounds(322, 310, 101, 24);
            NewLabel.add(pay_date);

            cheque_no = new JLabel("CHEQUE_NO");
            cheque_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            cheque_no.setBounds(455, 315, 114, 14);
            NewLabel.add(cheque_no);

	        JLabel label = new JLabel("");
	        label.setIcon(new ImageIcon("payment.png"));
	        label.setBounds(425, 15, 239, 272);
            NewLabel.add(label);

            card_no = new JLabel("CARD_NO");
            card_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            card_no.setBounds(602, 313, 101, 19);
            NewLabel.add(card_no);

            phone_no = new JLabel("PHONE_NO");
            phone_no.setFont(new Font("Tahoma", Font.PLAIN, 17));
            phone_no.setBounds(712, 310, 86, 24);
            NewLabel.add(phone_no);

            setVisible(true);

            Show.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){

                    try {
                        String code  = textField.getText();

                        conn c = new conn();
                        String str = "select pnr_no,payment_amt,payment_date,cheque_no,card_n,ph_no from payment where pnr_no = '"+code+"'";

                        ResultSet rs = c.s.executeQuery(str);

                        table.setModel(DbUtils.resultSetToTableModel(rs));

                    }catch(SQLException e) {
                        e.printStackTrace();
                    }
                }
            });

            setSize(860,600);
            setLocation(100,20);
            setVisible(true);

        }
    }

