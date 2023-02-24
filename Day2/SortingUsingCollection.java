package week3.Day2;

import java.util.Arrays;

public class SortingUsingCollection {
public static void main(String[] args) {
	String[] name= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
	int Length = name.length;
	System.out.println("Length of the array is: "+Length);
	Arrays.sort(name);
	for(int i=Length-1;i>=0;i--)
{
	System.out.print(name[i]+",");
}
}
}