package javaProgramms;

public class Reppitingchar {

	public static void main(String[] args) {
		//e-accurance in the given string 
		String name="Venkatesh";
		int eCount=0;
		for(int i=0 ; i<name.length() ; i++) {
			char ch=name.charAt(i);
			if(ch=='e') {
				eCount++;
			}
		}
		System.out.println("E accurnace in give string is : "+eCount);
	}

}
