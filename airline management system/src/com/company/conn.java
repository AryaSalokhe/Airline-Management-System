package com.company;
import java.sql.*;

public class conn {

    Connection c;
    Statement s;
    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airline","root","");
            s = c.createStatement();
        }catch(SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}

