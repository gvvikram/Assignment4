package main;
public class LinearSearch {
	/*public static void main(String[] args) {
		int array[]={1,2,3,4,5,8,9,15,16,19};
		
System.out.println(searching(array,8));
	}*/
   public  int searching(int array[],int a){
	   int length=array.length;
	   int result=-1;
	   if(array[length-1]>a){
	   for(int i=0;i<length;i++){
		   if(array[i]==a){
			   result= i+1;
		   }
	   }
   }
	return result;
}
}
