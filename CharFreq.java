import java.util.Scanner;
public class CharFreq{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string :");
		String s=sc.nextLine();
		int freq[]=new int[256];
		for(int i=0;i<s.length();i++) {
			freq[s.charAt(i)]++;
		}
		for(int i=0;i<s.length();i++) {
			if(freq[s.charAt(i)]!=0) {
				System.out.println(s.charAt(i)+" -"+freq[s.charAt(i)]);
				freq[s.charAt(i)]=0;
			}
		}
			
		
	}
}
