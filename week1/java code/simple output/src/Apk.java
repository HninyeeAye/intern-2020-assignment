
public class Apk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apk myApk = new Apk();
		String sup=myApk.superMethod();
		System.out.println(sup);
		myApk.hyperMethod();
		int ult = myApk.ultraMethod();
		System.out.println(ult);
		}
	public String superMethod(){
		System.out.println("This is super Methods....");
	    return "Hiper Methods";
	}
	public void hyperMethod() {
		System.out.println("This is hyper Methods....");
		}
	public  int ultraMethod() {
		System.out.println("This is ultra Methods....");
		return 234;
	}

}
