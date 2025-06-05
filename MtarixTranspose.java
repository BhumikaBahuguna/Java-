import java.util.*;
public class MatrixTranspose {
	public static void transpose(int a[][],int res[][],int rows,int col) {
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				res[i][j]=a[j][i];			
				}
		}	
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter rows:");
		int rows=sc.nextInt();
		System.out.println("enter columns:");
		int col=sc.nextInt();
		int [][]a= new int[rows][col];
		int [][]res=new int[rows][col];
		System.out.println("enter elements of matrix :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		transpose(a,res,rows,col);
		System.out.println("result matrix is : ");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}
}
