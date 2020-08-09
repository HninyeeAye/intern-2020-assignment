
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentNames = new String[10];
		studentNames[0] = "Nan May Me Zu";
		studentNames[1] = "Htet Lwin Aung";
		studentNames[2] = "Phyo Zin Mar";
		studentNames[3] = "Thae Nu San";
		studentNames[4] = "Hnin Nandar Aung";
		studentNames[5] = "Lwin Nandar Oo";
		studentNames[6] = "Khin Thu Thu Ko";
		studentNames[7] = "Phyo Ei San";
		studentNames[8] = "Theik Non";
		studentNames[9] = "Hnin Yee Aye";
		//complete yourself to assign 10 students name 
				for(int i = 0; i < studentNames.length;i++) {
					if(studentNames[i] == "Hnin Yee Aye") {
						System.out.println("I'm " + studentNames[i]);
						System.out.println(" and my Index is : " + i);
						}
					}
	}

}
