package com.bbva.bdcd.dtos.personas.test;

import org.junit.Before;
import org.junit.Test;
import com.bbva.bdcb.dto.personas.DataIn;
import junit.framework.Assert;

public class DataInTest {
	DataIn data = new DataIn();
	
	/**
	 * Varaible inizilitations
	 */
	@Before
	public void starning(){
		data.setNumeroDeTarjeta("0000000000000");
		data.setNumeroDeCuotas("1");
	}
	
	/**
	 * Method for test the sentence get()  - enden ok
	 */
	@Test
	public void getTest(){
		Assert.assertEquals(data.getNumeroDeTarjeta(), "0000000000000");
		Assert.assertEquals(data.getNumeroDeCuotas(), "1");
	}
	
	
	/**
	 * Method for test the sentence hashCode()  - enden ok
	 */
	@Test
	public void hashCodeTest(){
		int hashCode = data.hashCode();
		Assert.assertEquals(data.hashCode(), hashCode);
	}
	
	/**
	 * Method for test the sentence hashCode()  - enden fail
	 */
	@Test
	public void hashCodeFail(){
		Assert.assertFalse(((Integer)data.hashCode()).equals(1));
	}
	
	/**
	 * Method for test the sentence hashCode()  - enden ok
	 */
	@Test
	public void hashCodeNull(){
		DataIn aux = new DataIn();
		int hashCode = aux.hashCode();
		Assert.assertEquals(aux.hashCode(), hashCode);		
	}
	
	/**
	 * Method for test the sentence equals()  - enden ok
	 */
	@Test
	public void equalsTest(){
		DataIn aux = new DataIn();
		
		//General
		Assert.assertEquals(data.equals(data), true);
		Assert.assertEquals(data.equals(null), false);
		Assert.assertEquals(data.equals("hola"), false);
		
		//Attributes
		Assert.assertEquals(aux.equals(data), false);
		aux.setNumeroDeCuotas(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setNumeroDeCuotas(data.getNumeroDeCuotas());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setNumeroDeTarjeta(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setNumeroDeTarjeta(data.getNumeroDeTarjeta());
		
		Assert.assertEquals(data.equals(aux), true);
	}
	
	/**
	 * Method to test the sentence toString() - ended ok
	 */
	@Test
	public void toStringTest(){
		Assert.assertEquals(data.toString(), "DataIn [numeroDeTarjeta=0000000000000, numeroDeCuotas=1]");
	}
	
	/**
	 * Method to test the sentence toString()  - enden fail
	 */
	@Test
	public void toStringFailTest(){
		Assert.assertFalse(data.toString().equals("DataIn [numeroDeTarjeta=11]"));
	}
	
}
