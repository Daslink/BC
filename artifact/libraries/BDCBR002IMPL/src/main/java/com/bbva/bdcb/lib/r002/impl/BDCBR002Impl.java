package com.bbva.bdcb.lib.r002.impl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bbva.bdcb.dto.personas.DataOut;
import com.bbva.bdcb.lib.r002.BDCBR002;

public class BDCBR002Impl extends BDCBR002Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(BDCBR002.class);

	@Override
	public DataOut execute(String numeroDeCuenta, String numeroDeCuotas) throws IOException,FileNotFoundException, JsonGenerationException, JsonMappingException, FileNotFoundException, IOException {
		
		LOGGER.info("Starting execute");
		
		DataOut dataOut = new DataOut();
		
		String[] datos = readFile(numeroDeCuenta);
		
		dataOut = inicializarObjeto(datos, numeroDeCuotas);
		
		createJson(dataOut);
		
		return dataOut;
	}

	/**
	 * @param numeroDeCuenta
	 * @throws IOException
	 * Method to search the client
	 */
	private String[] readFile(String numeroDeCuenta) throws IOException,FileNotFoundException {
		String linea = null;
		BufferedReader bf = new BufferedReader(new FileReader(
				"C:\\Users\\hdramos\\Downloads\\IDE_APX_win64\\IDE_APX_win64\\workspace\\UF_buscarCliente_BDCB\\ListadoTarjetas2.txt"));
		while ((linea = bf.readLine()) != null) {
			String datos[] = linea.split(";");
			if ((datos[0] + datos[1]).equals(numeroDeCuenta)) {
				return datos;
			}
		}
		return null;
	}
	
	/**
	 * @param datos
	 * @return
	 * Method to inicilization DataOut
	 */
	private DataOut inicializarObjeto(String[] datos, String numeroDeCuotas){
		DataOut aux = new DataOut();
		
		aux.setEntidad(datos[2]);
		aux.setCentro(datos[3]);
		aux.setProducto(datos[4]);
		aux.setNumeroContrato(datos[5]);
		aux.setNombreTitular(datos[6]);
		aux.setDireccionTitular(datos[7]);
		
		datos[8] = datos[8].replace(',', '.');
		double interes = Double.parseDouble(datos[8]);
		long saldoTotal = (Long.parseLong(datos[9]));
		int limite = Integer.parseInt(numeroDeCuotas);

		String cuotas[]= new String[limite];
		for(int i =0; i<limite; i++){
			if(i ==0){
				cuotas[i] = "Cuota "+ (i+1) +": "+ (long)saldoTotal/limite;
			}else{
			if(i==1){
				cuotas[i] = "Cuota "+ (i+1) +": "+  (long)((saldoTotal*interes)+((saldoTotal-(saldoTotal/limite))*interes));
			}else{
				cuotas[i]= "Cuota "+ (i+1) +": "+ (long)((saldoTotal-((saldoTotal/limite)*i))*interes);
			}
		} 
	}
		aux.setCuotas(cuotas);
		
		return aux;
	}
	
	/**
	 * @param data
	 * @throws JsonGenerationException
	 * @throws JsonMappingException
	 * @throws FileNotFoundException
	 * @throws IOException
	 * Method to create the json
	 */
	private void createJson(DataOut data) throws JsonGenerationException, JsonMappingException, FileNotFoundException, IOException{
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new FileOutputStream(
				"C:\\Users\\hdramos\\Downloads\\IDE_APX_win64\\IDE_APX_win64\\workspace\\UF_buscarCliente_BDCB\\cliente.json"), data);	
	}
}
