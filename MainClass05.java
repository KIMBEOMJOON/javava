package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class MainClass05 {

	public static void main(String[] args) {
		File file = new File("c:/myFolder/myMemo.txt");
		try{
			FileReader fr=new FileReader(file);
			BufferedReader br=new BufferedReader(fr);
			
			while(true){//�ݺ��� ���鼭 ���ڿ��� ���پ� �о���̰�
				String line=br.readLine();
				if(line==null)break;//���� �����Ͱ� ������ ��������.
				//���
				System.out.println(line);
			}
		}catch(Exception e ){
			e.printStackTrace();
			
		}

	}

}
