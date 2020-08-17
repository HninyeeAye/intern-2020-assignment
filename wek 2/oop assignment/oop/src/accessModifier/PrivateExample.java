package accessModifier;
class Gender{
	private void show() {
		System.out.println("Hello");
	}
}
public class PrivateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender male=new Gender();
		
		//male.show();

	}

}
