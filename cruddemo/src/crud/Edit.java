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
 * Servlet implementation class Edit
 */
@WebServlet("/Edit")
public class Edit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit() {
        super();
        // TODO Auto-generated constructor stub
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("Name");
        System.out.println(name);
        String email = request.getParameter("Email");
        System.out.println(email);
        String salary = request.getParameter("Salary");
        System.out.println(salary);

        // 前台传递过来的 是一个 字符串 类型，这里必须把它转换为一个 整数 类型的
        String id = request.getParameter("Id");
        int Id = Integer.parseInt(id);
        System.out.println(id);

        try {
            Class.forName("com.mysql.jdbc.Driver");// 2.引入JDBC驱动器类
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "123456");
            // 注意下面的sql语句只有一个set
            String sql = "UPDATE employee SET Name=?,Email=?,Salary=? WHERE Id=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, name);
            stat.setString(2, email);
            stat.setString(3, salary);
            stat.setInt(4, Id);
            int rs = stat.executeUpdate();
            if (rs != 0) {
                System.out.println("更新成功");
            } else {
                System.out.println("更新失败");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
