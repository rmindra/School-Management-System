package school.management.system;

/*
 * Keep track of students
 * id, 
 * name, 
 * grade, 
 * fees paid, 
 * fees total.
 * 
 */

public class Student extends SchoolPerson {

	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	public Student(int id, String name, int grade) {
		super();
		super.setId(id);
		super.setName(name);
		this.grade = grade;
		this.feesPaid = 0;
		this.feesTotal = 30_000;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal - feesPaid;
	}
}
