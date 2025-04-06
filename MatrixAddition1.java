import java.util.*;
public class MatrixAddition {
	public static void add(int[][]a,int [][] b,int [][]c,int rows,int col) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows:");
		int rows=sc.nextInt();
		System.out.println("enter columns:");
		int col=sc.nextInt();
		int [][]a= new int[rows][col];
		int [][]b= new int[rows][col];
		int [][]c=new int[rows][col];
		System.out.println("enter elements of first matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("enter elements of second matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		add(a,b,c,rows,col);
		System.out.println("result matrix is:");
		for(int [] row :c) {
			for(int val:row) {
				System.out.print(val+" ");
			}
			System.out.println();
		}
	}	
}
