package polymorphisom;

public class Horse extends Animal{
	public void Sound() {
		System.out.println("Neigh");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal obj=new Horse();
		obj.Sound();

	}

}
