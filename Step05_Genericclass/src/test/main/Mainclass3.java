package test.main;

import java.util.ArrayList;
import java.util.List;

import test.fruit.Orange;

public class Mainclass3 {

	public static void main(String[] args) {
		// 정수를 담을 수 있는 ArrayList객체 생성
		List<Integer> list1 = new ArrayList<Integer>();//인터페이스타입으로
		// 인터페이스타입으로받아도 문제가 없다
		// DB에서 불러와서 클라이언트에 다시 던져줌

		// 정수 담기
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		//String type을 담을 수 있는 ArrayList 객체를 생성
		List<String> list2=new ArrayList<String>();
		list2.add("둘리");
		list2.add("도우너");
		list2.add("또치");
		
		List<Orange>list3=new ArrayList<Orange>();
		//Orange Type 담기 
		list3.add(new Orange());
		list3.add(new Orange());
		list3.add(new Orange());
			
		//.add    .get  .clear   .remove(int index)  잘 알면됨  .size도 ~ ㅎㅎ
		
		System.out.println(list1.get(0));
		

	}
}
