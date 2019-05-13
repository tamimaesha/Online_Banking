
package g;

import java.sql.*;

public class GetCon {

   public static Connection getCon()//connection with database using singleton design pattern.
    {
        try{
          Class.forName("com.mysql.jdbc.Driver");//mysql
          
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/online_banking","root","12345");
            return con;
            
        }
        catch(Exception e)
        {
            System.out.println("Connection Error.");
            return null;
            
        }
    }

}
