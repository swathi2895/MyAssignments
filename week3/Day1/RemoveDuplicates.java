package week3.Day1;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		int count=0;
		String str[] = text.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			for (int j = 1; j < str.length; j++) {
				if (str[i] == str[j]) {
					count++;
		}
				if (count > 1) {
					
					String replaced = text.replace(str[i], "");
					System.out.print(replaced);
					break;
	}
		}
	}
}
}