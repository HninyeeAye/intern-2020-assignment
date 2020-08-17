package abstraction;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1=new Dog();
		Animal obj2=new Horse();
		AnimalDo(obj1);
		AnimalDo(obj2);

	}
	public static void AnimalDo(Animal animal) {
		animal.Sound();
		
		
	}

}
