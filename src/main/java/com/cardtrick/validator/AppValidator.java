package com.cardtrick.validator;

import com.cardtrick.util.UserInputUtil;

public class AppValidator {
	
	public static boolean validateResponse(String response)
	{
		while(!("y".equalsIgnoreCase(response) || "n".equalsIgnoreCase(response)))
		{
			System.out.println("Invalid Input. Type y/n: ");
			response = UserInputUtil.readUserResponse();
		}
		return true;
	}

}
