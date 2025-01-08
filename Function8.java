import java.util.*;
public class Function8 {
    public static double calculateCircumfernce(int r){
        double circum=2*3.14*r;
        return circum;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double circum=calculateCircumfernce(r);
        System.out.println(circum);
    }
}
