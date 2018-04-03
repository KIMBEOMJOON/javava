package test.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass06 {

	public static void main(String[] args) {
		//�ʿ��� ��ü�� ���� ���� �����
		FileInputStream fis=null;
		FileOutputStream fos=null;
	
		try {
			//�ʿ��� ��ü�� �����ؼ� ������ ������ �����ϱ� 
			fis=new FileInputStream("c:/myFolder/myImage.jpg");
			fos=new FileOutputStream("c:/myFolder/copiedImage.jpg");
			
			//�ѹ��� �о�� byte �� ũ�⸦ ����ؼ� byte[] ��ü �����ϱ�
			byte[] buffer=new byte[1024];//�ʹ�ũ�� �޸𸮸� ���̸���.
			while(true){
				//buffer ��ü�� �̿��ؼ� byte �˰��̸� �о���δ�. 
				int readedCount=fis.read(buffer);
				//���̻� ���� byte �˰��̰� ���ٸ� �ݺ��� Ż�� 
				if(readedCount == -1)break;
				//buffer ��ü�� ����� byte �˰��̸� ���� ��ŭ ��� ���Ͽ� ����Ѵ�.
				fos.write(buffer, 0, readedCount);//�迭�� 0���濡������ ������ŭ
				fos.flush();//����
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			//������ �ݵ��� ����Ǵ� ������ ������ �۾��� �Ұ� ������ �Ѵ�. 
			try {
				fos.close();
				fis.close();//�ݾ��ֱ� 
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
