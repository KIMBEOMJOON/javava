package test.main;

import test.fruit.Apple;
import test.fruit.Applebox;
import test.fruit.Orange;
import test.fruit.Orangebox;

public class Mainclass {

	public static void main(String[] args) {
		//applebox���� apple��ü�����
		Applebox box1=new Applebox(new Apple());
		//orange�ڽ����� ������ ��ü�� ������ �ִ�.
		Orangebox box2=new Orangebox(new Orange());
		//���� ���ϴ� ��ü�� ���� �� �ִ� box�� ������� ?

	}

}
