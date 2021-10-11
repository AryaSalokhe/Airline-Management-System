package com.company;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class TicInfo extends JFrame
{
    JLabel label;
    JButton domestic,international;
    TicInfo()
    {
        super("TICKET");
        getContentPane().setBackground(Color.white);
        getContentPane().setLayout(null);

        label = new JLabel("How do you want to travel??");
        label.setFont(new Font("Bold",Font.PLAIN,22));
        label.setBounds(110,150,300,25);
        add(label);

        domestic = new JButton("Domestic");
        domestic.setBounds(170,200,140,30);
        add(domestic);

        international = new JButton("International");
        international.setBounds(170,240,140,30);
        add(international);

        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon("back.jpg"));
        NewLabel.setBounds(0,0,500,500);
        add(NewLabel);

        domestic.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Domestic();
            }
        });
        international.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new International();
            }
        });

        setUndecorated(true);
        setSize(500,500);
        setLocation(400,40);
        setVisible(true);
    }
    public static void main(String[]args)
    {
        new TicInfo();
    }
}

class Domestic extends JFrame {

    JLabel from, to, departure, trav, children, adult, infants, clas, mai, name, time;
    JComboBox frcb, tocb, depcb1, depcb2, depcb3, childcb, adultcb, infantscb, clascb, timecb;
    JButton book, back;
    JTextField namet;

    Domestic() {
        super("Bookings");
        getContentPane().setBackground(Color.white);
        getContentPane().setLayout(null);
        setUndecorated(true);

        name = new JLabel("Name");
        name.setForeground(new Color(255, 255, 255));
        name.setBounds(50, 80, 100, 25);
        name.setFont(new Font("Bold", Font.PLAIN, 20));
        add(name);

        mai = new JLabel("------Fill This------");
        mai.setForeground(new Color(255, 255, 255));
        mai.setBounds(390, 10, 310, 50);
        mai.setFont(new Font("Bold", Font.BOLD, 40));
        add(mai);

        from = new JLabel("From");
        from.setForeground(new Color(255, 255, 255));
        from.setBounds(50, 165, 100, 25);
        from.setFont(new Font("Bold", Font.PLAIN, 20));
        add(from);

        to = new JLabel("To");
        to.setForeground(new Color(255, 255, 255));
        to.setBounds(50, 200, 100, 25);
        to.setFont(new Font("Bold", Font.PLAIN, 20));
        add(to);

        departure = new JLabel("Departure");
        departure.setForeground(new Color(255, 255, 255));
        departure.setBounds(50, 250, 160, 25);
        departure.setFont(new Font("Bold", Font.PLAIN, 20));
        add(departure);

        time = new JLabel("Time");
        time.setForeground(new Color(255, 255, 255));
        time.setBounds(50, 340, 100, 25);
        time.setFont(new Font("Bold", Font.PLAIN, 20));
        add(time);

        trav = new JLabel("Travellers");
        trav.setForeground(new Color(255, 255, 255));
        trav.setBounds(50, 380, 100, 40);
        trav.setFont(new Font("Bold", Font.PLAIN, 20));
        add(trav);

        children = new JLabel("Childern");
        children.setForeground(new Color(255, 255, 255));
        children.setBounds(50, 430, 70, 25);
        children.setFont(new Font("Bold", Font.PLAIN, 15));
        add(children);

        adult = new JLabel("Adults");
        adult.setForeground(new Color(255, 255, 255));
        adult.setBounds(50, 470, 70, 25);
        adult.setFont(new Font("Bold", Font.PLAIN, 15));
        add(adult);

        infants = new JLabel("Infants");
        infants.setForeground(new Color(255, 255, 255));
        infants.setBounds(50, 510, 70, 25);
        infants.setFont(new Font("Bold", Font.PLAIN, 15));
        add(infants);

        clas = new JLabel("Class");
        clas.setForeground(new Color(255, 255, 255));
        clas.setBounds(50, 560, 100, 25);
        clas.setFont(new Font("Bold", Font.PLAIN, 20));
        add(clas);

        namet = new JTextField(50);
        namet.setBounds(50, 110, 200, 30);
        add(namet);

        String[] item1 = {"None", "Mumbai", "Pune", "Delhi", "Chennai", "Bangalore", "Jaipur", "Hyderabad", "Chandighar", "Dehradun", "Ahmedabad", "Goa", "Cochin"};
        frcb = new JComboBox(item1);
        frcb.setBounds(120, 165, 160, 30);
        add(frcb);

        String[] item2 = {"None", "Mumbai", "Pune", "Delhi", "Chennai", "Bangalore", "Jaipur", "Hyderabad", "Chandighar", "Dehradun", "Ahmedabad", "Goa", "Cochin"};
        tocb = new JComboBox(item2);
        tocb.setBounds(120, 200, 160, 30);
        add(tocb);

        String[] item3 = {"--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        depcb1 = new JComboBox(item3);
        depcb1.setBounds(50, 280, 60, 30);
        add(depcb1);

        String[] item4 = {"--", "January", "Februay", "March", "April", "may", "June", "July", "August", "September", "October", "November", "December"};
        depcb2 = new JComboBox(item4);
        depcb2.setBounds(120, 280, 60, 30);
        add(depcb2);

        String[] item5 = {"--", "2020", "2021", "2022"};
        depcb3 = new JComboBox(item5);
        depcb3.setBounds(195, 280, 60, 30);
        add(depcb3);

        String[] item6 = {"--", "01:15", "01:40", "02:30", "04:20", "06:15", "08:30", "10:40", "13:10", "17:30", "20:10", "22:30", "23:10"};
        timecb = new JComboBox(item6);
        timecb.setBounds(110, 340, 100, 25);
        add(timecb);

        String[] item7 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        childcb = new JComboBox(item7);
        childcb.setBounds(130, 430, 70, 30);
        add(childcb);

        String[] item8 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        adultcb = new JComboBox(item8);
        adultcb.setBounds(130, 470, 70, 30);
        add(adultcb);

        String[] item9 = {"0", "1", "2", "3", "4", "5"};
        infantscb = new JComboBox(item9);
        infantscb.setBounds(130, 510, 70, 30);
        add(infantscb);

        String[] item10 = {"Economy", "Premium Economy", "Business"};
        clascb = new JComboBox(item10);
        clascb.setBounds(120, 560, 200, 30);
        add(clascb);

        book = new JButton("Book");
        book.setBounds(50, 610, 90, 30);
        book.setBackground(Color.LIGHT_GRAY);
        add(book);

        back = new JButton("Back");
        back.setBounds(150, 610, 90, 30);
        back.setBackground(Color.LIGHT_GRAY);
        add(back);

        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon("pass1.jpg"));
        NewLabel.setBounds(0, 0, 1000, 660);
        add(NewLabel);

        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ticket();
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TicInfo();
            }
        });
        setSize(1000, 660);
        setLocation(200,5);
        setVisible(true);
    }
}



class International extends JFrame {
    JLabel from, to, departure, trav, children, adult, infants, clas, mai, name, time;
    JComboBox frcb, tocb, depcb1, depcb2, depcb3, childcb, adultcb, infantscb, clascb, timecb;
    JButton book, back;
    JTextField namet;

    International() {
        super("Bookings");
        getContentPane().setBackground(Color.white);
        getContentPane().setLayout(null);
        setUndecorated(true);

        name = new JLabel("Name");
        name.setForeground(new Color(255, 255, 255));
        name.setBounds(50, 80, 100, 25);
        name.setFont(new Font("Bold", Font.PLAIN, 20));
        add(name);

        mai = new JLabel("------Fill This------");
        mai.setForeground(new Color(255, 255, 255));
        mai.setBounds(390, 10, 310, 50);
        mai.setFont(new Font("Bold", Font.BOLD, 40));
        add(mai);

        from = new JLabel("From");
        from.setForeground(new Color(255, 255, 255));
        from.setBounds(50, 165, 100, 25);
        from.setFont(new Font("Bold", Font.PLAIN, 20));
        add(from);

        to = new JLabel("To");
        to.setForeground(new Color(255, 255, 255));
        to.setBounds(50, 200, 100, 25);
        to.setFont(new Font("Bold", Font.PLAIN, 20));
        add(to);

        departure = new JLabel("Departure");
        departure.setForeground(new Color(255, 255, 255));
        departure.setBounds(50, 250, 160, 25);
        departure.setFont(new Font("Bold", Font.PLAIN, 20));
        add(departure);

        time = new JLabel("Time");
        time.setForeground(new Color(255, 255, 255));
        time.setBounds(50, 340, 100, 25);
        time.setFont(new Font("Bold", Font.PLAIN, 20));
        add(time);

        trav = new JLabel("Travellers");
        trav.setForeground(new Color(255, 255, 255));
        trav.setBounds(50, 380, 100, 40);
        trav.setFont(new Font("Bold", Font.PLAIN, 20));
        add(trav);

        children = new JLabel("Childern");
        children.setForeground(new Color(255, 255, 255));
        children.setBounds(50, 430, 70, 25);
        children.setFont(new Font("Bold", Font.PLAIN, 15));
        add(children);

        adult = new JLabel("Adults");
        adult.setForeground(new Color(255, 255, 255));
        adult.setBounds(50, 470, 70, 25);
        adult.setFont(new Font("Bold", Font.PLAIN, 15));
        add(adult);

        infants = new JLabel("Infants");
        infants.setForeground(new Color(255, 255, 255));
        infants.setBounds(50, 510, 70, 25);
        infants.setFont(new Font("Bold", Font.PLAIN, 15));
        add(infants);

        clas = new JLabel("Class");
        clas.setForeground(new Color(255, 255, 255));
        clas.setBounds(50, 560, 100, 25);
        clas.setFont(new Font("Bold", Font.PLAIN, 20));
        add(clas);

        namet = new JTextField(50);
        namet.setBounds(50, 110, 200, 30);
        add(namet);

        String[] item1 = {"None", "Mumbai", "New York", "California", "Frankfurt", "Geneva", "sydeny", "London", "Paris", "Spain", "Tokyo", "Singapore", "Paris"};
        frcb = new JComboBox(item1);
        frcb.setBounds(120, 165, 160, 30);
        add(frcb);

        String[] item2 = {"None", "Mumbai", "New York", "California", "Frankfurt", "Geneva", "sydeny", "London", "Paris", "Spain", "Tokyo", "Singapore", "Paris"};
        tocb = new JComboBox(item2);
        tocb.setBounds(120, 200, 160, 30);
        add(tocb);

        String[] item3 = {"--", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        depcb1 = new JComboBox(item3);
        depcb1.setBounds(50, 280, 60, 30);
        add(depcb1);

        String[] item4 = {"--", "January", "Februay", "March", "April", "may", "June", "July", "August", "September", "October", "November", "December"};
        depcb2 = new JComboBox(item4);
        depcb2.setBounds(120, 280, 60, 30);
        add(depcb2);

        String[] item5 = {"--", "2020", "2021", "2022"};
        depcb3 = new JComboBox(item5);
        depcb3.setBounds(195, 280, 60, 30);
        add(depcb3);

        String[] item6 = {"--", "01:15", "01:40", "02:30", "04:20", "06:15", "08:30", "10:40", "13:10", "17:30", "20:10", "22:30", "23:10"};
        timecb = new JComboBox(item6);
        timecb.setBounds(110, 340, 100, 25);
        add(timecb);

        String[] item7 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        childcb = new JComboBox(item7);
        childcb.setBounds(130, 430, 70, 30);
        add(childcb);

        String[] item8 = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        adultcb = new JComboBox(item8);
        adultcb.setBounds(130, 470, 70, 30);
        add(adultcb);

        String[] item9 = {"0", "1", "2", "3", "4", "5"};
        infantscb = new JComboBox(item9);
        infantscb.setBounds(130, 510, 70, 30);
        add(infantscb);

        String[] item10 = {"Economy", "Premium Economy", "Business"};
        clascb = new JComboBox(item10);
        clascb.setBounds(120, 560, 200, 30);
        add(clascb);

        book = new JButton("Book");
        book.setBounds(50, 600, 90, 30);
        book.setBackground(Color.LIGHT_GRAY);
        add(book);

        back = new JButton("Back");
        back.setBounds(150, 600, 90, 30);
        back.setBackground(Color.LIGHT_GRAY);
        add(back);

        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon("pass1.jpg"));
        NewLabel.setBounds(0, 0, 1000, 660);
        add(NewLabel);

        book.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Ticket();
            }
        });
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TicInfo();
            }
        });
        setSize(1000, 660);
        setLocation(200, 5);
        setVisible(true);
    }
}
class Ticket extends JFrame
{
    JLabel img,pl1,pl2,l1,l2,l3;
    Ticket()
    {
        super("Confirmed");
        setUndecorated(true);
        setLayout(null);

        l1 = new JLabel("Booking Confirmed");
        l1.setFont(new Font("Bold",Font.BOLD,60));
        l1.setBounds(150,60,620,100);
        add(l1);

        l2 = new JLabel("Have a safe flight and Happy Journey!!!");
        l2.setFont(new Font("Bold",Font.BOLD,30));
        l2.setBounds(200,190,600,50);
        add(l2);

        l3 = new JLabel("Thank You!!");
        l3.setFont(new Font("Bold",Font.BOLD,28));
        l3.setBounds(350,300,180,60);
        add(l3);

        pl1 = new JLabel("");
        pl1.setIcon(new ImageIcon("planeicon1.png"));
        pl1.setBounds(750,30,170,150);
        add(pl1);

        pl2 = new JLabel("");
        pl2.setIcon(new ImageIcon("planeicon2.png"));
        pl2.setBounds(520,280,100,100);
        add(pl2);

        img = new JLabel("");
        img.setIcon(new ImageIcon("planebg.jpg"));
        img.setBounds(0,0,900,500);
        add(img);

        setSize(900,500);
        setLocation(200,60);
        setVisible(true);
    }
}