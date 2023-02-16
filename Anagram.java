package Assginment;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String tex01="stops";
		String tex02="posts";
		int len1=tex01.length();
		int len2=tex02.length();
		if(len1==len2) {		
		char[] ch1=tex01.toCharArray();
		char[] ch2=tex02.toCharArray();
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    boolean res=Arrays.equals(ch1, ch2);
	    if(res=true) {
	    	System.out.println("anagram");
	    	
	    }else {
	    	System.out.println("not ");
	    }
		}   
	}

}
