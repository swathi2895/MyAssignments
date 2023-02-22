package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("Swathi");

	}
	public void studentDept() {
		System.out.println("Information Technology");

	}
	public void studentId() {
		System.out.println("2810");

	}
	public static void main(String[] args) {
		Student st=new Student();
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.deptName();
		st.studentDept();
		st.studentId();
		st.studentName();
	}
}
