package week3.day1;

public class Students {
	public void getStudentInfo() {
		System.out.println("Students Information");
	}
	public void getStudentInfo(String StudentId) {
		System.out.println("StudentID: "+ StudentId);
	}
	public void getStudentInfo(String StudentId,String Name) {
		System.out.println("Student ID and Name: "+StudentId +Name);
	}
	public void getStudentInfo(String email, long phoneNumber ) {
		System.out.println("Student E-mail & Phone Number: " +email +phoneNumber);
	}
	public static void main(String[] args) {
		Students info =new Students();
		info.getStudentInfo();
		info.getStudentInfo("30708106038");
		info.getStudentInfo("30708106038", "  Kanmani");
		info.getStudentInfo("nte.kanmani31@gmail.com", "  8870930999");
	}
}
