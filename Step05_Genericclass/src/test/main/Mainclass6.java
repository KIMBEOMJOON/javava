package test.main;

import java.util.ArrayList;
import java.util.List;

import test.dto.MemberDto;

public class Mainclass6 {

	public static void main(String[] args) {
		List<MemberDto> list=new ArrayList<>();
		
		MemberDto dto1=new MemberDto(1,"�豸��","�뷮��");
		MemberDto dto2=new MemberDto(2,"�ذ�","������");
		
		list.add(dto1);
		list.add(dto2);
	}

}
