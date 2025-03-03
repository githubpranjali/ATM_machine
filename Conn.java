
package bank.management.system;

import java.sql.*;


public class Conn {
    
   Connection c;
   Statement s;
   Conn(){
       try{
        
        c=DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem", "root","pranjali@123");
        s=c.createStatement();   
        
       }
       catch(Exception e){
          System.out.println(e); 
       }
   }

    ResultSet executeQuery(String query) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
