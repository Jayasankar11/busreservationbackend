package com.lti.appl.busreservationbackend.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.appl.busreservationbackend.beans.Registration;
import com.lti.appl.busreservationbackend.dao.RegistrationDaoImpl;
import com.lti.appl.busreservationbackend.service.RegistrationService;
import com.lti.appl.busreservationbackend.service.RegistrationServiceImpl;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Registration")
public class RegistrationController {
	@Autowired
	RegistrationServiceImpl registrationservice;

	// http://localhost:8815/Registration/addregistration
	@PostMapping("/addregistration")
	public int addRegistration(@RequestBody Registration r) {
		return registrationservice.addRegistration(r);

	}

	// http://localhost:8815/Registration/delRegistration
	@GetMapping("/delRegistration/{id}")
	public boolean deleteRegistration(@PathVariable(value = "id") int rid) throws Exception {
		return registrationservice.delRegistration(rid);
	}

	// http://localhost:8815/Registration/getregistrationAll
	@GetMapping("/getregistrationAll")
	public List<Registration> getRegistrationAll() {
		return registrationservice.getRegistrationAll();
	}

	// http://localhost:8815/Registration/getRegistrationById/
	@GetMapping("/getRegistrationById/{id}")
	public Registration getregistrationById(@PathVariable(value = "id") int rid) throws Exception {
		return registrationservice.getregistrationById(rid);
	}

}
