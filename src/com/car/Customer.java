package com.car;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Customer {
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNumber;
	private String idNumber;
	private Address address;
	private static final String path ="/Users/katerynatsymbal/Desktop/carRegister/";
	public Customer() {
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "First Name: " + firstName + " Last Name: " + lastName + " Phone Number: " + phoneNumber
				+ " ID: " + idNumber + " Address: " + address ;
	}
	public void saveToFile() {
		String fileName = path+this.email+ this.password+".txt";
		
		try {
			
			BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
			bw.write(formatData());
			bw.close();
		}catch(IOException e){
			System.out.println("Error writing to file ");
			
		}
		
	} 

	private String  formatData() {
		
		return this.firstName+","+this.lastName+","+this.email+","+this.password+","+this.phoneNumber+","+this.idNumber+","+this.address.formatData();
	}
public static Customer readFromFile(String email,String password) {
	String fileName = path+ email + password +".txt";
	Customer customer = new Customer();
	Address address = new Address();
	
		Scanner in;
		try {
			in = new Scanner(new File(fileName));
		
		String line = in.nextLine();
	    String [] prasedLine = line.split(",");
        String firstName = prasedLine[0];
        String lastName = prasedLine[1];
        String emailAddress = prasedLine[2];
        String password1 = prasedLine[3];
        String phoneNumber =prasedLine[4];
        String ID = prasedLine[5];
        String street = prasedLine[6];
        String city = prasedLine[7];
        String state = prasedLine[8];
        String zip = prasedLine[9];
        address.setStreet(street);
        address.setCity(city);
        address.setState(state);
        address.setZip(zip);
        
        customer.firstName =firstName;
        customer.lastName = lastName;
        customer.email = emailAddress;
        customer.password = password1;
        customer.phoneNumber = phoneNumber;
        customer.idNumber = ID;
        customer.address = address;
	
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
	    
	return customer;
	
}
}
