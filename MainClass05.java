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
			
			while(true){//반복문 돌면서 문자열을 한줄씩 읽어들이고
				String line=br.readLine();
				if(line==null)break;//읽을 데이터가 없으면 빠져나감.
				//출력
				System.out.println(line);
			}
		}catch(Exception e ){
			e.printStackTrace();
			
		}

	}

}
