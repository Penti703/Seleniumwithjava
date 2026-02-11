package oopcpackage;

public class SubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Str="venkatesh";
		//String result =Str.substring(0, 4);
		//CharSequence result= Str.subSequence(0, 4);
		Str.concat(" world");
		System.out.println(Str);
		
		StringBuffer at=new StringBuffer("Hello");
		at.append("venkat");
		System.out.println(at);

	}

}
