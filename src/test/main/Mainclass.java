package test.main;

public class Mainclass{
	public static void main(String[] args) {
		System.out.println("메인메소드가 시작 됩니다.");
		
		//Car 클래스를 이용해서 객체를 생성해보세요.
		new Car();
		//객체를 한번쓰고 버리기
				new Car().drive();
		//Car클래스를 이용해서 객체를 생성하고 참조값(id)으로 변수에 담기
		Car a =new Car();
		//필요에따라 여러번 쓰기
		a.drive();
		a.drive();
		a.drive();   //메소드는 콜(호출,불러옴)
		
		String b = a.company; //필드값은 참조
		
	
		System.out.println("메인 메소드가 리턴됩니다.");
	}
}
