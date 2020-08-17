package abstraction;

public class Horse extends Animal{
	public void Sound() {
		System.out.println("Neigh");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj1=new Horse();
		obj1.Sound();
		

	}

}
