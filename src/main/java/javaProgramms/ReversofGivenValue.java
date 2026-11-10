package javaProgramms;

public class ReversofGivenValue {

	public static void main(String[] args) {
		// Revers of Given Value is 
		String name="Venkatesh";
		String revers="";
		for(int i=name.length()-1;i>=0 ;i--) {
			char ch=name.charAt(i);
			revers=revers+ch;
		}
		System.out.println("Orginal values is : "+name);
		System.out.println("revers values is : "+revers);
		if(revers.equals(name)) {
			System.out.println("Is a Palandorm");
		}else {
			System.out.println("Not a Palandorm");
		}
	}

}
