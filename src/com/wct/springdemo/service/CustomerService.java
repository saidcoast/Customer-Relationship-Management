package com.wct.springdemo.service;

import java.util.List;

import com.wct.springdemo.entity.Customer;

public interface CustomerService {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomers(int theId);

	public void deleteCustomers(int theId);
	
	
}
