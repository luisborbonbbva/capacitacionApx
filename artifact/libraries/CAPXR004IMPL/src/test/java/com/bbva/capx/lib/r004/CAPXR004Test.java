package com.bbva.capx.lib.r004;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/CAPXR004-app.xml",
		"classpath:/META-INF/spring/CAPXR004-app-test.xml",
		"classpath:/META-INF/spring/CAPXR004-arc.xml",
		"classpath:/META-INF/spring/CAPXR004-arc-test.xml" })
public class CAPXR004Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(CAPXR004.class);
	
	@Resource(name = "capxR004")
	private CAPXR004 capxR004;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.capxR004;
		if(this.capxR004 instanceof Advised){
			Advised advised = (Advised) this.capxR004;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		LOGGER.info("Executing the test...");
		capxR004.execute();
	}
	
}
