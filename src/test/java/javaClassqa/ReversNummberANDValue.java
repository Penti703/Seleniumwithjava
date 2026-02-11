package javaClassqa;

public class ReversNummberANDValue {

	public static void main(String[] args) {
		// TODO Increament 1 to 10 
		
		  //for (int i=1 ; i<=10 ;i++) { System.out.println(i); }
		  
		  // decrement orde 20 to 1
		   
		  //for (int i=20 ; i>=1 ;i--) { System.out.println(i); }
		 //Print odd numebrs 
//		for(int i=1 ; i<=10 ;i=i+2) {
//			System.out.println(i);
//		}
		
		//Print Even numbers 
		
		/*
		 * for(int i=0 ; i<=10 ;i=i+2) { System.out.println(i); }
		 */
		
		//Print odd even numbers 
		/*for (int i=1 ; i<10 ; i++) {
			if (i%2==0) {
				System.out.println(i+"Even number");
			}else {
				System.out.println(i+"Odd number");
			}*/
			int num=123456,rev=0;
			
		  for(;  num>0; num/=10) {
			  int digit=num%10;
			  rev=rev*10+digit;
			  
		}System.out.println(rev);
	}

}
