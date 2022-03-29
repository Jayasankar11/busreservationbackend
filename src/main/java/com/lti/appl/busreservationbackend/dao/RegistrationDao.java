package com.lti.appl.busreservationbackend.dao;

import java.util.List;

import com.lti.appl.busreservationbackend.beans.Registration;

public interface RegistrationDao {

	public int addRegistration(Registration r);

	public boolean delRegistration(int rid) throws Exception;

	public List<Registration> getRegistrationAll();

	public Registration getregistrationById(int rid) throws Exception;

}
