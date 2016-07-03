package org.ltb.example.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.ltb.example.entity.Customer;
import org.ltb.example.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class CustomerController {
	@Autowired
	private CustomerService customerService;

	@RequestMapping("/showUser.do")
	public String toIndex(HttpServletRequest request, Model model) {
		System.out.println("11111111111111111111");
		int customerid = Integer.parseInt(request.getParameter("id"));
		Customer customer= this.customerService.getCustomerById(customerid);
		System.out.println("22：：  " + customer.getName());
		model.addAttribute("customer", customer);
		return "showUser";
	}
	
	
	

}
