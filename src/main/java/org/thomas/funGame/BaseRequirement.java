package org.thomas.funGame;

import java.util.List;
/**
 * This is the first requirement
 * @author Thomas 
 *
 */
public class BaseRequirement {
	public static void sayFizzAndBuzz(List<Integer> numberList){
		for(int i = 0 ; i < numberList.size();i++){
		    int number = numberList.get(i);
			if(number%3 == 0 && number%5 != 0){
				System.out.println("Fizz");
			}else if(number%5 == 0 && number%3 !=0){
				System.out.println("Buzz");
			}else if(number%5 == 0 && number%3 ==0){
				System.out.println("FizzBuzz");
			}else{
				System.out.println(number);
			}
		}
	}
}
