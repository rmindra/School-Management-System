package school.management.system;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		Teacher lizzy = new Teacher(1, "Lizzy", 5000);
		Teacher mellisa = new Teacher(2, "Mellisa", 7000);
		Teacher vanderhorn = new Teacher(3, "Vanderhorn", 6000);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(lizzy);
		teacherList.add(mellisa);
		teacherList.add(vanderhorn);
		
		Student tamasha = new Student(1, "Tamasha", 4);
		Student rakshith = new Student(2, "Rakshith", 12);
		Student rabbi = new Student(3, "Rabbi", 5);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(tamasha);
		studentList.add(rakshith);
		studentList.add(rabbi);
		
		School ghs = new School(teacherList, studentList);

		System.out.println("+++++ GHS Recap Fees +++++");
		System.out.println("Students :");
		tamasha.payFees(10000);
		System.out.println(tamasha.getName() + " Remaining fees : $" + tamasha.getRemainingFees());
		rakshith.payFees(6000);
		System.out.println(rakshith.getName() + " Remaining fees : $" + rakshith.getRemainingFees());
		rabbi.payFees(7000);
		System.out.println(rabbi.getName() + " Remaining fees : $" + rabbi.getRemainingFees());
		

		System.out.println();
		System.out.println("Teachers :");
		lizzy.receiveSalary(lizzy.getSalary());
		System.out.println(lizzy.getName() + " Earned Salary : " + lizzy.getSalaryEarned());		
		mellisa.receiveSalary(mellisa.getSalary());
		System.out.println(mellisa.getName() + " Earned Salary : " + mellisa.getSalaryEarned());		
		vanderhorn.receiveSalary(vanderhorn.getSalary());
		System.out.println(vanderhorn.getName() + " Earned Salary : " + vanderhorn.getSalaryEarned());		
	
		System.out.println();
		System.out.println("School : ");
		System.out.println("GHS Earned Money : $" + ghs.getTotalMoneyEarned());
		System.out.println("GHS Spent Money : $" + ghs.getTotalMoneySpent());
		System.out.println("GHS Money Left : $" + ghs.getTotalMoneyLeft());
		System.out.println("++++++++++++++++++++++++++");
		}

}
