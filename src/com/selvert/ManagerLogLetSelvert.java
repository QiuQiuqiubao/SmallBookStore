package com.selvert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.bean.Manager;
import com.bookstoreDB.service.Service;

public class ManagerLogLetSelvert extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public ManagerLogLetSelvert() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		// 接收网页信息
        String AdminName = request.getParameter("AdminName");
        String AdminPwd = request.getParameter("AdminPwd");
        Manager manager=new Manager();
        Service ser=new Service();
        manager.setAdminName(AdminName);
        manager.setAdminPwd(AdminPwd);
        //验证
        boolean ret=ser.adminLogin(AdminName, AdminPwd);
        if(ret){
        	//将用户名存入名为username的session对象中
			request.getSession().setAttribute("adminname", AdminName);
			//页面跳转至index.jsp
			response.sendRedirect("../index.jsp");
        }else{
        	out.print("<script>alert('登录失败!(提示：请认真核对您的账号密码)');window.location.href='../login.html'</script>");
		}
		out.flush();
		out.close();
        
	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         doGet(request,response);
	}

	/**
	 * Initialization of the servlet. <br>
	 *
	 * @throws ServletException if an error occurs
	 */
	public void init() throws ServletException {
		// Put your code here
	}

}
