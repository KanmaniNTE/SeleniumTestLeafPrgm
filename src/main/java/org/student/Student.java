package org.student;

import org.department.Department;

public class Student extends Department {
	public void studentName() {
		System.out.println("Student Name: Kanmani NTE");
	}
    public void studentDept() {
    	System.out.println("Student Dept: ECE");
    }
    public void studentId() {
    	System.out.println("Student ID : 30708106038");
    }
    public static void main(String[] args) {
    	Student stu=new Student();
    	stu.collegeName();
    	stu.collegeCode();
    	stu.collegeRank();
    	stu.deptName();
    	stu.studentName();
    	stu.studentDept();
    	stu.studentId();
    }
}
