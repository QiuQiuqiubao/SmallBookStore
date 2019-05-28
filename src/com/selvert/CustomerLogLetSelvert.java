package com.selvert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstoreDB.service.Service;


public class CustomerLogLetSelvert extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public CustomerLogLetSelvert() {
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
		// ���տͻ�����Ϣ
        String CustomerName = request.getParameter("CustomerName");
        CustomerName = new String(CustomerName.getBytes("ISO-8859-1"), "UTF-8");
        String CustomerPwd = request.getParameter("CustomerPwd");
        System.out.println(CustomerName + "--" + CustomerPwd);
        // �½��������
        Service serv = new Service();
        // ��֤����
        boolean loged = serv.login(CustomerName, CustomerPwd);
        System.out.println("------------------------");
        if (loged==true) {
            System.out.print("�ɹ����ӣ�");
         // ������Ϣ���ͻ���
            PrintWriter out = response.getWriter();
            out.print("0");
            out.flush();
            out.close();
        } else {
            System.out.print("����ʧ�ܣ�");
         // ������Ϣ���ͻ���
            response.setCharacterEncoding("UTF-8");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.print("1");
            out.flush();
            out.close();
        }
        
        
        
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
