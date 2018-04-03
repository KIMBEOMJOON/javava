package test.main;

import java.io.File;

public class MainClass01 {

	public static void main(String[] args) {
		//파일 객체 생성.
		File file=new File("c:/myFolder");
		//존재 하는지 판별
		if(file.exists()){
			System.out.println("존재 합니다.");
			if(file.isDirectory()){
				System.out.println("디렉토리입니다.");
			}else{
				System.out.println("파일입니다.");
			}
			
		}else{
			System.out.println("존재하지않습니다.");
			file.mkdir();
		}

	}

}

