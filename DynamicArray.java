import java.util.Scanner;
public class DynamicArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size :");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("enter elements :");
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
            System.out.println("you have entered");
            for(int i=0;i<a.length;i++){
                System.out.println(a[i]);
            }
    }
}
