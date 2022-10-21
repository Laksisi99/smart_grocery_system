package SQL_Connector;

import java.sql.Connection;

import java.sql.DriverManager;

public class Connector
{
    public static Connection connection()
    {
        Connection conn = null;
        
        String host = "localhost";
        
        String port = "3306";
        
        String user_name = "root";
        
        String password = "";
        
        String db_name = "grocery_shop";

        String database_url = "jdbc:mysql://"+host+":"+port+"/"+db_name;

        try
        {
           conn = DriverManager.getConnection(database_url, user_name, password);

            System.out.println("Connected !!");
        }
        catch (Exception ERROR)
        {
            System.out.println("Error Message : "+ERROR);
        }
        return conn;
    }
    
    
    public static void main(String[] args)
    {
        connection();
    }
}
