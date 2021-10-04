package com.example.demo10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyConnection {
    static String driveName = "com.mysql.cj.jdbc.Driver";
    static String url = "jdbc:mysql://localhost:3306/test1?autoReconnect=true&useSSL=false";
    static String user = "root";
    static String password = "rootroot";


    public static Connection connect()
    {
        Connection con = null;
        try
        {
            Class.forName(driveName);
            con = DriverManager.getConnection(url , user , password);//return Connection

            if(con!=null)
            {
                System.out.println("success");
            }
        }
        catch(Exception ex)
        {
            System.out.println("DB error :"+ex);
        }
        return con;
    }
}