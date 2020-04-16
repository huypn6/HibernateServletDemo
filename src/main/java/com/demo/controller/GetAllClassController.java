package com.demo.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.dao.ClassDAO;
import com.demo.entities.Classes;

@WebServlet("/classes")
public class GetAllClassController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ClassDAO dao = new ClassDAO();
		List<Classes> list = dao.getAll();
		request.setAttribute("listClass", list);
		request.getRequestDispatcher("home.jsp").forward(request, response);
	}

}
