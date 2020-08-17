package polymorphisom;
class A{
	
	void result(int a){
		System.out.println(a);
	}
	void result(int a, int b) {
		System.out.println(a+""+b);
	}
	void result(double a) {
		System.out.println(a);
	}
}

public class CompileTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj=new A();
		obj.result(10);
		obj.result(10, 27);
		obj.result(5.5);

	}

}
