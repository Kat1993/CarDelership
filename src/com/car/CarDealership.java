package com.car;

import java.util.Arrays;

public class CarDealership {
	private Vehicle[] carForSale;
	private Vehicle[] soldCars;
	private Customer customer;
	
	public CarDealership() {
		
	}

	public Vehicle[] getCarForSale() {
		return carForSale;
	}

	public void setCarForSale(Vehicle[] carForSale) {
		this.carForSale = carForSale;
	}

	public Vehicle[] getSoldCars() {
		return soldCars;
	}

	public void setSoldCars(Vehicle[] soldCars) {
		this.soldCars = soldCars;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return " Car For Sale: " + Arrays.toString(carForSale) + " Sold Cars: " + Arrays.toString(soldCars)
				+ " Customer: " + customer ;
	}

	
}
