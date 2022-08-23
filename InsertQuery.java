import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.*;
public class InsertQuery {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCHOOL","root","12345678");
            if(con.isClosed()) System.out.println("Connection not established");
            else {
                System.out.println("Connection Established");
                String q = "Insert into Ljdbc(Name,City) values (?,?)";
                PreparedStatement stmt = con.prepareStatement(q);
                // making the input Dynamic
                String check = "y";
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                do {
                    System.out.print("\nEnter the Name:\t");
                    String name = br.readLine();
                    System.out.print("Enter the City:\t");
                    String city = br.readLine();
                    stmt.setString(1, name);
                    stmt.setString(2, city);
                    stmt.executeUpdate();
                    System.out.println("\nInserted");
                    System.out.print("Do you want to enter more values?(Y/N)-->");
                    check = br.readLine();
                }while(check.toLowerCase().equals("y"));
                con.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
