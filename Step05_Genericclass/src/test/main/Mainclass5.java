package test.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mainclass5 {

	public static void main(String[] args) {
		List<Map<String,Object>> list=new ArrayList<>();
		//List�� ���ʸ��� Map Map���ٰ� �������Է��ϸ� List�� �˾Ƽ� ���δ�.
		/*Hash*/Map<String,Object> map=new HashMap</*String,Object*/>();
		map.put("num", 1);
		map.put("name", "�豸��");
		map.put("addr", "�뷮��");
		
		Map<String,Object> map2=new HashMap</*String,Object*/>();
		map2.put("num", 2);
		map2.put("name", "�ذ�");
		map2.put("addr", "��ŵ�");
		
		list.add(map);
		list.add(map2);
		
		
		
		
		

	}

}
