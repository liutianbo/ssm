package org.ltb.example.service.impl;

import javax.annotation.Resource;

import org.ltb.example.dao.CustomerMapper;
import org.ltb.example.entity.Customer;
import org.ltb.example.service.CustomerService;
import org.springframework.stereotype.Service;

@Service("customerService")
public class CustomerServiceImpl implements CustomerService{
	@Resource
	private CustomerMapper customerMapper;
	
	public Customer getCustomerById(int customerid){
		return this.customerMapper.selectByPrimaryKey(customerid);
	}
	
	
}
