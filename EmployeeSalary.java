import java.util.Scanner;
public class EmployeeSalary {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		PermanentEmployee p=new PermanentEmployee();
//		System.out.println("Enter the ID,Name,Base Sal,Bonus of the Permanent Employee");
//		p.setEmpId(sc.nextInt());
//		sc.nextLine();
//		p.setEmpName(sc.nextLine());
//		p.setBaseSal(sc.nextDouble());
//		p.setBonus(sc.nextDouble());
//		p.calculateSalary();
//		p.print();
		int flag=0;
		do {
		System.out.println("Please select from the following options");
		System.out.println("1.Permanent Employee\n2.Consultant Employee");
		int ch=sc.nextInt();
		
		
		switch(ch) {
		case 1: PermanentEmployee p=new PermanentEmployee();
				System.out.println("Enter the ID,Name,Base Sal,Bonus of the Permanent Employee");
				p.setEmpId(sc.nextInt());
				sc.nextLine();
				p.setEmpName(sc.nextLine());
				p.setBaseSal(sc.nextDouble());
				p.setBonus(sc.nextDouble());
				p.calculateSalary();
				p.print();
				break;
		
		case 2: ConsultantEmployee c=new ConsultantEmployee();
				System.out.println("Enter the ID,Name,Number of days,Charge Per Day and Incentive of the Permanent EMployee");
				c.setEmpId(sc.nextInt());
				sc.nextLine();
				c.setEmpName(sc.nextLine());
				c.setNumDays(sc.nextInt());
				c.setChargePerDay(sc.nextDouble());
				c.setIncentives(sc.nextDouble());
				c.calculateSalary();
				c.print();
				break;
				
		}
		System.out.println("Press the Corresponding option:\n1.Continue 0. Exit");
		flag = sc.nextInt();
		}while(flag==1);
	}

}
