

public class ClassThis {
	
	int a;
	int b;
	
	void mtd(int a, int b){
		this.a=a;
		this.b=b;
	}
	
	void print(){
		System.out.println("Value of a = "+ a);
		System.out.println("Value of b = "+ b);
	}
	
	public static void main(String[] args) {
		
		ClassThis a = new ClassThis();
		a.mtd(45, 88);
		a.print();
	}

}
