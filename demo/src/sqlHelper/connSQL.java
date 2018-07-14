package sqlHelper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connSQL {
	public static Connection getConn(){
    	String driver = "com.mysql.jdbc.Driver";
    	Connection conn = null;
    	String url = "jdbc:mysql://localhost:3306/javademo";
    	String user = "root";
    	String password = "root1234";
    	try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,user,password);
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
    	return conn; 
    }
}
