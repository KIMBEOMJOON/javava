package test.main;

public class Mainclass03 {

	public static void main(String[] args) {
		// test1()메소드를 호출해보세요.
		new Mainclass03().test1();
		// test2() 메소드를 호출해보세요.
		test2();
	}

	public void test1() {
		System.out.println("test1() 호출됨");
	}

	public static void test2() {
		System.out.println("test2() 호출됨");
	}
}
