package com.demo.collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.demo.collection.list.pojo.Student;

public class StudentService {
	
	public static void main(String[] args) {
		List<Student> studentList = getStudentList();
		System.out.println(studentList);
		
		// get the student list whose name name starts with v
		List<Student> filteredList = getFilteredList_prefix("v",studentList);
		System.out.println(filteredList);
		
		// get the student list by gender
		
		List<Student> filteredListByGender = getFilteredListByGender("female",studentList);
		System.out.println(filteredListByGender);
		
		//Collections.addAll(studentList);
		Collections.sort(studentList,new IDComparator());
		System.out.println(studentList);
		
		//sort the student list by student name
		
		Collections.sort(studentList, new NameComparator());
		System.out.println("sort by name" +studentList);
		
		//sort the student list by student scholorship
		
		Collections.sort(studentList, new ScholoshipComparator());
		
		System.out.println("sort by scholorship" +studentList);
	}
	
	public static List<Student> getFilteredListByGender(String gender,List<Student> studentList){
		List<Student> filteredListByGender= new ArrayList();
		for(Student student : studentList) {
			if(student.getGender().equalsIgnoreCase(gender)) {
				filteredListByGender.add(student);
			}
		}
		return filteredListByGender;
	}
	
	
	public static List<Student> getFilteredList_prefix(String prefix,List<Student> studentList){
		List<Student> filteredList= new ArrayList();
		for(Student student : studentList) {
			if(student.getName().startsWith(prefix)) {
				filteredList.add(student);
			}
		}
		return filteredList;
	}
	
	
	
	//sort the student list by student id
	
	
	
	//sort the student list based on scholorship
	
	
	
	public static List<Student> getStudentList(){
		
		Student student1 = new Student(1, "vasu", "male", 50000);
		Student student3 = new Student(3, "vani", "female", 60000);
		Student student2 = new Student(2, "raju", "male", 30000);
		Student student4 = new Student(5, "rahul", "male", 70000);
		Student student5 = new Student(6, "anand", "male", 30000);
		
		List<Student> studentList = new ArrayList();
		
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		return studentList;
	}

}
