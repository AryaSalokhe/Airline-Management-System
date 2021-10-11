package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Special_offers extends JFrame {

    public Special_offers(){
        super("SPECIAL OFFERS");
        getContentPane().setBackground(Color.white);
        //setUndecorated(true);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon("sp.jpg"));
        NewLabel.setBounds(0,0,900,700);
        add(NewLabel);

        JLabel label = new JLabel("------------Special Offers------------");
        label.setFont(new Font("Tahoma",Font.PLAIN,31));
        label.setForeground(Color.red);
        label.setBounds(50,20,575,38);
        NewLabel.add(label);

        ImageIcon sp1 = new ImageIcon("sp1.jpg");
        JButton image1 = new JButton(sp1);
        image1.setBounds(0,80,376,245);
        NewLabel.add(image1);

        ImageIcon sp2 = new ImageIcon("sp2.jpg");
        JButton image2 = new JButton(sp2);
        image2.setBounds(400,80,376,245);
        NewLabel.add(image2);

        ImageIcon sp3 = new ImageIcon("sp3.jpg");
        JButton image3 = new JButton(sp3);
        image3.setBounds(0,380,376,245);
        NewLabel.add(image3);

        ImageIcon sp4 = new ImageIcon("sp4.jpg");
        JButton image4 = new JButton(sp4);
        image4.setBounds(400,380,422,221);
        NewLabel.add(image4);

        image1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new image1();
            }
        });
        image2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new image2();
            }
        });
        image3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new image3();
            }
        });
        image4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new image4();
            }
        });

        setSize(900,700);
        setVisible(true);

    }

    class image1 extends JFrame {

        image1(){
            super("image1");
            getContentPane().setBackground(Color.white);
            getContentPane().setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextArea textArea = new JTextArea(("Customer Benefits:-\n" +
                    "\n" +
                    "1)Travo451- gives customer promo discount for Rs. 451/- instantly on one passenger.\n" +
                    "2)Travo off upto Rs. 5000/- is instant discounts on every single passenger upto 9 passengers in one booking.\n" +
                    "3)Sign up and get more amazing deals and instant off on your purchase.\n" +
                    "\nTerms and conditions:-\n" +
                    "\n" +
                    "1)The offers cannot be merged or combined with other offers available at the checkout.\n" +
                    "2)Deals starting with our code are for new and existing customers.\n" +
                    "3)Customer with this account gets other amazing deals and travo cashback in their wallet, also in their bank accounts directly after the checkout.\n" +
                    "4)Wereserves the right to change, add or negate the offers at any time without priot notice." +
                    "\nAPPLICABLE ON\n" +
                    "Domestic Flights\n" +
                    "\n" +
                    "VALIDITY\n" +
                    "Uptil 30 November 2020\n" +
                    "\n" +
                    "TRAVEL PERIOD\n" +
                    "Open\n"));
            textArea.setBounds(5,0,700,700);
            textArea.setFont(new Font("T",Font.PLAIN,17));
            textArea.setBackground(Color.white);
            textArea.setEditable(false);
            textArea.setForeground(Color.BLACK);
            textArea.setLineWrap(true);
            textArea.setOpaque(true);
            add(textArea);

            JButton button = new JButton("OK");
            button.setBounds(0,520,60,30);
            textArea.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Special_offers();
                }
            });


            setSize(778,600);
            setVisible(true);
        }
    }
    class image2 extends JFrame {

        image2(){
            super("image2");
            getContentPane().setBackground(Color.white);
            getContentPane().setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextArea textArea = new JTextArea(("Customer Benefits:-\n" +
                    "\n" +
                    "1)Only Signup customers get a second flight free.\n" +
                    "2)Cashback is available at the checkout on every purchase in their Travolook wallet or in bank account directly depending upon type of purchase.\n" +
                    "3)Cashback of base fare is credited to the Travo wallet which is applied as additional discount in your next flight purchased.\n" +
                    "4)Sign up and get more amazing deals and instant off on your purchase."+
                    "\n\nTerms and conditions:-\n" +
                    "\n" +
                    "1)By second flight free means customer if avails 5 flights in an year through Travolook is entitled to get the cost of second flight as a cashback directly into their bank accounts.\n" +
                    "2)The cost of second flight is valued only for the base fare not the taxes at the time of purchase of the second flight.\n" +
                    "3)Deals starting with travo code are for new and existing customers.\n" +
                    "4)We reserves the right to change,add or negate the offers at any time without priot notice."+
                    "\nAPPLICABLE ON\n" +
                    "Domestic Flights\n"+
                    "\nVALIDITY\n" +
                    "Uptil 30 November 2020\n" +
                    "\n"));

            textArea.setBounds(5,0,700,700);
            textArea.setFont(new Font("T",Font.PLAIN,17));
            textArea.setBackground(Color.white);
            textArea.setEditable(false);
            textArea.setForeground(Color.BLACK);
            textArea.setLineWrap(true);
            textArea.setOpaque(true);
            add(textArea);

            JButton button = new JButton("OK");
            button.setBounds(0,520,60,30);
            textArea.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Special_offers();
                }
            });

            setSize(778,600);
            setVisible(true);
        }
    }

    class image3 extends JFrame {

        image3(){
            super("image3");
            getContentPane().setBackground(Color.white);
            getContentPane().setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextArea textArea = new JTextArea(("Customer Benefits:-\n" +
                    "\n" +
                    "1)Only Signup customers gets Rs.1000 instant Cashback. This amount only valid on Round Trip\n" +
                    "2)Cashback of base fare is credited to the Travo wallet which is applied as additional discount in your next flight purchased.\n" +
                    "\n\nTerms and conditions:-\n" +
                    "\n" +
                    "1)Payment done at the time of checkout should be through any debit card of National bank.\n" +
                    "2)Only signup customers gets the benefit.\n" +
                    "3)Customer with Travolook account gets other amazing deals and travo cashback in their Travolook wallet, also in their bank accounts directly after the checkout.\n" +
                    "4)The offers cannot be merged or combined with other offers available at the checkout.\n" +
                    "5)Travo deals starting with travo code are for new and existing customers.\n" +
                    "6)Travolook reserves the right to change, amend, add or negate the offers at any time without prior notice."+"\nAPPLICABLE ON\n" +
                    "Domestic Flights\n"+
                    "\nVALIDITY\n"+
                    "Uptil 31st December 2020"));
            textArea.setBounds(5,0,700,700);
            textArea.setFont(new Font("T",Font.PLAIN,17));
            textArea.setBackground(Color.white);
            textArea.setEditable(false);
            textArea.setForeground(Color.BLACK);
            textArea.setLineWrap(true);
            textArea.setOpaque(true);
            add(textArea);

            JButton button = new JButton("OK");
            button.setBounds(0,520,60,30);
            textArea.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Special_offers();
                }
            });

            setSize(778,600);
            setVisible(true);
        }
    }

   class image4 extends JFrame {

        image4(){
            super("image4");
            getContentPane().setBackground(Color.white);
            getContentPane().setLayout(null);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            JTextArea textArea = new JTextArea(("Customer Benefits:-\n" +
                    "\n" +
                    "1)Only Signup customers gets Rs.1000 instant Cashback. This amount only valid on Round Trip\n" +
                    "2)Cashback of base fare is credited to the Travo wallet which is applied as additional discount in your next flight purchased.\n" +
                    "\nTerms and conditions:-\n" +
                    "\n" +
                    "1)Payment done at the time of checkout should be through any debit card of National bank.\n" +
                    "2)Only signup customers gets the benefit.\n" +
                    "3)Customer with Travolook account gets other amazing deals and travo cashback in their Travolook wallet, also in their bank accounts directly after the checkout.\n" +
                    "4)The offers cannot be merged or combined with other offers available at the checkout.\n" +
                    "5)Travo deals starting with travo code are for new and existing customers.\n" +
                    "6)Travolook reserves the right to change, amend, add or negate the offers at any time without prior notice."+"\nAPPLICABLE ON\n" +
                    "Domestic Flights"+"\n\nVALIDITY\n" +
                    "Uptil 31st December 2020"));
            textArea.setBounds(5,0,700,700);
            textArea.setFont(new Font("T",Font.PLAIN,17));
            textArea.setBackground(Color.white);
            textArea.setEditable(false);
            textArea.setForeground(Color.BLACK);
            textArea.setLineWrap(true);
            textArea.setOpaque(true);
            add(textArea);

            JButton button = new JButton("OK");
            button.setBounds(0,500,60,30);
            textArea.add(button);

            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    new Special_offers();
                }
            });

            setSize(778,600);
            setVisible(true);
        }
    }
    public static void main(String[]args){
        new Special_offers();
    }
}