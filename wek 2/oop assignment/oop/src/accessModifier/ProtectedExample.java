package accessModifier;
class Child{
	protected void show() {
		System.out.println("Hello");
	}
}

public class ProtectedExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child baby=new Child();
		baby.show();
	}

}
