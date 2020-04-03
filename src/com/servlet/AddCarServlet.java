package com.servlet;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.car.Vehicle;

/**
 * Servlet implementation class AddCarServlet
 */
@WebServlet("/AddCarServlet")
public class AddCarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCarServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Vehicle vihicle = new Vehicle();
		
		
		vihicle.setColor(request.getParameter("color"));
		vihicle.setCondition(request.getParameter("condition"));
		vihicle.setMake(request.getParameter("make"));
		vihicle.setMileage(request.getParameter("mileage"));
		vihicle.setModel(request.getParameter("model"));
		vihicle.setPrice(request.getParameter("price"));
		vihicle.setStyle(request.getParameter("style"));
		vihicle.setVinNumber(request.getParameter("vinNumber"));
		vihicle.setYear(request.getParameter("year"));
		vihicle.setPic(request.getParameter("pic"));
		
		vihicle.saveToFile();
		
		HttpSession session = request.getSession(true);
		session.setAttribute("vihicle", vihicle);
		
		RequestDispatcher rs = request.getRequestDispatcher("addCar.jsp");
		rs.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
