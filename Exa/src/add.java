
public class add {

	private int your_age;
	
	public void set_age(int age){
		your_age = age;
	}
	public int getage(){
		return your_age;
	}
	public void saying(){
		System.out.println("Your age is "+getage());
	}
}
