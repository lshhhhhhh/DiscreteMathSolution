//Q4
public class BinarySearch {
	public static void main(String[] args){
		int[]test={1,3,5,7,9,11};
		int result1=Search(test, 11);
		int result2=Search(test, 1);
		System.out.println(result1);
		System.out.println(result2);
	}
	public static int Search(int[] arr,int target){
		int i=0;
		int j=arr.length-1;
		int m=0;
		while(i<=j){
			m=i+(j-i)/2;
			if (arr[m]>target)
				j=m-1;
			else if (arr[m]<target)
				i=m+1;
			else 
				return m;
			
		}
		return -1;
	}	
}
