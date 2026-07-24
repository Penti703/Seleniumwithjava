package javaProgramms;

class ConsStructor{
	private int age;
	private String name;
	public ConsStructor(){
		
	}
	public ConsStructor(int a, String n) {
		this.age = a;
		this.name = n;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class Contstractor {

	public static void main(String[] args) {
		
		ConsStructor ct=new ConsStructor();
		ConsStructor ct2=new ConsStructor(26,"Krishna");
		ct.setAge(20);
		ct.setName("Venkatesh Penti");
		
		System.out.println(ct.getName()+" :"+ct.getAge());
		System.out.println(ct2.getName()+" :"+ct2.getAge());
	}

}
