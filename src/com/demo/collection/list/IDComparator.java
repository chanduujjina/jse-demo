package com.demo.collection.list;

import java.util.Comparator;

import com.demo.collection.list.pojo.Student;

public class IDComparator implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		// TODO Auto-generated method stub
		return student1.getId()-student2.getId();
	}

}
