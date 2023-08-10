package Training;

import java.util.Date;
import java.util.HashSet;

import common.Teacher;

public class ex17_e04_1 {

	public static void main(String[] args) {

		HashSet<Object> set = new HashSet<Object>();
		
		String varString1 = "JAVA";
		String varString2 = new String("개발자");
		Date varDate = new Date();
		int varInt = 100;
		Teacher varTeacher = new Teacher("김봉두", 55, "체육");
		
		
		System.out.println("add결과"+set.add(varString1));
		set.add(varString2);
		set.add(varDate);
		set.add(varInt);
		set.add(varTeacher);
		
		System.out.println(set.add(varString2) ? "저장성공":"저장실패");
		System.out.println();
		
	}

}
