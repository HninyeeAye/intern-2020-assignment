package accessModifier;
class Person{
	void mes() {
		System.out.println("Hello");
	}
}

public class PublicExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person human=new Person();
		human.mes();

	}

}
