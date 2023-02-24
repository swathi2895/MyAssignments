package week3.Day2Abstration;

public class Automation extends MultipleLanguage{
	

	@Override
	public void ruby() {
		System.out.println("Ruby");
		
	}

	public void selenium() {
		System.out.println("Selenium");
		
	}

	public void Java() {
		System.out.println("Java");
	}
	public static void main(String[] args) {
		Automation a =new Automation();
		a.Java();
		a.python();
		a.ruby();
		a.selenium();
	}

}
