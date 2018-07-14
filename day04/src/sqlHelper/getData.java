package sqlHelper;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class getData extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static final String url="jdbc:mysql://localhost:3306/easyui";    //声明JDBC使用的数据库的URL
	private static final String user="root";       //数据库用户名
    private static final String pwd="root1234";    //数据库密码
	
	public getData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		//	设置响应内容类型
		response.setContentType("text/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(url,user,pwd);
			//创建一个Statement对象,通过数据库的连接操作数据库，实现增删改查
		    Statement stmt = conn.createStatement();
		    //生成一条SQL语句用以查询数据
		    String sql="select * from users";
		    //执行查询，把查询结果赋值给结果集对象
		    ResultSet rs=stmt.executeQuery(sql);
		    JSONArray jsonarray = new JSONArray();  
		    JSONObject jsonobj = new JSONObject(); 
		    // 展开结果集数据库
		    while(rs.next()){
                // 通过字段检索
		    	jsonobj.put("ID", rs.getInt("id"));
		    	jsonobj.put("Firstname", rs.getString("firstname"));  
		    	jsonobj.put("Lastname", rs.getString("lastname"));  
		    	jsonobj.put("Phone", rs.getString("phone"));
		    	jsonobj.put("Email", rs.getString("e-mail"));
		    	jsonarray.add(jsonobj);             
		    }
		    // 输出数据
		    out = response.getWriter();
		    out.println(jsonarray);
		    // 完成后关闭
		    rs.close();   
		    stmt.close();   
		    conn.close();
		}catch (Exception e) { 
			System.out.print("get data error!"); 
			e.printStackTrace(); 
		}
	}
	
	/**
	* @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	*/
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // TODO Auto-generated method stub
	    doGet(request, response);
	}
}
