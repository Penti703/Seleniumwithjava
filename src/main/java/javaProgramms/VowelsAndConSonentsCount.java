package javaProgramms;

public class VowelsAndConSonentsCount {

	public static void main(String[] args) {
		//VowelsAndConSonentsCount

		String name="Venkatesh".toLowerCase();
		int vowelsCount=0;
		int conSonentsCount=0;
		for(int i=0 ; i<name.length() ; i++) {
			char ch=name.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowelsCount++;
			}else {
				conSonentsCount++;
			}

	}
		System.out.println("vowelsCount is :  "+vowelsCount);
		System.out.println("conSonentsCount is :  "+conSonentsCount);
}

}
