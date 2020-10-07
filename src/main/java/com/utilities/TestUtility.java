package com.utilities;

import org.springframework.stereotype.Repository;

@Repository
public class TestUtility {
	public String[] getTestUtility() {
		String[] tl = {"testOne","testTwo", "testThree"};
		return tl;
	}

}
