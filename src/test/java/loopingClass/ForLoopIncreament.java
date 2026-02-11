package loopingClass;

public class ForLoopIncreament {

	public static void main(String[] args) {
		// TODO Aprint 1 to 10 numbers 
		/*
		 * for(int i=1 ; i<=10 ; i=i+1) { System.out.println(i); }
		 */
		//decrement values 10 to 1 
		//for(int i=10; i>=1 ;i--){System.out.println(i);}
		
		/*
		 * //print the values in revers for (int i=10;i>=1; i--) {
		 * System.out.println(i); }
		 */
		
		//Odd even numbers 
		
		for(int i=1 ; i<=10 ; i++) {
			if(i%2==0) {
				System.out.println(i+"Even Number");
			}else {
				System.out.println(i+"Odd Number");
			}
			//System.out.println(i);
		}
		
	}

}
