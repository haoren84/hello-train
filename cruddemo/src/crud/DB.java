package crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import bean.PeBean;

/**
 * Servlet implementation class DB
 */
@WebServlet("/DB")
public class DB extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DB() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car", "root", "123456");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");
            List<PeBean> list = new ArrayList<>();
            System.out.println("获取数据库的信息如下");
            while (rs.next()) {
                int Id = rs.getInt("Id");
                String Name = rs.getString("Name");
                String Email = rs.getString("Email");
                String Salary = rs.getString("Salary");
                PeBean pebean = new PeBean(Id, Name, Email, Salary);
                System.out.println(pebean);
                list.add(pebean);
            }
            Gson gson = new Gson();
            String json = gson.toJson(list);
            System.out.println(json);

            // 将JSON字符串作为响应数据返回
            response.setContentType("text/json;charset=UTF-8");
            PrintWriter writer = response.getWriter();
            writer.write(json);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

}
