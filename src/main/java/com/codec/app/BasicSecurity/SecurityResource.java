package com.codec.app.BasicSecurity;

import java.util.Base64;

import javax.websocket.server.PathParam;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/security")
public class SecurityResource {

	@GET
	@Path("/encode")
	public String encodeData(@PathParam("accountNo") String accountNo) {
		
		byte[] accArr=accountNo.getBytes();
		
		byte[] enodeAccNo;
		
		
		return null;
	}

}
