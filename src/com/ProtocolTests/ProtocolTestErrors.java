package com.ProtocolTests;

import static org.junit.Assert.*;
import com.Protocol.NewOrderSingleTagErrors;
import org.junit.Test;

public class ProtocolTestErrors {

	NewOrderSingleTagErrors testMapContents= new NewOrderSingleTagErrors();
	//test for proper messages
	@Test
	public void testErrorMessage35() {
		System.out.print (testMapContents.getErrorMessage("11"));
		assertEquals(testMapContents.getErrorMessage("35"),"Invalid: incorrect value- message retracted.");
	}
	@Test
	public void testErrorMessage10() {
		assertEquals(testMapContents.getErrorMessage("10"),"Invalid: expecting three digit value- message retracted");
	}
	@Test
	public void testErrorMessage11() {
		assertEquals(testMapContents.getErrorMessage("11"),"Invalid: no name or identifier detected- message retracted.");
	}
	@Test
	public void testErrorMessage60() {
		assertEquals(testMapContents.getErrorMessage("60"),"Invalid: no valid time detected - message retracted");
	}
	@Test
	public void testErrorMessage40() {
		assertEquals(testMapContents.getErrorMessage("40"),"Invalid: incorrect order value- message retracted");
	}
	
	@Test
	public void testErrorMessage54() {
		assertEquals(testMapContents.getErrorMessage("54"),"Invalid: incorrect side value- message retracted. ");
	}






}
