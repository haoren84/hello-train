package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class demo {
	public static void main(String[] args) {
	    String userName="root"; 
	    String userPasswd="root1234";  
	    String dbName="easyui";
	    String tableName="users";

	    String url="jdbc:mysql://localhost/"+dbName+"?user="+userName+"&password="+userPasswd;

	    
	    try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
		try {
			 Connection conn;
				
				conn = DriverManager.getConnection(url);
			
		    Statement stmt;
			
				stmt = conn.createStatement();
			
		    String sql="SELECT * FROM "+tableName;  
			ResultSet rs;
			rs = stmt.executeQuery(sql);

	     List<String> list = new ArrayList<String>();         //list
	       while(rs.next()) {    
	           list.add (rs.getString("firstname"));
	       } 

	     System.out.println("鎵撳嵃 list:");
	     System.out.print(list);
	      
	      rs.close();   
	      stmt.close();   
	      conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
