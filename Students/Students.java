package Students;

public class Students {
	 public void getStudentInfo(int id) {
		System.out.println("ID"+id);

	}
	 public void getStudentInfo( int id,String name) {
			System.out.println("ID and Name are"+id+name);

		}
	 public void getStudentInfo(String email,long phoneNumber) {
			System.out.println("Email and phone are "+email+phoneNumber);

		}
	 public static void main(String[] args) {
		Students s=new Students();
		s.getStudentInfo(2810);
		s.getStudentInfo(2810,"Swathi");
		s.getStudentInfo("Swathi@gmail.com",999999999);
	}
}
