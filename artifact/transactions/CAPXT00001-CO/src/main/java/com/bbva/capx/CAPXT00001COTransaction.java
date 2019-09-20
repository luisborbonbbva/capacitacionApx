package com.bbva.capx;
import com.bbva.capx.lib.r004.CAPXR004;


import com.bbva.capx.dto.proy1.DataInt;
import com.bbva.capx.dto.proy1.DataOut;
import com.bbva.capx.lib.r002.CAPXR002;
import com.bbva.elara.domain.transaction.Severity;
import com.bbva.elara.domain.transaction.response.HttpResponseCode;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.elara.transaction.AbstractTransaction;

/**
 * Transaccion api google
 * Implementacion de logica de negocio.
 * @author lborbon
 *
 */
public class CAPXT00001COTransaction extends AbstractCAPXT00001COTransaction {

//	private static final Logger LOGGER = LoggerFactory.getLogger(CAPXT00001COTransaction.class);
	
	@Override
	public void execute() {
		CAPXR004 capxR004 = (CAPXR004)getServiceLibrary(CAPXR004.class);
		DataInt dataInt = this.getDatain();

		DataOut dataOut = null;

			try {
				dataOut = capxR004.execute(dataInt.getOrigin(), dataInt.getDestination());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		setContentLocation(getURIPath());
		setHttpResponseCode(HttpResponseCode.HTTP_CODE_200, Severity.OK);
		this.setDataout(dataOut);

	}

	
	
	
	
}
