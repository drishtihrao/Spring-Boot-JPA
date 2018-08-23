package com.demo.rest.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.rest.dao.CustomerDAO;
import com.demo.rest.pojo.Customer;

@Component
public class CustomerServiceImpl implements Service {

	@Autowired
	private CustomerDAO dao; //= new DaoImpl();

	@Override
	public void addCustomer(Customer customer) {
		dao.save(customer);

	}

	@Override
	public Collection<Customer> viewAllCustomers() {
		return dao.findAll();
	}

	@Override
	public void updateCustomer(Customer customer) {
		dao.save(customer);
		
	}

	@Override
	public void deleteCustomer(int customerId) {
		dao.deleteById(customerId);
		
	}

	@Override
	public Customer getCustomerById(int customerId)  {
		return dao.findById(customerId).get();
	}

}
