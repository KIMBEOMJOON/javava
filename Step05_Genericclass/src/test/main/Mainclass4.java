package test.main;

import java.util.HashMap;
import java.util.Map;

import test.dto.MemberDto;

public class Mainclass4 {

	public static void main(String[] args) {
		//�ַ� String�� ����,�ڴ� �׿� ���缭 �ϳ�����
		
		/*
		 * key���� generic �� �Ϲ������� String type�� ���� ����ϰ� 
		 * value���� type�� ���������� value�� generic�� Object�� �����ϸ�ȴ� . 
		 */
		/*Hash*/Map<String,Object> map=new HashMap</*String,Object*/>();
		map.put("num", 1);
		map.put("name", "�豸��");
		map.put("addr", "�뷮��");
		//�����͸� �����Ҷ��� .get(key)�ؼ� �����Ѵ� .Object�϶��� �ȿ� ����ִ°��� ����
		//ĳ���� ���־�� �Ѵ� . Int�� ����ִٸ� ĳ���� �ʿ�����ϱ� ���̵�!
		int num = (Integer)map.get("num");
		String name=(String)map.get("name");
		String addr=(String)map.get("addr");
		
		//Map�������̽��� ���� ������ put  get�� �־ �����д� . 
		
		//MemberDto ��ü�� ȸ�� �Ѹ��� ���� ��ƺ���
		
		MemberDto dto1=new MemberDto(2,"�ذ�","��ŵ�");
		//������ ����
		int num2=dto1.getNum();
		String name2=dto1.getName();
		String addr2=dto1.getAddr();
		
	}

}
