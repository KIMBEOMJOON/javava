package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass02 {

	public static void main(String[] args) {
		File file=new File("C:/myFolder/test.txt");
		if(file.exists()){
			System.out.println();
			if(file.exists()){
				System.out.println("존재 합니다.");
				if(file.isDirectory()){
					System.out.println("디렉토리입니다.");
				}else{
					System.out.println("파일입니다.");
				}
				
			}else{
				System.out.println("존재하지않습니다.");
				//파일 만들기
				try {
					file.createNewFile();
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}

		}
	}

}
