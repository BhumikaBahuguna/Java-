import java.util.*;
public class DiagonalSum {
	public static void print_sum(int[][]a,int n) {
		int principalsum=0,secondarysum=0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++) {
				if(i==j) {
					principalsum+=a[i][j];
				}
				if((i+j)==n-1) {
					secondarysum+=a[i][j];
				}
			}
		}
		System.out.println("sum of principal diagonal is :"+principalsum);
		System.out.println("sum of secondary diagonal is :"+secondarysum);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number of rows and columns:");
		int n=sc.nextInt();
		int [][]a= new int[n][n];
		System.out.println("enter elements of matrix :");
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		print_sum(a,n);
	}

}
