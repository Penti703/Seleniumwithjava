package javaProgramms;

class carDrivers{
	private String name;
	private int age;
	String address;
	int pinCode;
	
	public int getAge() {
		return age;		
	}
	public String getName() {
		return name;		
	}
	public void setNum(int age) {
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
}

public class GetterAndSetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		carDrivers ct=new carDrivers();
		ct.setName("Venkatesh Penti");
		ct.setNum(27);
		System.out.println(ct.getName()+" : "+ct.getAge());

	}

}
