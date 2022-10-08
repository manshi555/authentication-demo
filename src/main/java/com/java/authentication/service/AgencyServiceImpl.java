package com.java.authentication.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.authentication.dao.AgencyDAO;
import com.java.authentication.entity.Agency;


@Service
public class AgencyServiceImpl implements AgencyService{

	@Autowired
	 AgencyDAO agencyDAO;
	
	@Override
	public Agency saveAgent(Agency agency) {
		return agencyDAO.save(agency);
		
	}





}
