package com.Protocol;
import com.Protocol.NewOrderSingleTagValues;
import com.Protocol.NewOrderSingleTagErrors;

public class NewOrderSingleTagValidator {
	
	
	private NewOrderSingleTagErrors errorDisplay=new NewOrderSingleTagErrors();
	
	public boolean ValidateMessage(String message){
		NewOrderSingleTagValues tags =new NewOrderSingleTagValues();
		
		//for 35
		if(!(tags.isValidTag35(message))){
			displayError("35");
			return false;
			}
		
		//for 11
		if(!(tags.isValidTag11(message))){
			displayError("11");
			return false;
			}
			
		//for 60
		if(!(tags.isValidTag60(checkTag(message,"60=")))){
			displayError("60");
			return false;
			}
		
		//for 40
		if(!(tags.isValidTag40(checkTag(message,"40=").charAt(0)))){
			displayError("40");
			return false;
			}
	  
		//for 54
		if (!(tags.isValidTag54(checkTag(message,"54=").charAt(0)))){
			displayError("54");
			return false;
			}
		
		//for 10
		if (!(tags.isValidTag10(checkTag(message,"10=")))){
			displayError("10");
			return false;
			}
		
		return true;
			
	}
	
	
	// looks for  "<tag>=" as delimiter
	private String checkTag(String tag, String delimiter){
		if (tag.contains(delimiter)){
			String[] result = tag.split(delimiter);
			return result[1];
		}else{
			return "0";
			}
		}
	
	
	private void displayError(String errorNum){
		System.out.println(errorDisplay.getErrorMessage(errorNum));
	}


}
