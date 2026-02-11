package javaClassqa;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Palandrom
		int num=1331;
				int Original=num;
				int revers=0;
		for(;num>0;num/=10) {
			int digit=num%10;//last digit 
			revers=revers*10+digit;
	
		}if (Original==revers) {
			System.out.println("Palandrom Number");
		}else {
			System.out.println("not Palandrom Number");
		}

	}

}
