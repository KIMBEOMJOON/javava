package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass02 {

	public static void main(String[] args) {
		File file=new File("C:/myFolder/test.txt");
		if(file.exists()){
			System.out.println();
			if(file.exists()){
				System.out.println("���� �մϴ�.");
				if(file.isDirectory()){
					System.out.println("���丮�Դϴ�.");
				}else{
					System.out.println("�����Դϴ�.");
				}
				
			}else{
				System.out.println("���������ʽ��ϴ�.");
				//���� �����
				try {
					file.createNewFile();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}

		}
	}

}
