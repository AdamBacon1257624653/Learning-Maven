package com.ibm.example.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ibm.example.model.User;

public class UserServlet extends HttpServlet {

	private static final long serialVersionUID = -537302889126590253L;

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setAttribute("user", new User("Peter", 21));
		request.getRequestDispatcher("/index.jsp").forward(request, response);
	}

}
