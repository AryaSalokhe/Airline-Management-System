package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener{

    TextField t1,t2;
    Label l1,l2,l3;
    Button b4,b2,b3,b5;
    GridBagLayout gb1;
    GridBagConstraints gbc;
    Font f1,f2;

    public login(){
        super("login"); //heading

        setBackground(Color.blue);

        f1 = new Font("TimesRomen",Font.BOLD,15);
        f2 = new Font("TimesRomen",Font.PLAIN,15);

        gb1 = new GridBagLayout();
        gbc = new GridBagConstraints();
        setLayout(gb1);

        l1 = new Label("Username");
        l1.setFont(f1);
        l2 = new Label("Password");
        l2.setFont(f1);
        l3 = new Label("Don't have an account?");
        l3.setFont(f1);
        b5 = new Button("sign in");
        b5.setFont(f2);
        b5.setForeground(Color.blue);

        t1 = new TextField(15);
        t2 = new TextField(15);
        t2.setEchoChar('*');

        b2 = new Button("Reset");
        b2.setFont(f2);
        b3 = new Button("Submit");
        b3.setFont(f2);
        b4 = new Button("Close");
        b4.setFont(f2);

        gbc.gridx=0;
        gbc.gridy=0;
        gb1.setConstraints(l1,gbc);
        add(l1);

        gbc.gridx=2;
        gbc.gridy=0;
        gb1.setConstraints(t1,gbc);
        add(t1);

        gbc.gridx=0;
        gbc.gridy=2;
        gb1.setConstraints(l2,gbc);
        add(l2);

        gbc.gridx=2;
        gbc.gridy=2;
        gb1.setConstraints(t2,gbc);
        add(t2);

        gbc.gridx=0;
        gbc.gridy=8;
        gb1.setConstraints(b2,gbc);
        add(b2);

        gbc.gridx=2;
        gbc.gridy=8;
        gb1.setConstraints(b3,gbc);
        add(b3);

        gbc.gridx=4;
        gbc.gridy=8;
        gb1.setConstraints(b4,gbc);
        add(b4);

        gbc.gridx=2;
        gbc.gridy=18;
        gb1.setConstraints(l3,gbc);
        add(l3);

        gbc.gridx=2;
        gbc.gridy=22;
        gb1.setConstraints(b5,gbc);
        add(b5);

        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);


        setVisible(true);
        setSize(400,250);
        setLocation(400,200);

    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b2){
            t1.setText("");
            t2.setText("");
        }
        if(ae.getSource()==b4){
            System.exit(0);
        }
        if(ae.getSource()==b5){
            new SignIn();
        }
        if(ae.getSource()==b3){
            try{
                conn c1 = new conn();
                String s1 = t1.getText();
                String s2 = t2.getText();

                String str = "select * from login where username =  '"+s1+"' and password = '"+s2+"'";
                ResultSet rs = c1.s.executeQuery(str); //execute update..insert query

                if(rs.next()){
                    new MainFrame();
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null,"Invalid Login");
                }

            }catch(Exception e){

            }
        }
    }
    class SignIn extends JFrame implements ActionListener {

        TextField t1, t2;
        Label l1, l2;
        Button b4, b2, b3;
        GridBagLayout gb1;
        GridBagConstraints gbc;
        Font f1, f2;

        public SignIn() {
            super("Sign in"); //heading

            setBackground(Color.WHITE);
            f1 = new Font("TimesRomen", Font.BOLD, 15);
            f2 = new Font("TimesRomen", Font.PLAIN, 15);

            gb1 = new GridBagLayout();
            gbc = new GridBagConstraints();
            setLayout(gb1);

            l1 = new Label("Username");
            l1.setFont(f1);
            l2 = new Label("Password");
            l2.setFont(f1);

            t1 = new TextField(15);
            t2 = new TextField(15);

            b2 = new Button("Reset");
            b2.setFont(f2);
            b3 = new Button("Submit");
            b3.setFont(f2);
            b4 = new Button("Back");
            b4.setFont(f2);

            gbc.gridx = 0;
            gbc.gridy = 0;
            gb1.setConstraints(l1, gbc);
            add(l1);

            gbc.gridx = 2;
            gbc.gridy = 0;
            gb1.setConstraints(t1, gbc);
            add(t1);

            gbc.gridx = 0;
            gbc.gridy = 2;
            gb1.setConstraints(l2, gbc);
            add(l2);

            gbc.gridx = 2;
            gbc.gridy = 2;
            gb1.setConstraints(t2, gbc);
            add(t2);

            gbc.gridx = 0;
            gbc.gridy = 8;
            gb1.setConstraints(b2, gbc);
            add(b2);

            gbc.gridx = 2;
            gbc.gridy = 8;
            gb1.setConstraints(b3, gbc);
            add(b3);

            gbc.gridx = 4;
            gbc.gridy = 8;
            gb1.setConstraints(b4, gbc);
            add(b4);

            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);


            setVisible(true);
            setSize(400, 250);
            setLocation(400, 200);

        }

        public void actionPerformed(ActionEvent ae) {
            String s1 = t1.getText();
            String s2 = t2.getText();
            if (ae.getSource() == b2) {
                t1.setText("");
                t2.setText("");
            }
            if (ae.getSource() == b4) {
                new login();
            }
            if (ae.getSource() == b3) {

                try {
                    conn c = new conn();

                    String str = "Insert into login values ('" + s1 + "','" + s2 + "')";
                    c.s.executeUpdate(str);
                    this.dispose();
                    new MainFrame();


                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }
    }

    public static void main(String[]args){
        new login();
    }
}