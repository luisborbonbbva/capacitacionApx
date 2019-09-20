package com.bbva.capx;


import com.bbva.capx.dto.proy1.DataOut;
import com.bbva.capx.dto.proy1.DataInt;

import com.bbva.elara.transaction.AbstractTransaction;

public abstract class AbstractCAPXT00001COTransaction extends AbstractTransaction {

	public AbstractCAPXT00001COTransaction(){
		
		}

		/**
		 * Return value for input parameter dataIn
		 */
		protected DataInt getDatain(){
			return (DataInt)getParameter("dataIn");
		}
		
			

		/**
		 * Set value for output parameter dataOut
		 */
		protected void setDataout(final DataOut field){
			this.addParameter("dataOut", field);
		}			
		
		
		
	}
	
	
	
	/*
	/**
	 * Return value for input parameter Origen
	 
	protected String getOrigen()
	{
		return (String)getParameter("Origen");
	}
	/**
	 * Return value for input parameter Destino
	 
	protected String getDestino()
	{
		return (String)getParameter("Destino");
	}
	
	

	
	/**
	 * Set value for output parameter Tiempo
	 
	protected void setTiempo(final String field)
	{
		this.addParameter("Tiempo", field);
	}
	/**
	 * Set value for output parameter Distancia
	 *
	protected void setDistancia(final String field)
	{
		this.addParameter("Distancia", field);
	}
	
*/

