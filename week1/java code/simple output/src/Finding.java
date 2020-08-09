
public class Finding {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numArray = {34,54,64,42,34,56,44,65,87,23,57,74};
		int biggestNumber = biggestNumber(numArray);
		int smallestNumber = smallestNumber(numArray);
		}
   public  static int biggestNumber(int []numArray){
  int result=numArray[0];
   for(int i=0; i<numArray.length ;i++){
	   if(numArray[i]>result){
		  result=numArray[i];
	   }
   }
   System.out.println("The biggest number is"+result);
   return result;
   }
   public static int smallestNumber(int[] numArray){
	   int result=numArray[0];
		  for(int i=0; i<numArray.length ;i++){
		   if(numArray[i]< result ){
			  result=numArray[i];
		   }
	   }
		  System.out.println("Smallest number is"+result);
		  return result;
	   }
}
