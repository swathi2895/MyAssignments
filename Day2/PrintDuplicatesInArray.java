package week2.Day2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arrLength= arr.length;
		
		for(int i=0;i<arrLength;i++)
		{
			
			for(int j=i+1;j<arrLength;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
			}
			
		}
		}
		

	}

}
