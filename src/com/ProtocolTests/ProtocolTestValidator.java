package com.ProtocolTests;

import static org.junit.Assert.*;
import com.Protocol.NewOrderSingleTagValidator;
import org.junit.Test;

public class ProtocolTestValidator {
	
	NewOrderSingleTagValidator testValidator =new NewOrderSingleTagValidator();
	
	
//test for some invalid values
	@Test
	public void testValidIncorrect() {
		String message="jsnldiawndnaleineln";
		assertEquals(testValidator.ValidateMessage(message),false);
	}
	
	@Test
	public void testValidInCorrect2() {
		String message="sadnmsfln35=Dief11=lfnsl54=240=3810=09999";
		assertEquals(testValidator.ValidateMessage(message),false);
	}
	
	@Test
	public void testValidInCorrect3(){
		String message="35=D 11=44 54=1 60=095022 40=3 10=999";
		assertEquals(testValidator.ValidateMessage(message),false);
		
	}
	@Test
	public void testValidInCorrect4(){
		String message="35=D 11= 54=1 60=095022 0=3 10=999";
		assertEquals(testValidator.ValidateMessage(message),false);
		
	}
	@Test
	public void testValidInCorrect5(){
		String message="8=FIX.4.49=15535=D34=21549=CLIENT4452=20060425-194255.71856=TW441=juinternal11=1234621=138=140=244=554=155=EAS59=060=20060425-144255207=ZZ461=ESXXXX10=013";
		assertEquals(testValidator.ValidateMessage(message),false);
		
	}
//tests for some valid values
	@Test
	public void testValidCorrect() {
		String message="sadnmsfln35=Dief11=lfns60=8:23:66l54=240=3810=099";
		
		assertEquals(testValidator.ValidateMessage(message),true);
	}
	
	@Test
	public void testValidCorrect2(){
		String message="35=D 11=44 54=1 60=09:50:22 40=3 10=999";
		assertEquals(testValidator.ValidateMessage(message),true);
		
	}
	
	@Test
	public void testValidCorrect3(){
		String message="8=FIX.4.49=15535=D34=21549=CLIENT4452=20060425-19:42:55.71856=TW441=juinternal11=1234621=138=140=244=554=155=EAS59=060=20060425-14:42:55207=ZZ461=ESXXXX10=013";
		assertEquals(testValidator.ValidateMessage(message),true);
		
	}
}
