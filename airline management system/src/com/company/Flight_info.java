package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import net.proteanit.sql.DbUtils;
import sun.rmi.runtime.NewThreadAction;

public class Flight_info extends JFrame{

    private JTable table;
    private JTextField textField;

    public static void main(String s[]){
        new Flight_info().setVisible(true);
    }

    public Flight_info(){

        super("Flight_Info");

        getContentPane().setBackground(Color.WHITE);
        getContentPane().setFont(new Font("Bold",Font.PLAIN,13));

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(860,600);
        //setUndecorated(true);
        setLayout(null);
        setVisible(true);

        JLabel NewLabel = new JLabel("");
        NewLabel.setIcon(new ImageIcon("flight_info.jpg"));
        NewLabel.setBounds(0,0,860,600);
        add(NewLabel);

        JLabel Fcode = new JLabel("FLIGHT CODE");
        Fcode.setFont(new Font("Tahoma",Font.PLAIN,20));
        Fcode.setForeground(Color.BLUE);
        Fcode.setBounds(50,100,200,30);
        NewLabel.add(Fcode);

        /*JTextField textField = new JTextField();
        textField.setPreferredSize(new Dimension(250,30));
        textField.setBounds(182,98,240,40);
        textField.setFont(new Font("Tahoma", Font.BOLD, 16));
        textField.setForeground(Color.BLACK);
        textField.setBackground(Color.white);
        add(textField);*/

        String[] items1 =  {"AI266", "AI274", "AI358", "AI359","AI913","AI933","AI951","AI973","AI173","AI970"};
        JComboBox comboBox = new JComboBox(items1);
        comboBox.setBounds(182, 98, 240, 40);
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 16));
        NewLabel.add(comboBox);

        JLabel FlightDetails = new JLabel("FLIGHT INFORMATION");
        FlightDetails.setFont(new Font("Tahoma",Font.PLAIN,31));
        FlightDetails.setForeground(Color.red);
        FlightDetails.setBounds(50,20,570,35);
        NewLabel.add(FlightDetails);

        JButton btnShow = new JButton("Show");
        btnShow.setFont(new Font("Tahoma",Font.PLAIN,20));

        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                String code = (String) comboBox.getSelectedItem();
                //String src  = (String) comboBox.getSelectedItem();
                try{
                    conn c = new conn();
                    String str = "select f_code,f_name,src,dst,capacity,class_code,class_name from flight,sector where f_code = '"+code+"'";

                    try (ResultSet rs = c.s.executeQuery(str)) {
                        table.setModel(DbUtils.resultSetToTableModel(rs));
                    }
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        });

        btnShow.setBounds(220,150,120,30);
        NewLabel.add(btnShow);

        table = new JTable();
        table.setBackground(Color.white);
        table.setBounds(23,100,800,300);

        JScrollPane pane = new JScrollPane(table);
        pane.setBounds(23,250,800,300);
        pane.setBackground(Color.white);
        NewLabel.add(pane);

        JLabel FlightCode = new JLabel("Flight code");
        FlightCode.setFont(new Font("Tahoma",Font.PLAIN,17));
        FlightCode.setBounds(36,220,126,14);
        NewLabel.add(FlightCode);

        JLabel FlightName = new JLabel("Flight Name");
        FlightName.setFont(new Font("Tahoma",Font.PLAIN,17));
        FlightName.setBounds(150,220,120,14);
        NewLabel.add(FlightName);

        JLabel Source = new JLabel("Source");
        Source .setFont(new Font("Tahoma",Font.PLAIN,17));
        Source .setBounds(282,220,104,14);
        NewLabel.add(Source);

        JLabel Destination = new JLabel("Destination");
        Destination .setFont(new Font("Tahoma",Font.PLAIN,17));
        Destination .setBounds(377,220,120,14);
        NewLabel.add(Destination);

        JLabel Capacity = new JLabel("Capacity");
        Capacity .setFont(new Font("Tahoma",Font.PLAIN,17));
        Capacity .setBounds(497,220,111,14);
        NewLabel.add(Capacity);

        JLabel ClassCode = new JLabel("ClassCode");
        ClassCode .setFont(new Font("Tahoma",Font.PLAIN,17));
        ClassCode .setBounds(605,220,120,14);
        NewLabel.add(ClassCode);

        JLabel ClassName = new JLabel("ClassName");
        ClassName .setFont(new Font("Tahoma",Font.PLAIN,17));
        ClassName .setBounds(715,220,104,14);
        NewLabel.add(ClassName);

        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setSize(860,600);
        setVisible(true);
        setLocation(100,10);

    }
}

