package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mainclass5 {

	public static void main(String[] args) {
		List<Map<String,Object>> list=new ArrayList<>();
		//List의 제너릭이 Map Map에다가 정보를입력하면 List에 알아서 쌓인다.
		/*Hash*/Map<String,Object> map=new HashMap</*String,Object*/>();
		map.put("num", 1);
		map.put("name", "김구라");
		map.put("addr", "노량진");
		
		Map<String,Object> map2=new HashMap</*String,Object*/>();
		map2.put("num", 2);
		map2.put("name", "해골");
		map2.put("addr", "행신동");
		
		list.add(map);
		list.add(map2);
		
		
		
		
		

	}

}
