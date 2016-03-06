//Q3
public class CantorExpansion {
	public static void main(String[]args){
		int[] arr=Cantor(87);
		for(int i=0;i<arr.length;i++)
		System.out.print(arr[i]);
	}
	public static int[] Cantor(int n){
		int maxdigit=1;
		while(factorial(maxdigit)<n)
			maxdigit++;
		maxdigit--;
		int []result=new int[maxdigit];
		while(n>0){
			for(int i=maxdigit-1;i>=0;i--){
				result[result.length-i-1]= (int) (n/factorial(maxdigit));
				n=n-factorial(maxdigit)*result[result.length-i-1];
				maxdigit--;
			}
		}
		return result;
	}
	public static int factorial(int number) {
	      if (number <= 1)
	         return 1;
	      else
	         return number * factorial(number - 1);
	   }
}
