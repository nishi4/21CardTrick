package com.cardtrick;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.cardtrick.util.UserInputUtil;
import com.cardtrick.validator.AppValidator;

/**
 * Implements card trick with 21 cards.
 * <br> 
 * The trick goes:
 * <br>
 * 1. Display 21 distinct numbers for the user
 * 2. Get user to pick a number (You don't need to know which number).
 * 3. Display cards into 3 sets of 7 and have user select the set the number is that he/she has picked.
 * 4. Repeat 3 times.
 * 5. The number picked, will always be the 11th card.
 * <br>
 * <br>
 * The Algorithm goes:
 * <br>
 * 1) Do you want to play a card trick (y/n)?
        2) Please pick a number from this set 
               [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13,14,15,16,17,18,19,20,21]
           Have you picked a number of your choice (y/n)?
        
        Repeat this following step three times
        	3) Watch carefully to which set your chosen number belongs to
        		a) [1, 3, 7, 9, 10, 13, 15] 
        		b) [2, 4, 5, 8, 11, 12, 14] 
        		c) [16, 17, 18, 6, 19, 20, 21]
        	Is it in set a) (y/n)? 
        			If n
        	Is it in set b) (y/n)?
        			If n
        	Is it in set c) (y/n)?
        			If y 
        	Stack the sets so that the set the chosen number belongs to goes in the middle.
 		4) The 11th item in the stack after 3 times is the chosen card. 
 		   The number you have chosen is : ( Display 11th item in the set after the third repetition of above step)
 * <br>
 * (c) Copyright Nish Voduru 2014.
 * 
 * Creation date: (12/15/2014 1:48:36 PM)
 * @author: Nish Voduru - nishi4@hotmail.com
 */
public class App 
{
    public static void main( String[] args )
    {
    	//  create an array of 21 numbers
    	String[] numbers = getNumbers();
    	
    	//  prompt the user to play a card trick
    	System.out.print("Do you want to play a card trick (y/n): ");
    	//  open up standard input
    	String userResponse = UserInputUtil.readUserResponse();
    	AppValidator.validateResponse(userResponse);
    	if("n".equalsIgnoreCase(userResponse)){
    		System.out.println("Good Bye!!!");
    		System.exit(1);
    	}else{
	    	
	    	// 2) Please pick a number from this set 
	        //  [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,13,14,15,16,17,18,19,20,21]
	        // Have you picked a number of your choice (y/n)?
	    	System.out.println("Please pick a number from this set: ");
	    	System.out.print("[ ");
	    	for(String num : numbers)
	    	{
	    		System.out.print(num + " ");
	    	}
	    	System.out.println("]");
	    	System.out.print("Have you picked a number of your choice (y/n)? : ");
	    	//  open up standard input
	    	userResponse = UserInputUtil.readUserResponse();
	    	AppValidator.validateResponse(userResponse);
	    	if("n".equalsIgnoreCase(userResponse))
	    	{
	    		System.out.println("Good Bye!!!");
	    		System.exit(1);
	    	} else {
	    		//Repeat this following step three times
	        	//3) Watch carefully to which set your chosen number belongs to
	        	//	a) [1, 3, 7, 9, 10, 13, 15] 
	        	//	b) [2, 4, 5, 8, 11, 12, 14] 
	        	//	c) [16, 17, 18, 6, 19, 20, 21]
	    		
	    		numbers = makeSets(numbers);
	    		numbers = makeSets(numbers);
	    		numbers = makeSets(numbers);
	    		
	    		System.out.println("The number you have chosen is : " + numbers[10]);
	    		System.out.println("Good Bye !!!");
	    	}
		    	
    	}
	    	
/*      
        Repeat this following step three times
        	3) Watch carefully to which set your chosen number belongs to
        		a) [1, 3, 7, 9, 10, 13, 15] 
        		b) [2, 4, 5, 8, 11, 12, 14] 
        		c) [16, 17, 18, 6, 19, 20, 21]
        	Is it in set a) (y/n)? 
        			If n
        	Is it in set b) (y/n)?
        			If n
        	Is it in set c) (y/n)?
        			If y 
        	Stack the sets so that the set the chosen number belongs to goes in the middle.
 		4) The 11th item in the stack after 3 times is the chosen card. 
 		   The number you have chosen is : ( Display 11th item in the set after the third repetition of above step)
 */
        
    }

	private static String[] makeSets(String[] numbers) {
		String userResponse;
		String[] aSet = new String[7];
		String[] bSet = new String[7];
		String[] cSet = new String[7];
		int j = 0;
		int i = 0;
		while(i<numbers.length)
		{
			aSet[j] = numbers[i];
			bSet[j] = numbers[i+1];
			cSet[j] = numbers[i+2];
			i+=3;
			j++;
		}
		
		System.out.println("Please look for the chosen number in this set: ");
		System.out.print("[ ");
		for(String aSetItem : aSet)
		{
			System.out.print(aSetItem + " ");
		}
		System.out.println("]");
		System.out.print("Is the picked number of your choice in this set (y/n)? : ");
		
		userResponse = UserInputUtil.readUserResponse();
		AppValidator.validateResponse(userResponse);
		
		if("n".equalsIgnoreCase(userResponse))
		{
			System.out.println("Please look for the chosen number in this set: ");
			System.out.print("[ ");
			for(String bSetItem : bSet)
			{
				System.out.print(bSetItem + " ");
			}
			System.out.println("]");
			System.out.print("Is the picked number of your choice in this set (y/n)? : ");
			
			userResponse = UserInputUtil.readUserResponse();
			AppValidator.validateResponse(userResponse);
			
			if("n".equalsIgnoreCase(userResponse))
			{
				System.out.println("Please look for the chosen number in this set: ");
		    	System.out.print("[ ");
		    	for(String cSetItem : cSet)
		    	{
		    		System.out.print(cSetItem + " ");
		    	}
		    	System.out.println("]");
		    	System.out.print("Is the picked number of your choice in this set (y/n)? : ");
		    	
		    	userResponse = UserInputUtil.readUserResponse();
		    	AppValidator.validateResponse(userResponse);
		    	
		    	if("n".equalsIgnoreCase(userResponse))
		    	{
		    		System.out.println("User Error -- Good Bye!!!");
		    		System.exit(1);
		    	}
		    	numbers = stackSets(aSet, cSet, bSet);
			}else
			{
				numbers = stackSets(aSet, bSet, cSet);
			}
			
		}else{
			numbers = stackSets(bSet, aSet, cSet);
		}
		return numbers;
	}

	private static String[] stackSets(String[] set1, String[] set2,
			String[] set3) {
		return combine(combine(set1, set2), set3);
	}

	public static String[] combine(String[] a, String[] b){
        int length = a.length + b.length;
        String[] result = new String[length];
        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);
        return result;
    }

	/**
	 * This method creates the numbers from which user chooses and returns the array
	 * @return String[] a string array with numbers
	 */
	private static String[] getNumbers() {
		String[] numbers = new String[21];
    	for(int i=0; i<numbers.length; i++)
    	{
    		numbers[i] = new Integer(i).toString();
    	}
    	return numbers;
	}

	}
