class Sample{
	
	public void show(char c){
		System.out.println(c);
	}
	
	public void show(char c,int num){
		System.out.println(c+" "+num);
	}
}


public class Methodover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Sample obj=new Sample();
       obj.show('a');
       obj.show('a',10);
	}

}
