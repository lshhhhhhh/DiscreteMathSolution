import java.lang.Math.*;
public class BaseXexpansion {
	public static void main(String[] args){
		int []arr=expansion(14, 2);
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	}
	public static int[] expansion(int n,int b){
		int [] result=new int[(int)(Math.log(n)/Math.log(b))+1];
		int length=result.length;
		while(n>0){
			int digit=0;
			digit=n%b;
			n=n/b;
			result[length-1]=digit;
			length--;
		}
		return result;
	}
}
