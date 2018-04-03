package test.main;

public class MainClass01 {

	public static void main(String[] args) {
		int num=10;
		//int type을 담을 수 있는 방 5개짜리 고정 배열을 생성
		int[] nums=new int[5];
		nums[0]=100;
		nums[1]=200;
		
		System.out.println("메인메소드가 종료됩니다.");

	}

}
//Arraylist는 가변배열, 알아서 크기가 줄어들고 작아짐
//대신 고정배열은 기본데이터타입이 삽입이 가능.