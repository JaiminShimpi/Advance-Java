package jdbc;
import java.sql.*;
import java.io.*;

public class Db {
	public static void main(String[] args)throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection
		("jdbc:mysql://localhost:3306/college","root","admin");
		String query="insert into student values(?,?)";
		PreparedStatement stmt=con.prepareStatement(query);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String id=br.readLine();
		String name=br.readLine();
		stmt.setString(1,id);
		stmt.setString(2,name);
		int i=stmt.executeUpdate();
		Statement st=con.createStatement();
		query="select * from student";
		ResultSet rs=st.executeQuery(query);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+" "+rs.getString(2)); 
		}
		con.close();
	}
}
