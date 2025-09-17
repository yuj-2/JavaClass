package days23;

import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 2:45:15 
 * @subject   
 * @content 
 */ 
public class Ex06_03 {

	public static void main(String[] args) {
		
		ArrayList name1 = new ArrayList();
		name1.add("김길동");
		name1.add("홍길동");
		name1.add("박길동");
		
		
		ArrayList name2 = new ArrayList();
		name2.add("김기동");
		name2.add("홍기동");
		name2.add("박기동");
		
		ArrayList name3 = new ArrayList();
		name3.add("차기동");
		name3.add("이동");
		name3.add("김기동");
		
		
		ArrayList  tname = new ArrayList();
		tname.add(name1);
		tname.add(name2);
		tname.add(name3);
		
		System.out.println( tname.get(0) ); // ArrayList
		System.out.println( tname.get(1) );
		System.out.println( tname.get(2) );

	}

}










