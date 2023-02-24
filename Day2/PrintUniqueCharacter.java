package week3.Day2;

import java.util.HashSet;
import java.util.Set;

public class PrintUniqueCharacter {
public static void main(String[] args) {
	String name="SwathiRahul";
	char[] nameArray = name.toCharArray();
	Set<Character> set =new HashSet<Character>();
	for (int i = 0; i < nameArray.length; i++) {
		
		boolean setAdd = set.add(nameArray[i]);
		
		if(!setAdd)
		{
			set.remove(nameArray[i]);
		}
		
	}

		System.out.println("Unique Character is: "+set);	

		
	}
	
}

