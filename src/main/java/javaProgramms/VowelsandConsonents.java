package javaProgramms;

public class VowelsandConsonents {

	public static void main(String[] args) {
		
	
		String name="Venkatesh".toLowerCase();
		String vowels="";
		String conSonents="";
		for(int i=0 ; i<name.length() ; i++) {
			char ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowels=vowels+ch;
			}else {
				conSonents=conSonents+ch;
			}

	}
		System.out.println("vowels :  "+vowels);
		System.out.println("conSonents :  "+conSonents);
}
}