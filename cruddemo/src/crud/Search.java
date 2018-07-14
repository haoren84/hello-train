package crud;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        try {
            String ByName = request.getParameter("ByName");
            System.out.println(ByName);

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "123456");
            String sql = "SELECT * FROM employee WHERE Name=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, ByName);

            ResultSet rs = stat.executeQuery();
            List<PeBean> list = new ArrayList<>();
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
