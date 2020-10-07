package com.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utilities.TestUtility;

@Service
@Transactional
public class TestService {
	@Autowired
	private TestUtility tu;
	
	/*
	public List<Test> getTest() {
		EntityManager em = DBUtil.createEntityManager();
		List<Test> tl = em.createNamedQuery("getAllTests", Test.class)
							.getResultList();
				
						
		
		
		return tl;
	} */
	
	public String[] getTestAll() {
		return tu.getTestUtility();
	}

}
