package test.main;

import java.io.File;

public class MainClass01 {

	public static void main(String[] args) {
		//���� ��ü ����.
		File file=new File("c:/myFolder");
		//���� �ϴ��� �Ǻ�
		if(file.exists()){
			System.out.println("���� �մϴ�.");
			if(file.isDirectory()){
				System.out.println("���丮�Դϴ�.");
			}else{
				System.out.println("�����Դϴ�.");
			}
			
		}else{
			System.out.println("���������ʽ��ϴ�.");
			file.mkdir();
		}

	}

}

