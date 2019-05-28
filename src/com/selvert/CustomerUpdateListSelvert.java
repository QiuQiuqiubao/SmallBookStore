package com.selvert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstore.bean.Customer;
import com.bookstore.dao.CustomerDao;
import com.bookstore.dao.impl.CustomerImpl;

public class CustomerUpdateListSelvert extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CustomerUpdateListSelvert() {
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
		response.setCharacterEncoding("UTF-8");
		request.setCharacterEncoding("UTF-8");
		PrintWriter out = response.getWriter();
		CustomerDao cd=new CustomerImpl();
		String id=request.getParameter("id1");
		Customer cus=new Customer();
		cus.setCustomerId(Integer.parseInt(id));
		cus.setCustomerName(request.getParameter("customerName"));
		cus.setCustomerPwd(request.getParameter("customerPwd"));
		cus.setCustomertruename(request.getParameter("customertruename"));
		cus.setCustomerSex(request.getParameter("customerSex"));
		cus.setCustomerTel(request.getParameter("customerTel"));
		cus.setCustomerEmail(request.getParameter("customerEmail"));
		cus.setCustomerAddr(request.getParameter("customerAddr"));
		int ret=cd.updateProject(cus, id);
		if(ret>0){
			request.getRequestDispatcher("CustomerListSelvert").forward(request, response);
			System.out.print("ÐÞ¸ÄÍê³É");
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
		this.doGet(request,response);
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
