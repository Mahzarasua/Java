package com.mycode.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycode.beans.Brand;
import com.mycode.dao.DAOBrand;
import com.mycode.service.ServiceBrand;

@Service
public class ServiceBrandImpl implements ServiceBrand {

	@Autowired
	private DAOBrand daoBrand;

	public void register(Brand brand) throws Exception {
		try {
			daoBrand.register(brand);
		} catch (Exception e) {
			throw e;
		}
	}

}
