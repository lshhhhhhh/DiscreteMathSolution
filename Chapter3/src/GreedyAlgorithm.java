//Q7
public class GreedyAlgorithm {
	public static void main(String[] args){
		Greedy(80);
	}
	public static void Greedy(int cents){
		int quarter=cents/15;
		cents=cents-quarter*15;
		int dime=cents/10;
		cents=cents-dime*10;
		int nickel=cents/5;
		int penny=cents-nickel*5;
		System.out.println("Quarter: "+quarter);
		System.out.println("Dime: "+dime);
		System.out.println("Nicklel: "+nickel);
		System.out.println("Penny: "+penny);
	}
}
