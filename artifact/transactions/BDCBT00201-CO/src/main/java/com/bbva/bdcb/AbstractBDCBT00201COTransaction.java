package com.bbva.bdcb;

import com.bbva.bdcb.dto.personas.DataOut;
import com.bbva.bdcb.dto.personas.DataIn;
import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractBDCBT00201COTransaction extends AbstractTransaction {

	public AbstractBDCBT00201COTransaction(){
	}
		
	/**
	 * @return
	 * Method to get
	 */
	protected DataIn getDataIn(){
		return (DataIn)getParameter("dataIn");
	}
	/**
	 * Set value for output parameter DataOut
	 */
	protected void setDataOut(final DataOut field){
		this.addParameter("DataOut", field);
	}			
	
}
