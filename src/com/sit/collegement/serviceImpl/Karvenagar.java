package com.sit.collegement.serviceImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.sit.collegemanagement.model.*;
import com.sit.collegemanagement.service.Sit;

public class Karvenagar implements Sit{
	
	List<Course> clist = new ArrayList<>();
	List<Faculty> flist = new ArrayList<>();
	List<Batch> blist = new ArrayList<>();
	List<Student> slist = new ArrayList<>();
	
	
	@Override
	public void addCourse() {
		Scanner addcourse = new Scanner(System.in);
		System.out.println("Please Add your CourseID:: ");
		Integer cid = addcourse.nextInt();
		System.out.println("Please Add your CourseName:: ");
		String cname = addcourse.next();
		clist.add(new Course(cid,cname));
		System.out.println("Course Added Successfully!");
	}
	@Override
	public void viewCourse() {
		Iterator itr = clist.iterator();
		while(itr.hasNext()) {
			Object i = itr.next();
			System.out.println(i);
		}
	}
	@Override
	public void addFaculty() {
		Scanner addfaculty = new Scanner(System.in);
		System.out.println("Please Add FacultyID:: ");
		Integer fid = addfaculty.nextInt();
		System.out.println("Please Add FacultyName:: ");
		String fname = addfaculty.next();
		System.out.println("Please Add Course:: ");
		String course = addfaculty.next();
		flist.add(new Faculty(fid,fname,course));
		System.out.println("Faculty Added Successfully!");
	}
	@Override
	public void viewFaculty() {
		Iterator itr = flist.iterator();
		while(itr.hasNext()) {
			Object ii =itr.next();
			System.out.println(ii);
		}
	}
	@Override
	public void addBatch() {
		Scanner addbatch = new Scanner(System.in);
		System.out.println("Please Add BatchID:: ");
		Integer bid = addbatch.nextInt();
		System.out.println("Please Add BatchName:: ");
		String bname = addbatch.next();
		System.out.println("Please Add Course:: ");
		String faculty = addbatch.next();
		blist.add(new Batch(bid,bname,faculty));
		System.out.println("Batch Added Successfully!");
	}
	@Override
	public void viewBatch() {
		Iterator itr = blist.iterator();
		while(itr.hasNext()) {
			Object iii =itr.next();
			System.out.println(iii);
		}
	}
	@Override
	public void addStudent() {
		Scanner addstudent = new Scanner(System.in);
		System.out.println("Please Add StudentID:: ");
		Integer sid = addstudent.nextInt();
		System.out.println("Please Add StudentName:: ");
		String sname = addstudent.next();
		System.out.println("Please Add Course:: ");
		String batch = addstudent.next();
		slist.add(new Student(sid,sname,batch));
		System.out.println("Student Added Successfully!");
		
	}
	@Override
	public void viewStudent() {
		Iterator itr = slist.iterator();
		while(itr.hasNext()) {
			Object ii =itr.next();
			System.out.println(ii);
		}
	}

}
