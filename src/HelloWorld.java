
public class HelloWorld {

	public static void main(String[] args) {
		System.out.println("Hello World");
	}

	// static block is executed even before the main method
	// if multiple static blocks are present order matters
	// Static Block 1 executes first then Static Block 2
	static {
		System.out.println("Static Block 1");
	}

	static {
		System.out.println("Static Block 2");
	}

}
