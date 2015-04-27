package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.FirstBean;

@WebServlet("/first")
public class First extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside first servlet doGet method");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Inside first servlet doPost method");
		String name = request.getParameter("name");
		FirstBean bean = new FirstBean();
		bean.setName(name);
		HttpSession session = request.getSession(true);
		session.setAttribute("first", bean);
		response.sendRedirect("page/index1.jsp");
	}

}
