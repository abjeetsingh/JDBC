import java.sql.*;
public class InsertQuery {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCHOOL","root","12345678");
            if(con.isClosed()) System.out.println("Connection not established");
            else {
                System.out.println("Connection Established");
                String q = "Insert into school values (?,?)";
                PreparedStatement stmt = con.prepareStatement(q);
                stmt.setString(1,"Abjeet");
                stmt.setString(2,"Delhi");
                stmt.executeUpdate();
                System.out.println("Inserted");
                con.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
