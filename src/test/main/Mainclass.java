package test.main;

public class Mainclass{
	public static void main(String[] args) {
		System.out.println("���θ޼ҵ尡 ���� �˴ϴ�.");
		
		//Car Ŭ������ �̿��ؼ� ��ü�� �����غ�����.
		new Car();
		//��ü�� �ѹ����� ������
				new Car().drive();
		//CarŬ������ �̿��ؼ� ��ü�� �����ϰ� ������(id)���� ������ ���
		Car a =new Car();
		//�ʿ信���� ������ ����
		a.drive();
		a.drive();
		a.drive();   //�޼ҵ�� ��(ȣ��,�ҷ���)
		
		String b = a.company; //�ʵ尪�� ����
		
	
		System.out.println("���� �޼ҵ尡 ���ϵ˴ϴ�.");
	}
}
