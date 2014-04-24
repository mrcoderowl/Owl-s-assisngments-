package com.Protocol;

import java.util.HashMap;
import java.util.Map;

public class NewOrderSingleTagErrors {
	
	//String errors for tag violations
	
	 public String getErrorMessage(String message){
		 
		    Map <String,String> errors=new HashMap<String,String>();
		    
		    errors.put("35", "Invalid: incorrect value- message retracted.");
			errors.put("11", "Invalid: no name or identifier detected- message retracted.");
			errors.put("54", "Invalid: incorrect side value- message retracted. ");
			errors.put("60", "Invalid: no valid time detected - message retracted");
			errors.put("40", "Invalid: incorrect order value- message retracted");
			errors.put("10", "Invalid: expecting three digit value- message retracted");
			
		return errors.get(message);
	}

}
