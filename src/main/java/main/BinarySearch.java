package main;

public class BinarySearch {
	/*public static void main(String[] args) {
		System.out.println("Binary Search");
		int array[]={1,2,3,4,5,8,9,15,16,19};

		System.out.println(searching(array,2));
	}*/

	public  int searching(int[] a, int num){
		int result=-1;
		int end=a.length-1;
		int mid=end/2;
		if(a[mid]>num){

			for(int i=mid;i>=0;i--){
				if(a[i]==num){
					result=i+1;	
				}
			}
			return result;
		}
		else if(a[mid]<num){
			for(int i=mid;i<=end;i++){
				if(a[i]==num){
					result=i+1;
				}
			}

		}
		System.out.println(result);
		return result;
	}

}
