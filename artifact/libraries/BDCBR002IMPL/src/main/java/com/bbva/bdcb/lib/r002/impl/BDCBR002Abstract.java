package com.bbva.bdcb.lib.r002.impl;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.configuration.manager.application.ApplicationConfigurationService;
import com.bbva.elara.library.AbstractLibrary;
import com.bbva.bdcb.lib.r002.BDCBR002;

public abstract class BDCBR002Abstract extends AbstractLibrary implements BDCBR002 {

	private static final Logger LOGGER = LoggerFactory.getLogger(BDCBR002.class);
	
	protected ApplicationConfigurationService applicationConfigurationService;
	
	/**
	 * @param applicationConfigurationService the applicationConfigurationService to set
	 */
	public void setApplicationConfigurationService(
			ApplicationConfigurationService applicationConfigurationService) {
		this.applicationConfigurationService = applicationConfigurationService;
	}
	
}
