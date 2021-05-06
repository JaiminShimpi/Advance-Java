package jdbc;
import java.sql.*;
public class jdbcc {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/college","root","admin");
		Statement stmt=con.createStatement();
		String query="select * from student";
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2));
		}
		con.close();
	}

}
