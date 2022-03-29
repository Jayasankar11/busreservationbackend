package com.lti.appl.busreservationbackend.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.busreservationbackend.beans.Registration;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public int addRegistration(Registration r) {
		em.persist(r);
		return r.getRid();
	}

	@Override
	@Transactional
	public boolean delRegistration(int rid) throws Exception {
		Registration r = em.find(Registration.class, rid);
		if (r != null) {
			em.remove(r);
			return true;
		} else {
			throw new Exception("registartion does not exist");
		}
	}

	@Override
	public List<Registration> getRegistrationAll() {
		Query qry = em.createQuery("select r from Registration r");
		List<Registration> RegistrationList = qry.getResultList();
		return RegistrationList;
	}

	@Override
	public Registration getregistrationById(int rid) throws Exception {
		Registration r = em.find(Registration.class, rid);
		if (r != null) {
			return r;
		} else {
			throw new Exception("Registration does not exits");
		}
	}

}
