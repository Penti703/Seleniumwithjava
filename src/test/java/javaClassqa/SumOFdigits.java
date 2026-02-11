package javaClassqa;

public class SumOFdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=345679,sum=0;
		for(;num>10;num/=10) {
			sum+=num%10;
		}System.out.println(sum);

	}

}
