package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.SecondBean;

@WebServlet("/second")
public class Second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside second servlet doGet method");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside second servlet doPost method");
		String name = request.getParameter("name");
		SecondBean bean = new SecondBean();
		bean.setName(name);
		HttpSession session = request.getSession(true);
		session.setAttribute("second", bean);
		response.sendRedirect("page/index2.jsp");
	}

}
