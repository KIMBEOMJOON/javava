package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass04 {
	//텍스트 파일을 생성하고 문자열 기록하기 

	public static void main(String[] args) {
		File file = new File("c:/myFolder/myMemo.txt");
		try{
			//파일에 문자열을 기록할 수 있는 객체 생성
			FileWriter fw=new FileWriter(file);
			fw.write("김구라\r\n");
			fw.write("해골\r\n");
			fw.write("원숭이\r\n");
			fw.flush();
			fw.close();//.close 시점에 파일이 만들어 진다.
		}catch(IOException ie){
			ie.printStackTrace();
		}

	}

}
