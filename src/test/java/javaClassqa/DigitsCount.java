package javaClassqa;

public class DigitsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34567890,digitcount=0;
		
		for(; num>10 ; num/=10) {
			digitcount++;
			//System.out.println(digitcount);
		}
		System.out.println(digitcount);
	}

}
