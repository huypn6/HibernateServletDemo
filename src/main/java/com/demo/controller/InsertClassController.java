package com.demo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.ClassDAO;
import com.demo.entities.Classes;

@WebServlet("/classes/add")
public class InsertClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	ClassDAO classDAO = new ClassDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getRequestDispatcher("create.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		Classes newClass = new Classes();
		newClass.setName(name);
		classDAO.save(newClass);
		resp.sendRedirect( req.getContextPath() + "/classes");
	}

}
