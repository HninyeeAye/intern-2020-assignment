package encapsulation;
 class Person{
	 private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	 
	
}

public class Myclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person myobj=new Person();
		myobj.setName("Mg Mg");
		System.out.println(myobj.getName());

	}

}
