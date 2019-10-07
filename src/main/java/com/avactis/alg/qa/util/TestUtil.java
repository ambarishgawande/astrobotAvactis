package com.avactis.alg.qa.util;

import com.avactis.alg.qa.base.ProjectBase;

public class TestUtil extends ProjectBase {
	
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 20;
	
	public void switchToFrame(String frameName) {
		driver.switchTo().frame(frameName);
	}

}
