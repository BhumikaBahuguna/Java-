import java.util.Scanner;
public class FriendlyPair{
	public static int sumofdivisors(int n) {
		int s=0;
		for(int i=1;i<n/2;i++) {
			if(n/i==0) {
				s+=i;
			}
		}
		return s+n;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number: ");
		int n1=sc.nextInt();
		System.out.println("enter second number: ");
		int n2=sc.nextInt();
		int s1=sumofdivisors(n1);
		int s2=sumofdivisors(n2);
		double r1=s1/n1;
		double r2=s2/n2;
		if(r1==r2) {
			System.out.println("Friendly pairs");
		}else {
			System.out.println("Not a friendly pair");
		}
	}
}
