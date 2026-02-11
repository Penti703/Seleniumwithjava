package oopcpackage;

public class ReverseSTRING {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Venkatesh";
		String reversed=new StringBuilder(str).reverse().toString();
		//System.out.println(reversed);
		System.out.println(str.length());
		
		for (int i=str.length()-1 ;i>=0 ;i--) {
			reversed=reversed+str.charAt(i);
			
		}System.out.println(reversed);

	}

}
