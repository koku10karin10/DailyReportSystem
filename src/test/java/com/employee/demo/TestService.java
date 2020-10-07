package com.employee.demo;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class TestService {
	public String getTest() {
		return "Hello , World";
	}

}
