package inheritance;
class D{
	void MethodD() {
		System.out.println("Method is D");
	}
}
class E extends D{
	void MethodE() {
		System.out.println("Method is E");
	}
}
class F extends D{
	void MethodF() {
		System.out.println("Method is F");
	}
}

public class Hierarchical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D obj1=new D();
		E obj2=new E();
		F obj3=new F();
		obj1.MethodD();
		obj2.MethodD();
		obj3.MethodD();

	}

}
