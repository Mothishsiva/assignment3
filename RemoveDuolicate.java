package Assginment;

public class RemoveDuolicate {
	public static void main(String[] args) {
				
		String tex01="We learn java basics as part of java sessions in java";
		char[] ch=tex01.toCharArray();
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]==ch[j]) {
				System.out.println(ch[j]);
				}
			
				}
			}
}
}