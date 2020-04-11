import java.util.*;

public class over_load_test {
	public static void main(String[] args) {
		Hello.hello();
		Hello.hello("zy");
	}
}

class Hello {
	static void hello() {
		System.out.println("hi");
	}

	static void hello(String name) {
		System.out.println("hi "+name);
	}
}
