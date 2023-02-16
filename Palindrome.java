package Assginment;

public class Palindrome {
	public static void main(String[] args) {
		String tex01="malayalam";
		int len=tex01.length();
		char[] ch=tex01.toCharArray();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+ch[i];
		}
		if(tex01.equals(rev)) 
		{
			System.out.println("Palindrome");
		}else {
			System.out.println("not a palindrome");
		}
		
	}
}
