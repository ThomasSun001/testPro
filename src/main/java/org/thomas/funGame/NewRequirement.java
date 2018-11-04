package org.thomas.funGame;

import java.util.List;
/**
 * This one is for the new requirement
 * @author Thomas
 *
 */
public class NewRequirement {
	public static void sayNewFizzAndBuzz(List<Integer> numberList){
		for(int i = 0 ; i < numberList.size();i++){
		    int number = numberList.get(i);
			if(number%3 == 0 && number%5 != 0 ||
					String.valueOf(number).contains("3")){
				System.out.println("Fizz");
			}else if(number%5 == 0 && number%3 !=0 || 
					String.valueOf(number).contains("5")){
				System.out.println("Buzz");
			}else if(number%5 == 0 && number%3 == 0 ||
					(String.valueOf(number).contains("5") ||
							String.valueOf(number).contains("3"))){
				System.out.println("FizzBuzz");
			}else{
				System.out.println(number);
			}
		}
	}
}
