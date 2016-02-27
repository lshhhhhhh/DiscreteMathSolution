//Q3
public class LinearSearch {
	public static void main(String[] args){
		int[] test1={1,2,3,4,5};
		int result1=FindInt(test1, 3);
		int result2=FindInt(test1, 6);
		System.out.println(result1);
		System.out.println(result2);
	}
	public static int FindInt(int[] arr,int target){
		int index =-1;
		for(int i=0;i<arr.length;i++){
			if(arr[i]==target){
				index=i;
				return index;
			}
		}
		return index;
	}
}
