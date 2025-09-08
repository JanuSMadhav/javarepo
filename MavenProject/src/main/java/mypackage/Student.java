package mypackage;

public class Student extends Course{
	String studentname ="Janu S Madhav";
	public void issueId() {
		System.out.println(studentname+" "+coursename+" "+collegename);
	}
	
	public static void main (String args[]) {
		Student stu = new Student();
		stu.issueId();
	}

}
