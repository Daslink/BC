package com.bbva.bdcd.dtos.personas.test;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import com.bbva.bdcb.dto.personas.DataOut;
import junit.framework.Assert;

public class DataOutTest {
	DataOut data =  new DataOut();
	
	/**
	 * Variable inizialitation
	 */
	@Before
	public void starning(){
		data.setEntidad("0013");
		data.setCentro("0001");
		data.setProducto("53");
		data.setNumeroContrato("0000000");
		data.setNombreTitular("Hernan Ramos");
		data.setDireccionTitular("Calle 74 # 77b-23");
		String array[] = {"cuota1","cuota2","cuota3"};
		data.setCuotas(array);
	}
	
	/**
	 * Method to test the sentence get() - ended ok
	 */
	@Test
	public void getTest(){
		Assert.assertEquals(data.getEntidad(), "0013");
		Assert.assertEquals(data.getCentro(), "0001");
		Assert.assertEquals(data.getProducto(), "53");
		Assert.assertEquals(data.getNumeroContrato(), "0000000");
		Assert.assertEquals(data.getNombreTitular(), "Hernan Ramos");
		Assert.assertEquals(data.getDireccionTitular(), "Calle 74 # 77b-23");
		Assert.assertEquals(Arrays.toString(data.getCuotas()), "[cuota1, cuota2, cuota3]");	
	}
	
	/**
	 * Method to test the sentence hashCode() - ended ok
	 */
	@Test
	public void hashCodeTest(){
		int hashCode = data.hashCode();
		Assert.assertEquals(data.hashCode(), hashCode);
	}
	
	/**
	 * Method to test the sentence hashCode() - ended fail
	 */
	@Test
	public void hashCodeFailTest(){
		Assert.assertFalse(((Integer)data.hashCode()).equals(1));
	}
	
	/**
	 * Method to test the sentence hashCode() - ended ok
	 */
	@Test
	public void hashCodeNullTest(){
		DataOut aux = new DataOut();
		int hashCode = aux.hashCode();
		Assert.assertEquals(aux.hashCode(), hashCode);
	}
	
	/**
	 * Method to test the sentence equals() - ended ok
	 */
	@Test
	public void equalsTest(){
		DataOut aux = new DataOut();
		
		//Genaral
		Assert.assertEquals(data.equals(data), true);
		Assert.assertEquals(data.equals(null), false);
		Assert.assertEquals(data.equals("hola"), false);
		
		//Attributes
		Assert.assertEquals(aux.equals(data), false);
		aux.setNumeroContrato(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setNumeroContrato(data.getNumeroContrato());
			
		Assert.assertEquals(aux.equals(data), false);
		aux.setCentro(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setCentro(data.getCentro());
		
		Assert.assertEquals(aux.equals(data), false);
		String array[] = {" "};
		aux.setCuotas(array);
		Assert.assertEquals(data.equals(aux), false);
		aux.setCuotas(data.getCuotas());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setDireccionTitular(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setDireccionTitular(data.getDireccionTitular());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setEntidad(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setEntidad(data.getEntidad());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setNombreTitular(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setNombreTitular(data.getNombreTitular());
		
		Assert.assertEquals(aux.equals(data), false);
		aux.setProducto(" ");
		Assert.assertEquals(data.equals(aux), false);
		aux.setProducto(data.getProducto());
				
		Assert.assertEquals(aux.equals(data), true);
	}
	
	/**
	 * Method to test the sentence toString() - ended ok
	 */
	@Test
	public void toStringTest(){
		Assert.assertEquals(data.toString(), "DataOut [entidad=0013, centro=0001, producto=53, NumeroContrato=0000000, nombreTitular=Hernan Ramos, direccionTitular=Calle 74 # 77b-23, cuotas=[cuota1, cuota2, cuota3]]");
	}
	
	/**
	 * Method to test the sentence toString() - ended ok
	 */
	@Test
	public void toStringFailTest(){
		Assert.assertFalse(data.toString().equals(" "));
	}
	
}
