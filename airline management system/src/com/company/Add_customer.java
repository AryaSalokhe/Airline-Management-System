package com.company;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

  public class Add_customer extends JFrame{

      JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;

        public Add_customer(){
            super("CUSTOMER DETAILS");
            getContentPane().setBackground(Color.WHITE);
            //setUndecorated(true);

            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            setSize(860,550);
            getContentPane().setLayout(null);

            JLabel NewLabel = new JLabel("");
            NewLabel.setIcon(new ImageIcon("flight_info.jpg"));
            NewLabel.setBounds(0,0,860,550);
            add(NewLabel);

            JLabel Flightcode = new JLabel("FLIGHT CODE");
            Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 18));
            Flightcode.setBounds(60, 30, 150, 27);
            NewLabel.add(Flightcode);

            tf7 = new JTextField();
            tf7.setBounds(200, 30, 150, 27);
            tf7.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(tf7);

            JLabel Passportno = new JLabel("PASSPORT NO");
            Passportno.setFont(new Font("Tahoma", Font.PLAIN, 18));
            Passportno.setBounds(60, 80, 150, 27);
            NewLabel.add(Passportno);

            tf1 = new JTextField();
            tf1.setBounds(200, 80, 150, 27);
            tf1.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(tf1);

            JButton save = new JButton("SAVE");
            save.setBounds(200, 420, 145, 30);
            save.setFont(new Font("Tahoma", Font.BOLD, 16));
            save.setBackground(Color.BLACK);
            save.setForeground(Color.WHITE);
            NewLabel.add(save);

            JLabel Pnrno = new JLabel("PNR NO");
            Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 18));
            Pnrno.setBounds(60, 120, 150, 27);
            NewLabel.add(Pnrno);

            tf2 = new JTextField();
            tf2.setBounds(200, 120, 150, 27);
            tf2.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(tf2);

            JLabel Address = new JLabel("ADDRESS");
            Address.setFont(new Font("Tahoma", Font.PLAIN, 18));
            Address.setBounds(60, 170, 150, 27);
            NewLabel.add(Address);

            tf3 = new JTextField();
            tf3.setBounds(200, 170, 150, 27);
            tf3.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(tf3);

            JLabel Nationality = new JLabel("NATIONALITY");
            Nationality.setFont(new Font("Tahoma", Font.PLAIN, 18));
            Nationality.setBounds(60, 220, 150, 27);
            NewLabel.add(Nationality);

            tf4 = new JTextField();
            tf4.setBounds(200, 220, 150, 27);
            tf4.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(tf4);

            JLabel Name = new JLabel("NAME");
            Name.setFont(new Font("Tahoma", Font.PLAIN, 18));
            Name.setBounds(60, 270, 150, 27);
            NewLabel.add(Name);

            tf5 = new JTextField();
            tf5.setBounds(200, 270, 150, 27);
            tf5.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(tf5);

            JLabel Gender = new JLabel("GENDER");
            Gender.setFont(new Font("Tahoma", Font.PLAIN, 18));
            Gender.setBounds(60, 320, 150, 27);
            NewLabel.add(Gender);

            JRadioButton male = new JRadioButton("MALE");
            male.setBackground(Color.WHITE);
            male.setFont(new Font("Tahoma", Font.PLAIN, 13));
            male.setBounds(200, 320, 70, 27);
            NewLabel.add(male);

            JRadioButton female = new JRadioButton("FEMALE");
            female.setBackground(Color.WHITE);
            female.setFont(new Font("Tahoma", Font.PLAIN, 13));
            female.setBounds(280, 320, 70, 27);
            NewLabel.add(female);

            JLabel Phno = new JLabel("PH NO");
            Phno.setFont(new Font("Tahoma", Font.PLAIN, 18));
            Phno.setBounds(60, 370, 150, 27);
            NewLabel.add(Phno);

            tf6 = new JTextField();
            tf6.setBounds(200, 370, 150, 27);
            tf6.setFont(new Font("Tahoma", Font.BOLD, 16));
            NewLabel.add(tf6);

            setVisible(true);

            JLabel AddCustomer = new JLabel("ADD CUSTOMER DETAILS");
            AddCustomer.setForeground(Color.RED);
            AddCustomer.setFont(new Font("Tahoma", Font.PLAIN, 30));
            AddCustomer.setBounds(410, 24, 442, 35);
            NewLabel.add(AddCustomer);

            ImageIcon i1 = new ImageIcon("emp.png");
            JLabel image = new JLabel(i1);
            image.setBounds(450,80,280,410);
            NewLabel.add(image);


            save.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String passport_No = tf1.getText();
                    String pnr_no = tf2.getText();
                    String address =  tf3.getText();
                    String nationality = tf4.getText();
                    String name = tf5.getText();
                    String fl_code = tf7.getText();

                    String gender = null;
                    String ph_no = tf6.getText();

                    if(male.isSelected()){
                        gender = "male";

                    }else if(female.isSelected()){
                        gender = "female";
                    }

                    try {
                        conn c = new conn();
                        String str = "INSERT INTO passenger values( '"+pnr_no+"', '"+address+"', '"+nationality+"','"+name+"', '"+gender+"', '"+ph_no+"','"+passport_No+"', '"+fl_code+"')";

                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"Customer Added");
                        setVisible(false);

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            });

            setVisible(true);
            setLocation(100,30);

        }

        public static void main(String[] args){
            new Add_customer();
        }
    }
