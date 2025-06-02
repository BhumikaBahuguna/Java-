import java.util.*;
public class BankClass{
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter choice :");
		System.out.println("1: Term Deposit");
		System.out.println("2: Recurring Deposit");
		System.out.println("Enter Choice :");
		int ch=sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("enter principal:");
			int p=sc.nextInt();
			System.out.println("enter rate of interest:");
			int r=sc.nextInt();
			System.out.println("enter time period:");
			int t=sc.nextInt();
			double a=p*(1+r/100.0)*t;
			System.out.println("Maturity amout :"+a);
			break;
		case 2:
			System.out.println("enter monthly installment:");
			int pr=sc.nextInt();
			System.out.println("enter rate of interest:");
			int mr=sc.nextInt();
			System.out.println("enter time period:");
			int tm=sc.nextInt();
			double am= pr*tm + ((pr*tm*(tm + 1))/2.0)*(mr/100.0)*(1/12.0);
			System.out.println("Maturity amout :"+am);
			break;
			default:
				System.out.println("Invalid choice");
		}
	}
}
