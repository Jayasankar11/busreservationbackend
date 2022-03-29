package com.lti.appl.busreservationbackend.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.busreservationbackend.beans.Registration;
import com.lti.appl.busreservationbackend.dao.RegistrationDao;

@Service("RegistrationService")
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDao dao;

	public RegistrationDao getDao() {
		return dao;
	}

	public void setDao(RegistrationDao dao) {
		this.dao = dao;
	}

	public int addRegistration(Registration r) {
		dao.addRegistration(r);
		System.out.println(" service layer ");
		return r.getRid();
	}

	@Override
	public boolean delRegistration(int rid) throws Exception {
		boolean r = dao.delRegistration(rid);
		return r;
	}

	public List<Registration> getRegistrationAll() {
		List<Registration> registrationList = dao.getRegistrationAll();
		return registrationList;
	}

	@Override
	public Registration getregistrationById(int rid) throws Exception {
		Registration r = dao.getregistrationById(rid);
		return r;
	}

}
