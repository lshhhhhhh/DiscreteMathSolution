//Q6
public class InsertionSort {
	public static void main(String[] args){
		int [] test={3,2,5,6,2,3};
		Insertion(test);
		for(int i=0;i<test.length;i++)
		System.out.println(test[i]);
	}
	public static void Insertion(int[] arr){
		for (int i=1;i<arr.length;i++){
			int j;
			int temp=arr[i];
			for(j=i-1;j>=0&&arr[j]>temp;j--){
				arr[j+1]=arr[j];
			}
			arr[j+1]=temp;
		}
		
	}
}
