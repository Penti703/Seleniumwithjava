package array.com;

import java.util.Arrays;

class calculator{
	
	int a[]=new int[5];
	
	void m1() {
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		System.out.println(Arrays.toString(a));
	}
	void m2() {
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		System.out.println(Arrays.toString(a));
		
	}
	
	void m3() {
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println(Arrays.toString(a));
		
	}
}
public class ArrayTest_001 {
	
	public static void main(String[] args) {

		calculator ch= new calculator();
		ch.m1();
		ch.m2();
		ch.m3();
		

	}

}

