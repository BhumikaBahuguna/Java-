import java.util.*;
public class Count {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            int number;
            int pos=0,neg=0,z=0;
        for(int i=0;i<n;i++){
            number=sc.nextInt();
            if(number>0)
                pos++;
            else if(number<0)
                neg++;
            else
                z++;
        }
        System.out.println("no of positive numbers are : " + pos);
        System.out.println("no of negative numbers are : " + neg);
        System.out.println("no of zeroes are : " + z);

        }
    }

