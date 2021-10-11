package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame{
    public static void main(String s[]){
        new MainFrame().setVisible(true);
    }
    public MainFrame(){
        super("AIRLINE RESERVATION SYSTEM");
        initialize();
    }

    private void initialize(){
        setForeground(Color.CYAN);
        setLayout(null);

        //image
        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon("front.jpg"));
        NewLabel.setBounds(0,0,1340,690);
        add(NewLabel);

        JLabel AirlineManagementSystem = new JLabel("AIR INDIA WELCOMES YOU!");
        AirlineManagementSystem.setForeground(Color.BLUE);
        AirlineManagementSystem.setFont(new Font("BOLD",Font.BOLD,38));
        AirlineManagementSystem.setBounds(400,80,1000,60);
        NewLabel.add(AirlineManagementSystem);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenuItem FlightDetails = new JMenuItem("FLIGHT_INFORMATION");
        menuBar.add(FlightDetails);

        JMenuItem ReservationDetails = new JMenuItem("ADD_CUSTOMER_DETAILS");
        menuBar.add(ReservationDetails);

        JMenuItem PassengerDetails = new JMenuItem("JOURNEY_DETAILS");
        menuBar.add(PassengerDetails);

        JMenuItem SectorDetails_1 = new JMenuItem("PAYMENT_DETAILS");
        menuBar.add(SectorDetails_1);

        JMenuItem Cancellation = new JMenuItem("CANCELLATION");
        menuBar.add(Cancellation);


        JMenuItem Ticket = new JMenuItem("TICKET");
        menuBar.add(Ticket);

        JMenuItem SP = new JMenuItem("SPECIAL OFFERS");
        menuBar.add(SP);

        FlightDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Flight_info();
            }
        });
        ReservationDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Add_customer();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        PassengerDetails.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Journey_details();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        SectorDetails_1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new Payment_details();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        Cancellation.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Cancel();
            }
        });
        Ticket.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new TicInfo();
                }catch(Exception e){
                    e.printStackTrace();
                }
            }
        });
        SP.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                new Special_offers();
            }
        });

        setSize(2000,1090);
        setVisible(true);

    }

}

