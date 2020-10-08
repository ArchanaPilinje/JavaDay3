package interfaces;
import java.util.Scanner;
public class TaxablePerson  {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int repeat=0;
		do {
		System.out.println("Please choose the options");
		System.out.println("1.Organization\n2.Employee");
		int ch=sc.nextInt();
		switch(ch) {
		case 1: Organization o= new Organization();
				System.out.println("Enter the turnover and expense of the organization");
				o.setTurnover(sc.nextDouble());
				o.setExpense(sc.nextDouble());
				o.calcTax();
				o.print();
				break;
				
		case 2: Employee e=new Employee();
				System.out.println("Enter the income and interest received by the employee");
				e.setIncome(sc.nextDouble());
				e.setInterest(sc.nextDouble());
				e.calcTax();
				e.print();
				break;
		}
		System.out.println("1.Continue 2.Exit");
		repeat=sc.nextInt();
		}while(repeat==1);

	}

}
