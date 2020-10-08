package interfaces;

public class Employee implements IncomeTax {
	
	double income;
	double interest;
	
	public Employee(double income, double interest) {
		
		this.income = income;
		this.interest = interest;
	}

	public Employee() {
		
	}
	
	

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}

	public void calcTax() {
		calcIncome();
		calcOtherSources();
	}
	
	public void calcIncome() {
		double taxI=0.1*income;
		System.out.println("The Tax for Employee on Income:"+taxI);
	}
	
	public void calcOtherSources() {
		double taxO=0.05*interest;
		System.out.println("The Tax for Employee on Other Sources is:"+taxO);
	}
	
	public void print() {
		System.out.println("The Total Income declared by Employee is:"+income);
		System.out.println("The Total Interest declared by Employee is:"+interest);
		
	}
}
