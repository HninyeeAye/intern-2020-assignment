
public class Calculator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valueOne = 10;
		int valueTwo = 5;
		Calculator myCalculator = new Calculator();
		int addResult = myCalculator.add(valueOne, valueTwo); // Output => 15
		int subValue = myCalculator.sub(valueOne, valueTwo); // Output => 5
		int mulValue = myCalculator.mul(valueOne, valueTwo); // Output => 50
		int divValue = myCalculator.div(valueOne, valueTwo); // Output => 2
		System.out.println("add : " + addResult);
		System.out.println("sub : " + subValue);
		System.out.println("mul : " + mulValue);
		System.out.println("div : " + divValue);
	}
public int add(int a1,int a2){
	return a1+a2;
}
public int sub(int a1,int a2){
	return a1-a2;
}
public int mul(int a1,int a2){
	return a1*a2;
}
public int div(int a1,int a2){
	return a1/a2;
}
}
