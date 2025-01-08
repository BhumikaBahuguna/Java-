import java.util.*;
public class Function7 {
    public static int printGreater(int a,int b){
        return(a>b? a: b);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a =sc.nextInt();
        int b=sc.nextInt();
        int greater=printGreater(a, b);
        System.out.println(greater);
    }
}
