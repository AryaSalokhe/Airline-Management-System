package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class student_registration extends JFrame{

    JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;

    student_registration (){
        setTitle("Student Registration");
        getContentPane().setBackground(Color.MAGENTA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel AddCustomer = new JLabel("Student Registration Form");
        AddCustomer.setForeground(Color.WHITE);
        AddCustomer.setFont(new Font("Tahoma", Font.PLAIN, 30));
        AddCustomer.setBounds(60, 25, 442, 35);
        add(AddCustomer);

        JLabel Flightcode = new JLabel("First name");
        Flightcode.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Flightcode.setBounds(60, 80, 150, 27);
        add(Flightcode);

        tf7 = new JTextField();
        tf7.setBounds(200, 80, 150, 27);
        tf7.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(tf7);

        JLabel Passportno = new JLabel("Middle name");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Passportno.setBounds(60, 130, 150, 27);
        add(Passportno);

        tf1 = new JTextField();
        tf1.setBounds(200, 130, 150, 27);
        tf1.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(tf1);

        JLabel Pnrno = new JLabel("Last name");
        Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Pnrno.setBounds(60, 180, 150, 27);
        add(Pnrno);

        tf2 = new JTextField();
        tf2.setBounds(200, 180, 150, 27);
        tf2.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(tf2);

        JLabel Address = new JLabel("Gender");
        Address.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Address.setBounds(60, 230, 150, 27);
        add(Address);

        JRadioButton male = new JRadioButton("MALE");
        male.setBackground(Color.WHITE);
        male.setFont(new Font("Tahoma", Font.PLAIN, 13));
        male.setBounds(200, 230, 70, 27);
        add(male);

        JRadioButton female = new JRadioButton("FEMALE");
        female.setBackground(Color.WHITE);
        female.setFont(new Font("Tahoma", Font.PLAIN, 13));
        female.setBounds(280, 230, 70, 27);
        add(female);

        JLabel Nationality = new JLabel("Date of Birth");
        Nationality.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Nationality.setBounds(60, 280, 150, 27);
        add(Nationality);

        tf4 = new JTextField();
        tf4.setBounds(200, 280, 150, 27);
        tf4.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(tf4);

        JLabel Name = new JLabel("Mobile number");
        Name.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Name.setBounds(60, 330, 150, 27);
        add(Name);

        tf5 = new JTextField();
        tf5.setBounds(200, 330, 150, 27);
        tf5.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(tf5);

        JLabel Phno = new JLabel("Address");
        Phno.setFont(new Font("Tahoma", Font.PLAIN, 18));
        Phno.setBounds(60, 380, 150, 27);
        add(Phno);

        tf6 = new JTextField();
        tf6.setBounds(200, 380, 150, 27);
        tf6.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(tf6);

        JButton save = new JButton("SAVE");
        save.setBounds(200, 430, 145, 30);
        save.setFont(new Font("Tahoma", Font.BOLD, 16));
        save.setBackground(Color.BLACK);
        save.setForeground(Color.WHITE);
        add(save);

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Registartion successful");
                setVisible(false);
            }
        });

        setSize(550,550);
        setVisible(true);
    }

    public static void main(String[] args){
        new student_registration();
    }
}
