package com.formula.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.formula.myspring.service.ClientService;
import com.formula.myspring.service.impl.ClientServiceImpl;

@Configuration
@ComponentScan
public class App {
	
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(App.class);
		ClientService clientService = context.getBean(ClientServiceImpl.class);
		System.out.println(clientService.getClientName());
	}
}
