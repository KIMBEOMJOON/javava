package test.main;

import test.fruit.Apple;
import test.fruit.FruitBox;
import test.fruit.Orange;

public class Mainclass2 {

	public static void main(String[] args) {
		//generic class 를 Apple로 지정하면 Apple객체를 담을 수 있다 . 
		FruitBox<Apple> box1=new FruitBox<Apple>(new Apple());
		//generic class를 Orange로 지정하면 Orange객체를 담을 수 있다.
		FruitBox<Orange> box2=new FruitBox<Orange>(new Orange());
		//int를 담고 싶으면 Integer
		Apple apple=box1.getFruit();
		Orange orange=box2.getFruit();
		
	}

}
