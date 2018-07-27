package com.bac.web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2568049294742433285L;
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) {
		System.out.println("Inside doPost");
		String param = request.getParameter("test");
		param = param + " Hello";
		RequestDispatcher rd = request.getRequestDispatcher("/Process1");
		request.setAttribute("test-param", param);
		try {
			rd.forward(request, response);
		} catch (ServletException | IOException e) {			
			e.printStackTrace();
		}
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) {
		doPost(request, response);
	}

}
