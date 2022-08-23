import java.util.*;
import java.sql.*;
public class jdbcConnect {
    static public void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCHOOL","root","12345678");
            if(con.isClosed())
                System.out.println("the connection is not established");
            else
                System.out.println("the connection is established");
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
