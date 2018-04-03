package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass03 {

	public static void main(String[] args){
		//1.Car type을 담을수 있는 방 5개짜리의 배열객체 생성
		Car[] cars =new Car[5];
		
		List<Car> car2=new ArrayList</*Car*/>(); //가변배열
		//2.Car 객체의 참조값을 각각의 방에 담아보세요.
		for(int i=0;i<cars.length;i++){
			cars[i]=new Car();
		}
		
		//cars배열에 저장된 Car객체를 하나씩 참조해서 drive()메소드를 
		//호출해보세요.
		
		for(int i=0;i<cars.length;i++){
			Car tmp=cars[i];
			tmp.drive();
		}
		
		System.out.println("=========================");
		
		for (Car tmp:cars){
			tmp.drive();
		}
		//무언가를 찾아내서 삭제할때는 뒤에서부터 처리해야한다.
		//앞에서부터 삭제해 나가면 삭제시 뒤의값이 앞으로 당겨져서 검사가 되지 않는다 .
		//그렇기 떄문에 뒤에서 부터 삭제 !! 
		
		/*for (int i=nums.length-1;i>=0;i--){
			
		}*/
	}
}
//다중for+역순 