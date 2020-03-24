package com.bbva.bdcb;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.bbva.bdcb.dto.personas.DataIn;
import com.bbva.bdcb.dto.personas.DataOut;
import com.bbva.bdcb.lib.r002.BDCBR002;
import com.bbva.bdcb.AbstractBDCBT00201COTransaction;
import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;

/**
 * Transaccion
 * Implementacion de logica de negocio.
 * @author hdramos
 *
 */
public class BDCBT00201COTransaction extends AbstractBDCBT00201COTransaction {
	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractBDCBT00201COTransaction.class);

	@Override
	public void execute() {
		try{
			BDCBR002 BDCBR002 = (BDCBR002) getServiceLibrary(BDCBR002.class);
			DataIn dataIn = this.getDataIn();
			DataOut dataOut = BDCBR002.execute(dataIn.getNumeroDeTarjeta(), dataIn.getNumeroDeCuotas());
			LOGGER.debug("Successful search");
			setContentLocation(getURIPath());
			setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
			this.setDataOut(dataOut);
			}catch(Exception e){
				LOGGER.debug("Error search");
			}
		}
		
	}

