package com.cntyaz.springdemo.service;

import java.util.List;

import com.cntyaz.springdemo.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers(int theId);

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public List<Customer> getCustomers();

	public void deleteCustomer(int theId);

}
