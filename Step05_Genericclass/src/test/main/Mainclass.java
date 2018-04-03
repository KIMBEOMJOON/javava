package test.main;

import test.fruit.Apple;
import test.fruit.Applebox;
import test.fruit.Orange;
import test.fruit.Orangebox;

public class Mainclass {

	public static void main(String[] args) {
		//applebox에는 apple객체를담고
		Applebox box1=new Applebox(new Apple());
		//orange박스에는 오렌지 객체를 담을수 있다.
		Orangebox box2=new Orangebox(new Orange());
		//만일 원하는 객체를 담을 수 있는 box를 만들려면 ?

	}

}
