package test.main;

import java.io.File;

public class MainClass03 {

	public static void main(String[] args) {
		File file=new File("c:/");
		//디렉토리 혹은 파일 목록을 얻어온다.
		String[] names=file.list();
		//반복문 이용해서 출력ㅎㅐ보기
		for(String tmp:names){
			System.out.println(tmp);
		}
		//각각의 디렉토리 혹은 파일을 access 할수있는 File객체 
		//목록을 얻어온다.
		File[] files=file.listFiles();
		for(File tmp:files){
			//파일 혹은 디렉토리의 이름을 얻어온다.
			String name=tmp.getName();
			if(tmp.isDirectory()){//만일 디렉토리라면 
				System.out.println("["+name+"]");
			}else{//디렉토리가 아니라면 
				System.out.println(name);
				
			}
		}

	}

}
