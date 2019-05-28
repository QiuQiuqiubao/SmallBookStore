package com.selvert;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookstoreDB.service.Service;

public class RegisterLetSelvert extends HttpServlet {

	/**
	 * Constructor of the object.
	 */
	public RegisterLetSelvert() {
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
		response.setContentType("text/html;UTF-8");
		request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.getWriter();
		PrintWriter out = response.getWriter();
		// ���տͻ�����Ϣ
        String CustomerName = request.getParameter("CustomerName");
        CustomerName = new String(CustomerName.getBytes("ISO-8859-1"), "UTF-8");
        String CustomerPwd = request.getParameter("CustomerPwd");
        String Customertruename=request.getParameter("CustomertrueName");
        Customertruename = new String(Customertruename.getBytes("ISO-8859-1"), "UTF-8");
        String CustomerSex=request.getParameter("CustomerSex");
        CustomerSex = new String(CustomerSex.getBytes("ISO-8859-1"), "UTF-8");
        String CustomerTel=request.getParameter("CustomerTel");
        String CustomerEmail=request.getParameter("CustomerEmail");
        String CustomerAddr=request.getParameter("CustomerAddr");
        CustomerAddr = new String(CustomerAddr.getBytes("ISO-8859-1"), "UTF-8");
        System.out.println(CustomerName + "--" + CustomerPwd+"--"+Customertruename+"--"+CustomerSex+"--"+CustomerTel+"--"+CustomerEmail+"--"+CustomerAddr);
        // �½��������
        Service serv = new Service();
        // ��֤����
        boolean register = serv.register(CustomerName, CustomerPwd, Customertruename, CustomerSex,CustomerTel,CustomerEmail,CustomerAddr);
        System.out.println("------------------------");
        if(register){
        	System.out.print("�ɹ����ӣ�");
         // ������Ϣ���ͻ���
            out.print("0");
            out.flush();
            out.close();
        } else {
            System.out.print("����ʧ�ܣ�");
         // ������Ϣ���ͻ���
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
