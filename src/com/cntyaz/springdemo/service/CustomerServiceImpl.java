package com.cntyaz.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cntyaz.springdemo.dao.CustomerDAO;
import com.cntyaz.springdemo.entity.Customer;


@Service
public class CustomerServiceImpl implements CustomerService {

	// need to inject customer dao
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomer();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		
		
		customerDAO.saveCustomer(theCustomer);
		
	}

	@Override
	public List<Customer> getCustomers(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		
		customerDAO.deleteCustomer(theId);
	}

}
