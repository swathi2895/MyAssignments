package week3.Day2;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicatesWords {
public static void main(String[] args) {
	String text = "We learn java basics as part of java sessions in java week1";
	String[] splitText = text.split(" ");
	Set<String> emptyString=new TreeSet<String>();
	for (int i = 0; i < splitText.length; i++) {
		
		
		boolean Set = emptyString.add(splitText[i]);
		
		if(Set)
		{
			System.out.print(splitText[i]+" ");
		}
	
}}
}
