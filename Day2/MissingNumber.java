package week3.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] num = {3,2,1,4,6,7,5,3,7,9};
		Set<Integer> uniqueSet=new TreeSet<Integer>();
		for (int i = 0; i < num.length; i++) 
		{
			uniqueSet.add(num[i]);
		}
		 System.out.println("Unique numbers are: "+uniqueSet);
	        
		    //Converting to list
		     List<Integer> uniqueList=new ArrayList<Integer>(uniqueSet);
		     
		    //Iterate from the starting number and verify the next number is + 1
		     for (int i = 1; i < num.length;i++) 
		     {
		    	 if(!uniqueList.contains(i))
		    	 {
		    		 System.out.println("Missing number from the list is: "+i);
		    	 }
	}

}}
