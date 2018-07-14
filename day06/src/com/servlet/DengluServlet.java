package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.dao.UserDaoImpl;

/**
 * Servlet implementation class DengluServlet
 */
@WebServlet("/DengluServlet")
// 需要继承HttpServlet，并重写doGet、doPost方法
public class DengluServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DengluServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// 将信息使用doPost方法执行对应jsp页面中form表单中的method
		doPost(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		// getParameter()方法得到jsp页面传过来的参数
		String name = request.getParameter("name"); 
		String pwd = request.getParameter("pwd");
		
		UserDao ud = new UserDaoImpl();
		
		if(ud.login(name, pwd)){
			request.setAttribute("xiaoxi", "欢迎用户"+name); //向request域中放置信息
			request.getRequestDispatcher("/success.jsp").forward(request, response);//转发到成功页面
		}else{
			response.sendRedirect("error.jsp"); //重定向到首页
		}
	}

}
