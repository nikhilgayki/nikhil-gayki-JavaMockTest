
class Class1 {
	
	public void testmethod1(){
		System.out.println("I am in Class1 and in Testmetbod1");
	}
	
	public void commonMethod1(){
		System.out.println("I am in common method of Class1");
	}
	
}

class Class2 extends Class1{
	
	public void commonMethod1(){
		System.out.println("I am in common method of Class2");
	}
	
}

public class OverriddingDemo extends Class2{
	
	public static void main(String[] args) {
		
		Class1 c1 = new Class1();
		Class2 c2 = new Class2();
			
		c1.testmethod1();
		c2.commonMethod1();
		
		c2.testmethod1();
		
	}

}
