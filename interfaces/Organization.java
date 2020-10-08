package interfaces;

public class Organization implements GST {
	
	double turnover;
	double expense;
	double profit;
	
	
	
	public Organization(double turnover, double expense, double profit) {
		
		this.turnover = turnover;
		this.expense = expense;
		this.profit = profit;
	}
	
	

	public Organization() {
		
	}
	
	



	public double getTurnover() {
		return turnover;
	}



	public void setTurnover(double turnover) {
		this.turnover = turnover;
	}



	public double getExpense() {
		return expense;
	}



	public void setExpense(double expense) {
		this.expense = expense;
	}



	public double getProfit() {
		return profit;
	}



	public void setProfit(double profit) {
		this.profit = profit;
	}



	public void calcTax() {
		calcCGST();
		calcSGST();
	}
	
	public void calcCGST() {
		double profit=turnover-expense;
		setProfit(profit);
		double cgst=0.09*profit;
		System.out.println("The CGST is:"+cgst);
		
	}
	
	public void calcSGST() {
		double profit=turnover-expense;
		setProfit(profit);
		double cgst=0.09*profit;
		System.out.println("The CGST is:"+cgst);
	}
	
	public void print() {
		System.out.println("The Profit is:"+profit);
		System.out.println("The Expense is:"+expense);
		System.out.println("The Turnover is:"+turnover);
	}
}
