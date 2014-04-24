package com.Protocol;
import java.util.HashMap;
import java.util.Map;

public class NewOrderSingleTagValues {
	
	// tag validations
	
	public boolean isValidTag35(String value35){
		return value35.contains("35=D");
	}
	
	public boolean isValidTag11(String value11){
		return value11.contains("11=");	
		}
	
	public boolean isValidTag10(String value10){
		int endCode;
		if (value10.charAt(0)==' '|| value10.charAt(1)==' ') value10="9999";
		endCode=Integer.parseInt(value10);
		return endCode<1000 && endCode >0;
			
	}
	public boolean isValidTag40(char value40){
		//Maps containing the accepted values for tag40
		Map <String,String> tagAndValue40=new HashMap<String,String>();
		
		tagAndValue40.put("1", "40");
		tagAndValue40.put("2", "40");
		tagAndValue40.put("3", "40");
		tagAndValue40.put("4", "40");
		tagAndValue40.put("6", "40");
		tagAndValue40.put("7", "40");
		tagAndValue40.put("8", "40");
		tagAndValue40.put("9", "40");
	
		tagAndValue40.put("D", "40");
		tagAndValue40.put("E", "40");
		tagAndValue40.put("G", "40");
		tagAndValue40.put("I", "40");
		tagAndValue40.put("J", "40");
		tagAndValue40.put("K", "40");
		tagAndValue40.put("L", "40");
		tagAndValue40.put("M", "40");
		tagAndValue40.put("P", "40");
		
		
		return tagAndValue40.containsKey(Character.toString(value40));
	}
	
	public boolean isValidTag54(char value54){
		//Maps containing the accepted values for tag54
	 Map <String,String> tagAndValue54=new HashMap<String,String>();
	 
		tagAndValue54.put("1", "54");
		tagAndValue54.put("2", "54");
		tagAndValue54.put("3", "54");
		tagAndValue54.put("4", "54");
		tagAndValue54.put("5", "54");
		tagAndValue54.put("6", "54");
		tagAndValue54.put("7", "54");
		tagAndValue54.put("8", "54");
		tagAndValue54.put("9", "54");	
		tagAndValue54.put("A", "54");
		tagAndValue54.put("B", "54");
		tagAndValue54.put("C", "54");
		tagAndValue54.put("D", "54");
		tagAndValue54.put("E", "54");
		tagAndValue54.put("F", "54");
		tagAndValue54.put("G", "54");
		
		return tagAndValue54.containsKey(Character.toString(value54));
	}
	
	public boolean isValidTag60(String value60){
		return value60.contains(":");	
		
	}
	
	

}
