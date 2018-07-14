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
 * Servlet implementation class Delete
 */
@WebServlet("/Delete")
public class Delete extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String id = request.getParameter("id");
        System.out.println(id);
        try {
            Class.forName("com.mysql.jdbc.Driver");// 2.引入JDBC驱动器类
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/car?useUnicode=true&characterEncoding=utf-8&useSSL=false", "root", "123456");
            String sql = "DELETE FROM employee WHERE Id=?";
            PreparedStatement stat = conn.prepareStatement(sql);
            stat.setString(1, id);
            int rs = stat.executeUpdate();
            if (rs != 0) {
                System.out.println("删除成功");
            } else {
                System.out.println("删除失败");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
