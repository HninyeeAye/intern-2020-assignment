package inheritance;
class X{
	void MethodX() {
		System.out.println("Method is X");
	}
}
class Y extends X{
	void MethodY() {
		System.out.println("Method is Y");
	}
}

public class Multiple extends Y{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiple obj=new Multiple();
		obj.MethodX();
		obj.MethodY();
	}

}
