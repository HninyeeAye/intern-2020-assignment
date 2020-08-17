package abstraction;

public class Dog extends Animal {
	public void Sound() {
		System.out.println("Woke");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Dog();
		obj.Sound();

	}

}
