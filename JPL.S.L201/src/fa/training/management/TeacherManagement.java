package fa.training.management;

import fa.training.entities.EnglishTeacher;
import fa.training.entities.MathTeacher;
import fa.training.entities.Teacher;

public class TeacherManagement {

	public static void main(String[] args) {
		
		MathTeacher mathTeacher = new MathTeacher("Teacher", "FU", "Math");
		MathTeacher mathTeacher2 = new MathTeacher("Teacher", "PTIT", "Math");
		EnglishTeacher englishTeacher = new EnglishTeacher("Teacher", "PTIT", "English");
		
		Teacher[] teacher = new Teacher[3];
		teacher[0] = mathTeacher;
		teacher[1] = mathTeacher2;
		teacher[2] = englishTeacher;
		
		int number1 = 100, number2 = 20;
		
		for (int i = 0; i < teacher.length; i++) {
			System.out.println("------TEACHER " + (i + 1) + "----------");
			System.out.println("College name: " + teacher[i].getCollegename());
			System.out.println("Disgnation: " + teacher[i].getDesignation());
			if (teacher[i] instanceof MathTeacher) {
				System.out.println("Main subject: " + ((MathTeacher) teacher[i]).getMainSubject()); // in ra main subject của MathTeacher thứ i
				
				((MathTeacher) teacher[i]).toSchool();// in ra dòng "Math teacher go to school by car!
				
				teacher[i].teach();
				System.out.println("SUM(" + number1 + ", " + number2 + ") = " + 
				mathTeacher.sum(number1, number2));
				
			} else {
				System.out.println("Main subject: " + ((EnglishTeacher) teacher[i]).getMainSubject());// in ra main subject của EnglishTeacher thứ i
				
				((EnglishTeacher) teacher[i]).toSchool();// in ra dòng "English Teacher go to school by motorbike
				
				teacher[i].teach();
				
				((EnglishTeacher) teacher[i]).translate("Hello", "Xin chao!");// in ra dòng "Hello in Vietnamese Xin chao!"
			}
			
		}
		
	}
	
}
//Explain about snippet code: (MathTeacher) teachers[i], (EnglishTeacher) teachers[i] 
//at lines of code 27, 29, 36, 38 and 42.

