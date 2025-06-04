import java.util.Scanner;
public class DeleteVowels{
	public static String removeVowel(String str) {
		String res="";
		
		for(char ch :str.toCharArray()) {
			if(!isVowel(ch)){
				res+=ch;
			}
		}
		return res;
	}
	public static String remove(String str) {
		StringBuffer sb =new StringBuffer(str);
		for(int i=0;i<sb.length();i++) {
			if(isVowel(sb.charAt(i))) {
				sb.deleteCharAt(i);
				i--;
			}
		}
		return sb.toString();
	}
	private static boolean isVowel(char ch) {
		ch=Character.toLowerCase(ch);
		return "aeiou".indexOf(ch)!=-1;
	}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=sc.nextLine();
		String res1=removeVowel(str);
		System.out.println("using string class :"+ res1);
		String res2=remove(str);
		System.out.println("using stringbuffer class :"+ res2);
}
	}
