package test.main;

import test.fruit.Apple;
import test.fruit.FruitBox;
import test.fruit.Orange;

public class Mainclass2 {

	public static void main(String[] args) {
		//generic class �� Apple�� �����ϸ� Apple��ü�� ���� �� �ִ� . 
		FruitBox<Apple> box1=new FruitBox<Apple>(new Apple());
		//generic class�� Orange�� �����ϸ� Orange��ü�� ���� �� �ִ�.
		FruitBox<Orange> box2=new FruitBox<Orange>(new Orange());
		//int�� ��� ������ Integer
		Apple apple=box1.getFruit();
		Orange orange=box2.getFruit();
		
	}

}
