package com.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.car.Vehicle;

/**
 * Servlet implementation class SoldCarsServlet
 */
@WebServlet("/SoldCarsServlet")
public class SoldCarsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SoldCarsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		
		
		HttpSession session = request.getSession(true);
		String vin  = "65483";
		
		ArrayList<Vehicle> vehicles = Vehicle.soldVehicles(vin);
		for(int i = 0; i< vehicles.size();i++) {
			if
			(vehicles.get(i).getVinNumber().equals(vin)) {
				
				Vehicle vehicle = new Vehicle ();
				
				 vehicle.setColor(vehicles.get(i).getColor());
				 
				 vehicle.setCondition(vehicles.get(i).getCondition());
				 vehicle.setMake(vehicles.get(i).getMake());
				 vehicle.setMileage(vehicles.get(i).getMileage());
				 vehicle.setModel(vehicles.get(i).getModel());
				 vehicle.setPic(vehicles.get(i).getPic());
				 vehicle.setPrice(vehicles.get(i).getPrice());;
				 vehicle.setStyle(vehicles.get(i).getStyle());
				 vehicle.setVinNumber(vehicles.get(i).getVinNumber());
				 vehicle.setYear(vehicles.get(i).getYear());
				 vehicle.saveToFileSold();
				 
				
			}
		
		}
		session.setAttribute("vehicles", vehicles);
		
	  RequestDispatcher rs = request.getRequestDispatcher("soldCars.jsp");
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
