
public class StaticMethodsDemo {

	public static void main(String[] args) {
		System.out.println("Inside Main");
		StaticMethodsDemo.method1();
	}
	
	static void method1() {
		System.out.println("static method 1");
	}
	
	static {
		System.out.println("Inside static block");
		StaticMethodsDemo.method1();
	}

}
