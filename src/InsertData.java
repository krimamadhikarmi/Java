import java.sql.*;
public class InsertData{
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sevenDb?useSSL=false", "root", "1234");
        String sql= "insert into tblstudent(idtblStudent,Name,Address,Gender) values (?,?,?,?)";
        PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1,5 );
        ps.setString(2, "Krima");
        ps.setString(3, "Bhaktapur");
        ps.setString(4, "Female");
        ps.executeUpdate();
        con.close();
        System.out.println("Data Inserted");
    }
}