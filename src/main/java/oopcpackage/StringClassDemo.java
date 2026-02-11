package oopcpackage;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String St="Venkatesh Penti";
		String ks="krishna";
		System.out.println("Print the name "+St);//Printing the value 
		System.out.println("lenght of the staring values is "+St.length());//lenght values 
		System.out.println("Pring the single char of the string :"+St.charAt(3));//
		System.out.println("Replacing the values  :"+St.replace("e", "a"));
		St.replaceAll(St, "krishna");
		String kt=St.replaceAll(St, ks);
		System.out.println("Replacing the values  :"+St.replaceAll(St, ks));
		System.out.println("Replacing values is :"+kt);
		
		for(int i=0; i<St.length() ; i++) {
			
			System.out.println((St));
		}
	}

}
