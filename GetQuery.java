import java.sql.*;

public class GetQuery {
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/SCHOOL","root","12345678");
            if(con.isClosed())System.out.println("Connection not established");
            else System.out.println("Connection established");
            String q = "select * from coaching";
            Statement stmt = con.createStatement();
            ResultSet set = stmt.executeQuery(q);
            while(set.next()){
                int adno = set.getInt("adno");
                System.out.println(adno);
            }
            con.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
