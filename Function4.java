import java.util.Scanner;
public class Function4 {
    public static void factorial(int a){
        int fac=1;
        for(int i=a;i>=1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a =sc.nextInt();
        factorial(a);
    }
}
