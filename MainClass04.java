package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	//�ؽ�Ʈ ������ �����ϰ� ���ڿ� ����ϱ� 

	public static void main(String[] args) {
		File file = new File("c:/myFolder/myMemo.txt");
		try{
			//���Ͽ� ���ڿ��� ����� �� �ִ� ��ü ����
			FileWriter fw=new FileWriter(file);
			fw.write("�豸��\r\n");
			fw.write("�ذ�\r\n");
			fw.write("������\r\n");
			fw.flush();
			fw.close();//.close ������ ������ ����� ����.
		}catch(IOException ie){
			ie.printStackTrace();
		}

	}

}
