package school.management.system;

import java.util.List;

public class School {

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	public School(List<Teacher> teachers, List<Student> students) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	public static void updateTotalMoneyEarned(int moneyEarned) {
		School.totalMoneyEarned += moneyEarned;
	}

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	public static void updateTotalMoneySpent(int moneySpent) {
		School.totalMoneySpent += moneySpent;
	}
	
	public int getTotalMoneyLeft() {
		return totalMoneyEarned - totalMoneySpent;
	}
}
