package crud;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Save
 */
@WebServlet("/Save")
public class Save extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Save() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("Name");
        String email = request.getParameter("Email");
        String salary = request.getParameter("Salary");

        System.out.println(name);
        System.out.println(email);
        System.out.println(salary);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "123456");

            String sql = "INSERT INTO employee(Name,Email,Salary) VALUES(?,?,?)";
            PreparedStatement stat = conn.prepareStatement(sql);

            stat.setString(1,name);
            stat.setString(2,email);
            stat.setString(3,salary);
            int rs = stat.executeUpdate();
            if (rs == 1) {
                System.out.println("插入成功");
            } else {
                System.out.println("插入失败");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
