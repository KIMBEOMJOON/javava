package test.main;

import java.io.File;

public class MainClass03 {

	public static void main(String[] args) {
		File file=new File("c:/");
		//���丮 Ȥ�� ���� ����� ���´�.
		String[] names=file.list();
		//�ݺ��� �̿��ؼ� ��¤�������
		for(String tmp:names){
			System.out.println(tmp);
		}
		//������ ���丮 Ȥ�� ������ access �Ҽ��ִ� File��ü 
		//����� ���´�.
		File[] files=file.listFiles();
		for(File tmp:files){
			//���� Ȥ�� ���丮�� �̸��� ���´�.
			String name=tmp.getName();
			if(tmp.isDirectory()){//���� ���丮��� 
				System.out.println("["+name+"]");
			}else{//���丮�� �ƴ϶�� 
				System.out.println(name);
				
			}
		}

	}

}
