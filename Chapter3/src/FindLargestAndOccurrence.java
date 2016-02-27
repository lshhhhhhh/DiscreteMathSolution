//Question 2
public class FindLargestAndOccurrence {
	public static void main(String[] args){
		int[]test={1,1,2,2,3,3,4,4,6,6,5,5};
		int first_max_occur=0;
		int last_max_occur=0;
		for (int i=1;i<test.length;i++){
			if (test[i]>test[last_max_occur]){
				last_max_occur=i;
				first_max_occur=i;
			}
			else if(test[i]==test[last_max_occur]){
				last_max_occur=i;
			}
		}
		System.out.println("The first occurence of the largest value is in index "+first_max_occur);
		System.out.println("The last occurence of the largest value is in index "+last_max_occur);
	}	
}
