//Q5
public class BubbleSort {
	public static void main(String[] args){
		int [] test={3,2,5,6,2,3};
		Bubble(test);
		for(int i=0;i<test.length;i++)
		System.out.println(test[i]);
	}
	public static void Bubble(int[] arr){
		for (int i=0;i<arr.length-1;i++){
			for(int j= i+1;j<arr.length;j++){
				if(arr[i]>arr[j])
					swap(arr, i, j);
			}
		}
		
	}
	public static  void swap (int[] a, int i, int j) {
		  int t = a[i];
		  a[i] = a[j];
		  a[j] = t;
		}
}
