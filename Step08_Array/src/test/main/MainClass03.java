package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass03 {

	public static void main(String[] args){
		//1.Car type�� ������ �ִ� �� 5��¥���� �迭��ü ����
		Car[] cars =new Car[5];
		
		List<Car> car2=new ArrayList</*Car*/>(); //�����迭
		//2.Car ��ü�� �������� ������ �濡 ��ƺ�����.
		for(int i=0;i<cars.length;i++){
			cars[i]=new Car();
		}
		
		//cars�迭�� ����� Car��ü�� �ϳ��� �����ؼ� drive()�޼ҵ带 
		//ȣ���غ�����.
		
		for(int i=0;i<cars.length;i++){
			Car tmp=cars[i];
			tmp.drive();
		}
		
		System.out.println("=========================");
		
		for (Car tmp:cars){
			tmp.drive();
		}
		//���𰡸� ã�Ƴ��� �����Ҷ��� �ڿ������� ó���ؾ��Ѵ�.
		//�տ������� ������ ������ ������ ���ǰ��� ������ ������� �˻簡 ���� �ʴ´� .
		//�׷��� ������ �ڿ��� ���� ���� !! 
		
		/*for (int i=nums.length-1;i>=0;i--){
			
		}*/
	}
}
//����for+���� 