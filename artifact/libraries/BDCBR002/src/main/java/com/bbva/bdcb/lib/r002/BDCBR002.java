package com.bbva.bdcb.lib.r002;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import com.bbva.bdcb.dto.personas.DataOut;

public interface BDCBR002 {

	DataOut execute(String numeroDeCuenta,String numeroDeCuotas) throws IOException,FileNotFoundException, JsonGenerationException, JsonMappingException, FileNotFoundException, IOException;

}
