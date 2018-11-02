
class ClassOne{
	ClassOne(){
		System.out.println("I am ClassOne");
	}
}

class ClassTwo extends ClassOne{
	ClassTwo(){
		System.out.println("T am in ClassTwo");
	}
}

class ClassThree extends ClassTwo{
	ClassThree(){
		System.out.println("I am in ClassThree");
	}
}

public class ConstructorChaining {
	
	public static void main(String[] args) {
		ClassThree a = new ClassThree();
	}
}
