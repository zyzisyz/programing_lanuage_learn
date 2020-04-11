import java.util.*;

public class class_test {
	public static void main(String[] args) {
		Person p = new Person("Xiao Ming", 14);
		System.out.println(p.Get_Name());
		System.out.println(p.Get_Age());
	}
}

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String Get_Name() {
		return this.name;
	}

	public int Get_Age() {
		return this.age;
	}
}
