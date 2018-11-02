
public class OverloadingDemo {
	
	/**
	 * Concept of Compile time Polymorphism
	 */
	
	public static void sum(int a, int b){
		double c = a+b;
		System.out.println("Sum = "+c);
	}
	
	public static void sum(int a, int b, int c){
		double d = a+b+c;
		System.out.println("Sum = "+d);
	}
	
	public static void sum(int a, double b){
		double c = a+b;
		System.out.println("Sum = "+c);
	}
	
	public static void sum(double a, double b){
		double c = a+b;
		System.out.println("Sum = "+c);
	}
	
	public static void sum(double a, double b, double c){
		double d = a+b+c;
		System.out.println("Sum = "+d);
	}
	
	public static void main(String[] args) {
		 sum(45,45);
		 sum(55.89,675.67);
		 sum (45,12,34);
	}

}
