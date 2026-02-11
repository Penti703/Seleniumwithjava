package javaClassqa;

public class Reversnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12345;
		int rev=0;
		for(;num>0;num/=10) {
			int didgit=num%10;
			rev=rev*10+didgit;
			
		}System.out.println(rev);

	}

}
