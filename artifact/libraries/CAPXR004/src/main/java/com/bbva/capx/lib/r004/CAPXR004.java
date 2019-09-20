package com.bbva.capx.lib.r004;

import java.io.IOException;

import com.bbva.capx.dto.proy1.DataOut;

public interface CAPXR004 {

	void execute();
	
	DataOut execute(String origin, String destination) throws IOException;

}
