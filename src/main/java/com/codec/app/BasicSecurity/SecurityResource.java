package com.codec.app.BasicSecurity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/security")
public class SecurityResource {

	@GET
	@Path("/encode")
	public String encodeData(@javax.ws.rs.PathParam("accountNo") String accountNo) {
		
		byte[] accArr=accountNo.getBytes();
		
		byte[] enodeAccNo;
		
		
		return null;
	}

}
