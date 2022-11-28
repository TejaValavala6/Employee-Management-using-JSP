package teja;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	private String dburl = "jdbc:mysql://localhost:3306/employeesr";
	private String dbuname = "root";
	private String dbpassword="Tej@6156";
	private String dbdriver = "com.mysql.jdbc.Driver";
	public void loadDriver(String dbdriver) {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		Connection con = null;
		
		try {
			con=DriverManager.getConnection(dburl,dbuname,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public String insert(Member member) {
		
		loadDriver(dbdriver);
		Connection con=getConnection();
		String result = "data entered successfully";
		
		String sql = "insert into employeesr.employee values(?,?,?,?,?)";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,member.getEmpId());
			ps.setString(2,member.getEmpname());
			ps.setString(3,member.getEmpdoj());
			ps.setString(4,member.getEmpyoe());
			ps.setString(5,member.getEmpdesignation());
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
