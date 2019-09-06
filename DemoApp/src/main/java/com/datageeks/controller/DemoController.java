package com.datageeks.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/demoh")
public class DemoController extends HttpServlet{
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			resp.setContentType("text/html");
			PrintWriter out = resp.getWriter();
			
			out.println("<h1> Cross Check From Naresh </h1>");
			
			out.close();
			

	}

}