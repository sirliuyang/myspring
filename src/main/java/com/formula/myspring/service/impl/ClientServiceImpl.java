package com.formula.myspring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formula.myspring.dao.ClientDAO;
import com.formula.myspring.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientDAO clientDao;
	
	@Autowired
	public String getClientName() {
		return "Temp";
	}
	
}
