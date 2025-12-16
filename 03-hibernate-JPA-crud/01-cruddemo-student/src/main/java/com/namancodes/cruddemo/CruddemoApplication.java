package com.namancodes.cruddemo;

import com.namancodes.cruddemo.dao.StudentDAO;
import com.namancodes.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}

	//CommondLine will be executed after the bean will be loaded.
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner->{

			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			//readStudent(studentDAO);
			//queryForStudents(studentDAO);
			//queryForStudentsByLastName(studentDAO);
			//updateStudent(studentDAO);
			//deleteStudent(studentDAO);
			deleteAllStudents(studentDAO);
		};
	}

	private void deleteAllStudents(StudentDAO studentDAO) {
		System.out.println("Deleting all students");
		int numRowsDeleted = studentDAO.deleteAll();
		System.out.println("Deleted rows count: "+numRowsDeleted);
	}

	private void deleteStudent(StudentDAO studentDAO) {
		int studentId = 3;
		System.out.println("Deleting student id:" + studentId);
		studentDAO.delete(studentId);
	}

	private void updateStudent(StudentDAO studentDAO) {
		// retrieve student
		int studentId = 2;
		System.out.println("Getting student with id: "+studentId);
		Student myStudent = studentDAO.findById(studentId);

		//change first name to "Hitesh"
		System.out.println("updating student...");
		myStudent.setFirstName("Ajay");

		//update the student
		 studentDAO.update(myStudent);

		//display the updated student
		System.out.println("Updated student: "+myStudent);
	}

	private void queryForStudentsByLastName(StudentDAO studentDAO) {

		//get list of students
		List<Student> theStudents = studentDAO.findByLastName("Vijay");

		//display list of students
		for(Student thestudent:theStudents){
			System.out.println(thestudent);
		}
	}

	private void queryForStudents(StudentDAO studentDAO) {
		// get a list of students
		List<Student> theStudents = studentDAO.findAll();
		// display that list of students
		for(Student student:theStudents){
			System.out.println(student);
		}
	}

	private void readStudent(StudentDAO studentDAO) {

		//create student object
		System.out.println("Creating the student...");
		Student tempStudent = new Student("Akhil","Manier","akhilcodes@gmail.com");

		//save the student
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		//display id of the saved student
		int theId = tempStudent.getId();
		System.out.println("saved student. Generated id:  "+theId);

		//retrieve student based on id
		System.out.println("Retrieving student with id: "+theId);
		Student myStudent = studentDAO.findById(theId);

		//display student
		System.out.println("Found the student "+myStudent);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {
		//creating multiple student objects
		System.out.println("Creating the student...");
		Student tempStudent1 = new Student("Ajay","Aggarwal","ajaycodes@gmail.com");
		Student tempStudent2 = new Student("Raghav","Kumar","raghavcodes@gmail.com");
		Student tempStudent3 = new Student("Krish","Dixit","krishcodes@gmail.com");

		//saving objects
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}

	private void createStudent(StudentDAO studentDAO){
		// create student object
		System.out.println("Creating the student...");
		Student tempStudent = new Student("Naman","Vijay","namancodes@gmail.com");

		// save the student object
		System.out.println("Saving the student...");
		studentDAO.save(tempStudent);

		// display id of the saved student
		System.out.println("Saved student. Generated id: "+tempStudent.getId());
	}
}
