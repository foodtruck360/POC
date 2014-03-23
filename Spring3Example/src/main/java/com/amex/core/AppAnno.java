package com.amex.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.amex.customer.bo.CustomerBo;
import com.amex.customer.bo.impl.CustomerBoImpl;

public class AppAnno {
	public static void main(String[] args) throws Exception {

		ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer-Anno.xml");

		CustomerBo customer = new CustomerBoImpl();
		customer.addCustomer();
		
		//customer.addCustomerReturnValue();
		
		//customer.addCustomerThrowException();
		
		customer.addCustomerAround("TEST","HI");

	}
}