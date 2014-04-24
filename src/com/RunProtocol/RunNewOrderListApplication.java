package com.RunProtocol;
import com.Protocol.NewOrderSingleTagValidator;
import java.util.Scanner;
public class RunNewOrderListApplication {

	public static void main(String[] args) {
		
		NewOrderSingleTagValidator validate =new NewOrderSingleTagValidator();
		String fixMessage="";
		
		Scanner userMessage = new Scanner(System.in);
		System.out.println("Enter a Fix4.4 NewOrderSingle Message: ");
		fixMessage= userMessage.nextLine();
		if(validate.ValidateMessage(fixMessage)){
			System.out.print("Message Successful");
		}
		

	}

}
