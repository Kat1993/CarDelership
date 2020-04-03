package com.car;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.servlet.http.HttpSession;

public class Vehicle {
	
private String pic;	
private String vinNumber;

private String price;
private String year;
private String make;
private String model;
private String mileage;
private String style;
private String condition;
private String color;
private static final String path ="/Users/katerynatsymbal/Desktop/carInventory/";
public Vehicle() {
	
	
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	this.price = price;
}

public String getPic() {
	return pic;
}

public void setPic(String pic) {
	this.pic = pic;
}

public String getVinNumber() {
	return vinNumber;
}

public void setVinNumber(String vinNumber) {
	this.vinNumber = vinNumber;
}

public String getMake() {
	return make;
}

public void setMake(String make) {
	this.make = make;
}

public String getModel() {
	return model;
}

public void setModel(String model) {
	this.model = model;
}

public String getMileage() {
	return mileage;
}

public void setMileage(String mileage) {
	this.mileage = mileage;
}





public String getStyle() {
	return style;
}

public void setStyle(String style) {
	this.style = style;
}

public String getCondition() {
	return condition;
}

public void setCondition(String condition) {
	this.condition = condition;
}

public String getColor() {
	return color;
}

public void setColor(String color) {
	this.color = color;
}

public String getYear() {
	return year;
}

public void setYear(String year) {
	this.year = year;
}

@Override
public String toString() {
	return "VIN: " + vinNumber +" Year: "+year+ " Make: " + make + " Model: " + model + " Mileage: " + mileage + " MPG: "
			+ mileage+ " Style: " + style + " Condition: " + condition + " color: " + color +" Price: "+price ;
}



private  String formatData() {
	// cars will be separated  by ","
	return this.vinNumber+","+ this.year+","+this.make+","+this.model+","+this.mileage+","+ this.style+","+this.condition+","+this.color+","+ this.pic+","+this.price +"\n";
	
}
public void saveToFile() {
	//  im saving all my cars in one file separating by new line
	String fileName = path+"cars"+".txt";
	
	try {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
		 
		//bw.append("//");
		
		bw.write(formatData());
		
		
	    
		bw.close();
		
	
	}catch(IOException e){
		System.out.println("Error writing to file ");
		
	}
	
	
	
}
public static ArrayList<Vehicle> readFromFile() {
	
	String fileName = path+"cars"+".txt";


	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	Scanner in;
	try {
		
		in = new Scanner(new File(fileName));
		
		while(in.hasNextLine()) {
			
		
		//String line = in.nextLine();
		
		
		String cars = in.nextLine();
		String[] carObj = cars.split(",");
		
		
		
		//String newVehicle = carObj[0];
		
		//String[] prasedLine = line.split(",");
		
		String vin = carObj[0];
		String year = carObj[1];
		String make1 = carObj[2];
		String model = carObj[3];
		String mileage = carObj[4];
		String style = carObj[5];
		String condition = carObj[6];
		String color = carObj[7];
		String pic = carObj[8];
		String price = carObj[9];
		

		Vehicle vehicle = new Vehicle();
		
		vehicle.setColor(color);
		vehicle.setCondition(condition);
		vehicle.setMake(make1);
		vehicle.setMileage(mileage);
		vehicle.setModel(model);
		vehicle.setPic(pic);
		vehicle.setPrice(price);
		vehicle.setStyle(style);
		vehicle.setVinNumber(vin);
		vehicle.setYear(year);
		 
		
		vehicles.add(vehicle);
		
		}
		
	}catch(FileNotFoundException e) {
		
		e.printStackTrace();
	}
	System.out.println(vehicles);
	return vehicles;
	
}
public void saveToFileSold() {
	// that foe keeping track of my sold cars 
	String fileName = path+"soldCars"+".txt";
	
	try {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
		 
		//bw.append("//");
		
		bw.write(formatData());
		
	    
		bw.close();
	
	}catch(IOException e){
		System.out.println("Error writing to file ");
		
	}
	
}
 public static  ArrayList<Vehicle> soldVehicles(String vinNumb){
	 
	 ArrayList<Vehicle> soldCars = new ArrayList<Vehicle>();
	 
	 String fileName = path+"cars"+".txt";
	 Scanner in;
	 try {
		 in = new Scanner(new File(fileName));
		 while(in.hasNextLine()) {
			 String cars = in.nextLine();
				String[] carObj = cars.split(",");
				
				String vin = carObj[0];
				String year = carObj[1];
				String make1 = carObj[2];
				String model = carObj[3];
				String mileage = carObj[4];
				String style = carObj[5];
				String condition = carObj[6];
				String color = carObj[7];
				String pic = carObj[8];
				String price = carObj[9];

				Vehicle vehicle = new Vehicle();
				
				vehicle.setColor(color);
				vehicle.setCondition(condition);
				vehicle.setMake(make1);
				vehicle.setMileage(mileage);
				vehicle.setModel(model);
				vehicle.setPic(pic);
				vehicle.setPrice(price);
				vehicle.setStyle(style);
				vehicle.setVinNumber(vin);
				vehicle.setYear(year);
              // for(int i = 0; i< carObj.length;i++) {
            	   
            	
			if(vehicle.getVinNumber().equals(vinNumb)) {
				soldCars.add(vehicle);
				
				System.out.println(soldCars);
				
				
			}
					 
			//	String newFileName = path+"soldCars"+"text";
//				try {
//					
//				BufferedWriter bw = new BufferedWriter(new FileWriter(newFileName,true));
//				 
//				//bw.append("//");
//				
//				bw.write(formatData());									    
//					bw.close();
//					}catch(IOException e){
//						System.out.println("Error writing to file ");
//				
//					}
					
				//}
				
			 
		 //}
               }
	       }catch(FileNotFoundException e) {
		    e.printStackTrace();
	    }
	 
	 
	 return soldCars;
	 
 }

	

}
