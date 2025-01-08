import java.util.*;
public class Function10 {
    public static int calculatePower(int n ,int x){
        int power=1;
        for(int i=1;i<=n;i++){
            power=x*power;
        }
        return power;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int power=calculatePower(n,x);
        System.out.println(power);
    }
}
