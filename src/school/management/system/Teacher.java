package school.management.system;

public class Teacher extends SchoolPerson {
	
	private int salary;
	private int salaryEarned;
	
	public Teacher(int id, String name, int salary) {
		super();
		super.setId(id);
		super.setName(name);
		this.salary = salary;
		this.salaryEarned = 0;
	}

	public void receiveSalary(int salary) {
		this.salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getSalaryEarned() {
		return salaryEarned;
	}
}
