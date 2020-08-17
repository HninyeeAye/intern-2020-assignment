package polymorphisom;

public class Dog extends Animal {
	public void Sound() {
		System.out.println("Woke");
	}
	public void Drink() {
		System.out.println("water");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Dog();
		obj.Sound();
		

	}

}
