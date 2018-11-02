
public class DemoString {
	
	public static void main(String[] args) {
		
		String text = "I have completed the task";
		
		boolean bool = text.equals("I have completed the task");
		System.out.println("String is as Expected = "+bool);
		
		int a = text.length();
		System.out.println("Lenght of string = "+a);
		
		String crop = text.substring(3, 15);
		System.out.println("Required String = "+crop);
		
		String exp = text.trim();
		System.out.println("After Trim = "+exp);
		
	}

}
