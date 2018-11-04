package org.thomas.funGame;

import java.util.ArrayList;
import java.util.List;

/**
 * This project is made by Thomas
 *
 */
public class App 
{
	private static List<Integer> numberList = null;
	//to initialize List when the class is loaded
	static{
		numberList = new ArrayList<Integer>();
		for(int i = 1 ; i < 101 ; i++){
			numberList.add(i);
		}
	}
    public static void main( String[] args )
    {
        BaseRequirement.sayFizzAndBuzz(numberList);
        NewRequirement.sayNewFizzAndBuzz(numberList);
    }
}
