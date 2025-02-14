import java.util.Scanner;
class Bank{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("select deposit type:");
System.out.println("1- term deposit");
System.out.println("2-recurring deposit");
System.out.println("enter your choice(1 or 2):");
int choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("enter princial amount P :");
double p=sc.nextDouble();
System.out.println("enter rate of interest r :");
double r=sc.nextDouble();
System.out.println("enter time period in years N :");
int n=sc.nextInt();
double maturity_amt_term=p*Math.pow((1+r/100),n);
System.out.println("maturity amount for term deposit:" +maturity_amt_term);
break;
case 2:
System.out.println("enter monthly installment p:");
double prec=sc.nextDouble();
System.out.println("enter ate of interest r (in %) :");
double rrec=sc.nextDouble();
System.out.println("enter time period n (in months):"); 
int nrec=sc.nextInt();
double maturity_amt_rec=(prec*nrec)+(prec*nrec*(nrec+1)/2*rrec/100*1/12);
System.out.println("maturity amount for recurring deposit:"+maturity_amt_rec);
break;
default:
System.out.println("invalid choice");
}
sc.close();
}
}
