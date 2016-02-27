import java.nio.charset.MalformedInputException;

import javax.swing.text.StyledEditorKit.ForegroundAction;

//Chapter3 Question 1
public class FindLargest {
	public static void main(String[] args){
		int[] test1={3,1,2,5,6,7,2};
		int result=find(test1);
		System.out.println(result);
	}
	static int find(int []arr){
		int max=arr[0];
		for (int i=1;i<arr.length;i++){
			if (arr[i]>max)
			max=arr[i];
		}
		return max;
	}
}
