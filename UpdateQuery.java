import java.sql.*;
public class UpdateQuery {
    static public void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCHOOL","root","12345678");
            if (con.isClosed()) System.out.println("Connection Not Established");
            else{
                System.out.println("Connection Established Successfully");
                Statement stmt = con.createStatement();
                String q = "create table Ljdbc (Id int(20) primary key auto_increment, Name varchar(30) not null, City varchar(20))";
                stmt.executeUpdate(q);
                System.out.println("Table Created Successfully");
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
