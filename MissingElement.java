package Assginment;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		int[] a= {1,2,4,5,7,6,8};
		Arrays.sort(a);
		int j=0;
		for(int i=0;i<a.length;i++) {
			j=i+1;
			
		if(a[i]!=j) {
			System.out.println(j);
			break;
			
}
}
	}
}