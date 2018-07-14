package sqlHelper;

import sqlHelper.connSQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class getSQLData {
    public String getdata(String name){
    	String pwd="null";
    	Connection conn = connSQL.getConn();
	    try {
	        if(!conn.isClosed()){
				System.out.println("数据库连接成功！");
				Statement state=conn.createStatement();
				String sql = "select * from user where username="+"'"+name+"'";
				ResultSet rs =state.executeQuery(sql);
				if(rs.next()){
					pwd=rs.getString("password");
				}else{
					System.out.println("用户名不存在！");
		  		}
	            rs.close();
	        }else{
	        	conn.close();
	        }
	    }catch (SQLException e) {
	    	e.printStackTrace();
	    }
        return pwd;
    }
}