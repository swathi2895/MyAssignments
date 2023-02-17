package week2.Day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		 
	    for(int i=0;i<=arr.length;i++)
		{   int missed=0;
	    	int index = i + 1;
            if (arr[i] != index) {
                missed = index;
                System.out.println("Missed number is "+missed);
                break;
		}
		  
	}
	}}
