package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class jdbcUtil {
	private static final String url="jdbc:mysql://localhost:3306/easyui";    //声明JDBC使用的数据库的URL
	private static final String user="root";       //数据库用户名
    private static final String pwd="root1234";    //数据库密码
    
	public static void main(String[] args) throws Exception{
	    //调用Class.forName()方法加载MYSQL JDBC驱动程序
	    Class.forName("com.mysql.jdbc.Driver");
	    System.out.println("成功加载MySQL驱动！");
	    
	    /* 调用DriverManager对象的getConnection()方法，获得一个Connection对象获得数据库的连接
		 * 在这其中的将URL，USER，PASSWORD传入DriverManager中的Driver对象(在JDBC中)，
		 * 通过JDBC返回一个连接
		 */
	    Connection conn = DriverManager.getConnection(url,user,pwd);
	      System.out.print("成功连接到数据库！\n");
	      //创建一个Statement对象,通过数据库的连接操作数据库，实现增删改查
	      Statement stmt = conn.createStatement();
	      //生成一条sql语句用以查询数据
	      String sql="select * from users";
	      //执行查询，把查询结果赋值给结果集对象
	      ResultSet rs=stmt.executeQuery(sql);
	      int id;//声明变量id
	      String firstname,lastname,phone,email;//声明变量firstname,lastname,phone,e-mail
	      System.out.println("获得到查询结果：\n");
	      System.out.println("ID\t Firstname\t Lastname\t Phone\t\t Email");//其中\t相当于8个空格
	      //rSet.next()返回的是一个布尔类型的值，而且将指针指向下一条记录
	      while(rs.next()){//遍历结果集
	        id=rs.getInt("id");//获得id
	        firstname=rs.getString("firstname");
	        lastname=rs.getString(3);
	        phone=rs.getString(4);
	        email=rs.getString(5);
	        System.out.println(id+"\t"+firstname+"\t\t"+lastname+"\t\t"+phone+"\t"+email+"\t");
	      }
	      conn.close();
	      System.out.println("关闭数据库连接!");
	    
	  }
}