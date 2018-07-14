package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDao;
import com.dao.UserDaoImpl;
import com.entity.User;

/**
 * Servlet implementation class ZhuceServlet
 */
@WebServlet("/ZhuceServlet")
public class ZhuceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ZhuceServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name"); //获取jsp页面传过来的参数
		String pwd = request.getParameter("pwd");
		String sex = request.getParameter("sex");
		String info = request.getParameter("info");
		
		User user = new User(); //实例化一个对象，组装属性
		user.setName(name);
		user.setPwd(pwd);
		user.setSex(sex);
		user.setInfo(info);
		
		UserDao ud = new UserDaoImpl();
		
		if(ud.register(user)){
			request.setAttribute("username", name);  //向request域中放置参数
			//request.setAttribute("xiaoxi", "注册成功");
			request.getRequestDispatcher("/denglu.jsp").forward(request, response);  //转发到登录页面
		}else{
			
			response.sendRedirect("error.jsp");//重定向到首页
		}
	}

}
