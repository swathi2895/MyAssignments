package week3.Day1;

public class ReverseEvenWords {

	public static void main(String[] args) {
		String test = "I am a software tester";
		String str[] = test.split(" ");
		String reverse="";
		for (int i=0;i<str.length;i++)
		{
			if(i%2==0)
			{
				char splitedArray[]= str[i].toCharArray();
				 for(int j=splitedArray.length-1;j>=0;j--) 
				 {
					 reverse=reverse+splitedArray[j];
					 
				 }
				 reverse=reverse+" ";
			  }
			
			 else
			 {
				 reverse=reverse+str[i]+" ";
			 }
	  }
		System.out.println(reverse);

	
	}	
			
		}
	

