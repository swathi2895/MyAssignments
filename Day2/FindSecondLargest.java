package week3.Day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> emptySet=new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			emptySet.add(data[i]);
		}
		System.out.println(emptySet);
		List<Integer> emptyList=new ArrayList<Integer>(emptySet);
        int list = emptyList.size();
		
		for (int i = 0; i <= list; i++) {
			
			if(i==(list-2))
			{
				System.out.println("Second largest number is: "+emptyList.get(i));
			}
	}

} }
