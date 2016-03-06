//question2
public class ModularExponentiation {
	public static void main(String[] args){
		int a=ModularExpo(3, 11, 2);
		System.out.println(a);
	}
	public static int ModularExpo(int a, int b, int m){
		int x=1;
		int[] BinaryArr=BaseXexpansion.expansion(b, 2);
		int power=b%m;
		for(int i=BinaryArr.length-1;i>=0;i--){
			if(BinaryArr[i]==1)
				x=(x*power)%m;
			power=(power*power)%m;
		}
		return x;
	}
} 
