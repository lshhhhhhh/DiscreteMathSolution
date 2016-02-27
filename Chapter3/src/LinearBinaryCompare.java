
public class LinearBinaryCompare {
	public static void main(String[] args){
		int[] test ={1,2,3,4,5,6,7,8,9,10};
		Linear(test, 5);
		Search(test, 8);
	}
		
	

	public static int Linear(int[] arr,int target){
		int compare=0;
		int index =-1;
		for(int i=0;i<arr.length;i++){
			compare++;
			if(arr[i]==target){
				index=i;
				System.out.println("LinearSearch uses "+compare+" comparisons.");
				return index;
			}
		}
		System.out.println("LinearSearch uses "+compare+" comparisons.");
		return index;
	}
	public static int Search(int[] arr,int target){
		int compare=0;
		int i=0;
		int j=arr.length-1;
		int m=0;
		while(i<=j){
			m=i+(j-i)/2;
			if (arr[m]>target){
				j=m-1;
				compare++;
			}
			else if (arr[m]<target){
				compare+=2;
				i=m+1;
			}
			else {
				compare+=2;
				System.out.println("BinarySearch used "+compare+" comparisons.");
				return m;
			}
			
		}
		System.out.println("BinarySearch used "+compare+" comparisons.");
		return -1;
	}	
}