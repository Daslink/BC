package com.bbva.bdcb.lib.r002;

import javax.annotation.Resource;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.Advised;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bbva.bdcb.dto.personas.DataOut;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
		"classpath:/META-INF/spring/BDCBR002-app.xml",
		"classpath:/META-INF/spring/BDCBR002-app-test.xml",
		"classpath:/META-INF/spring/BDCBR002-arc.xml",
		"classpath:/META-INF/spring/BDCBR002-arc-test.xml" })
public class BDCBR002Test {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(BDCBR002.class);
	
	@Resource(name = "bdcbR002")
	private BDCBR002 bdcbR002;
	
	@Before
	public void setUp() throws Exception {		
		getObjectIntrospection();
	}
	
	private Object getObjectIntrospection() throws Exception{
		Object result = this.bdcbR002;
		if(this.bdcbR002 instanceof Advised){
			Advised advised = (Advised) this.bdcbR002;
			result = advised.getTargetSource().getTarget();
		}
		return result;
	}
	
	@Test
	public void executeTest(){
		DataOut aux = new DataOut();
		LOGGER.info("Executing the test...");
		try{
		aux = bdcbR002.execute("5865734442920128", "5");
		Assert.assertEquals(aux.getNombreTitular(), "ADRIANA HERNANDEZ BRAVO");
		}catch(Exception e){
			LOGGER.info("Error: execute.Error....");
		}
		LOGGER.info("Executing ok....");
	}	
}
