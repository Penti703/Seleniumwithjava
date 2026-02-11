package oopcpackage;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String at="Programming";
		String result="";
		for(int i=0; i<at.length();i++) {
			char ch=at.charAt(i);
		
			if(result.indexOf(ch)==-1) {
				
				result=result+ch;
			}
		}System.out.println(result );
	}

}
