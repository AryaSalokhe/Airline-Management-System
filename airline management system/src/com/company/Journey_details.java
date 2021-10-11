package com.company;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import net.proteanit.sql.DbUtils;

    public class Journey_details extends JFrame{

        JTable table;
        JLabel ReservationDetails,Pnrno,Ticketid,Fcode,Jnydate,Jnytime,Source,Destination,label,label1;
        JButton Show;

        public static void main(String[] args){
            new Journey_details();
        }

        public Journey_details(){

            setTitle("JOURNEY_DETAILS");
            getContentPane().setBackground(Color.WHITE);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            setLayout(null);

            JLabel NewLabel = new JLabel("");
            NewLabel.setIcon(new ImageIcon("flight_info.jpg"));
            NewLabel.setBounds(0,0,860,600);
            add(NewLabel);

            Source = new JLabel("SOURCE");
            Source.setFont(new Font("Tahoma", Font.PLAIN, 19));
            Source.setBounds(60, 130, 150, 27);
            NewLabel.add(Source);

            Destination = new JLabel("DESTINATION");
            Destination.setFont(new Font("Tahoma", Font.PLAIN, 19));
            Destination.setBounds(350, 130, 150, 27);
            NewLabel.add(Destination);

            Show = new JButton("SHOW");
            Show.setBounds(680, 130, 100, 30);
            NewLabel.add(Show);

            setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

            ReservationDetails = new JLabel("JOURNEY DETAILS");
            ReservationDetails.setForeground(Color.RED);
            ReservationDetails.setFont(new Font("Tahoma", Font.PLAIN, 31));
            ReservationDetails.setBounds(280, 27, 359, 31);
            NewLabel.add(ReservationDetails);

            Pnrno = new JLabel("PNR_NO");
            Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 14));
            Pnrno.setForeground(Color.black);
            Pnrno.setBounds(79, 280, 83, 20);
            NewLabel.add(Pnrno);

            Ticketid = new JLabel("TICKET_ID");
            Ticketid.setFont(new Font("Tahoma", Font.PLAIN, 14));
            Ticketid.setForeground(Color.BLACK);
            Ticketid.setBounds(172, 280, 71, 20);
            NewLabel.add(Ticketid);

            Fcode = new JLabel("F_CODE");
            Fcode.setFont(new Font("Tahoma", Font.PLAIN, 14));
            Fcode.setForeground(Color.BLACK);
            Fcode.setBounds(297, 280, 103, 20);
            NewLabel.add(Fcode);

            Jnydate = new JLabel("JNY_DATE");
            Jnydate.setFont(new Font("Tahoma", Font.PLAIN, 14));
            Jnydate.setForeground(Color.BLACK);
            Jnydate.setBounds(390, 280, 94, 20);
            NewLabel.add(Jnydate);

            Jnytime = new JLabel("JNY_TIME");
            Jnytime.setFont(new Font("Tahoma", Font.PLAIN, 14));
            Jnytime.setForeground(Color.BLACK);
            Jnytime.setBounds(494, 280, 83, 20);
            NewLabel.add(Jnytime);

            Source = new JLabel("SOURCE");
            Source.setFont(new Font("Tahoma", Font.PLAIN, 14));
            Source.setForeground(Color.BLACK);
            Source.setBounds(613, 280, 94, 20);
            NewLabel.add(Source);

            Destination = new JLabel("DESTINATION");
            Destination.setFont(new Font("Tahoma", Font.PLAIN, 14));
            Destination.setForeground(Color.BLACK);
            Destination.setBounds(717, 280, 94, 20);
            NewLabel.add(Destination);

            String[] items1 =  {"BANGALORE", "MUMBAI", "CHENNAI", "PATNA","DELHI","HYDERABAD"};
            JComboBox comboBox = new JComboBox(items1);
            comboBox.setBounds(150, 130, 150, 27);
            NewLabel.add(comboBox);


            String[] items2 =  {"BANGALORE", "MUMBAI", "CHENNAI", "PATNA","DELHI","HYDERABAD"};
            JComboBox comboBox_1 = new JComboBox(items2);
            comboBox_1.setBounds(500, 130, 150, 27);
            NewLabel.add(comboBox_1);

            table = new JTable();
            table.setBounds(38, 310, 770, 200);
            NewLabel.add(table);



            Show.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    try{
                        String src  = (String) comboBox.getSelectedItem();
                        String dst  = (String) comboBox_1.getSelectedItem();

                        conn c = new conn();

                        String str = "select pnr_no,ticket_id,f_code,jny_date,jny_time,src,dst from reservation where src = '"+src+"' and dst = '"+dst+"'";
                        //ResultSet rs=c.s.executeQuery(str);

                        /*if(rs.next()){
                            table.setModel(DbUtils.resultSetToTableModel(rs));
                        }else{
                            JOptionPane.showMessageDialog(null,"No Flights between Source and Destination");

                        }*/
                        try (ResultSet rs = c.s.executeQuery(str)) {
                                table.setModel(DbUtils.resultSetToTableModel(rs));
                            }

                    catch (SQLException e){
                        e.printStackTrace();
                    }


                    }catch(Exception e){}
                }
            });

            setSize(860,600);
            //setLocation(400,200);
            setVisible(true);

        }
    }

