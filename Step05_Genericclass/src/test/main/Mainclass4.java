package test.main;

import java.util.HashMap;
import java.util.Map;

import test.dto.MemberDto;

public class Mainclass4 {

	public static void main(String[] args) {
		//주로 String은 고정,뒤는 그에 맞춰서 하나를줌
		
		/*
		 * key값의 generic 은 일반적으로 String type을 많이 사용하고 
		 * value값의 type이 여러가지면 value의 generic은 Object로 지정하면된다 . 
		 */
		/*Hash*/Map<String,Object> map=new HashMap</*String,Object*/>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		//데이터를 참조할때는 .get(key)해서 참조한다 .Object일때는 안에 들어있는값에 따라
		//캐스팅 해주어야 한다 . Int만 들어있다면 캐스팅 필요없으니까 개이득!
		int num = (Integer)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
		
		//Map인터페이스로 만들어서 내용을 put  get을 넣어서 만들어둔다 . 
		
		//MemberDto 객체에 회원 한명의 정보 담아보기
		
		MemberDto dto1=new MemberDto(2,"해골","행신동");
		//데이터 참조
		int num2=dto1.getNum();
		String name2=dto1.getName();
		String addr2=dto1.getAddr();
		
	}

}
