package test.main;

import java.util.ArrayList;
import java.util.List;

import test.fruit.Orange;

public class Mainclass3 {

	public static void main(String[] args) {
		// ������ ���� �� �ִ� ArrayList��ü ����
		List<Integer> list1 = new ArrayList<Integer>();//�������̽�Ÿ������
		// �������̽�Ÿ�����ι޾Ƶ� ������ ����
		// DB���� �ҷ��ͼ� Ŭ���̾�Ʈ�� �ٽ� ������

		// ���� ���
		list1.add(10);
		list1.add(20);
		list1.add(30);
		
		//String type�� ���� �� �ִ� ArrayList ��ü�� ����
		List<String> list2=new ArrayList<String>();
		list2.add("�Ѹ�");
		list2.add("�����");
		list2.add("��ġ");
		
		List<Orange>list3=new ArrayList<Orange>();
		//Orange Type ��� 
		list3.add(new Orange());
		list3.add(new Orange());
		list3.add(new Orange());
			
		//.add    .get  .clear   .remove(int index)  �� �˸��  .size�� ~ ����
		
		System.out.println(list1.get(0));
		

	}
}
