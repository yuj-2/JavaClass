package days22;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 2:10:07 
 * @subject   days21.Ex10_04.java
 * @content 
 */ 
public class Ex08_02 {

	public static void main(String[] args) {
String s = "이름:홍길동, 나이:20살, 성별:여자";
		
		String name;
		int age;
		boolean gender;
		
		// [2] 
		String regex = ",?\\s*[가-힣]{2,}:";
		String [] sArr = s.split(regex);
		System.out.println( Arrays.toString(sArr) );	
		
		name = sArr[1];
		age = Integer.parseInt( sArr[2].substring(0, sArr[2].length()-1) );
		gender = sArr[3].equals("여자")?false: true;
		
		
		
		/* [1]
		String regex = ",\\s*";
		String [] sArr =  s.split(regex);
		// System.out.println( Arrays.toString(sArr) );		
//		for (int i = 0; i < sArr.length; i++) {
//			System.out.println(  sArr[i].split(":")[1]  );
//		}		
		name =  sArr[0].split(":")[1];		
		System.out.println( "> name: " + name );		
		//      "20살"  -> "20"
		age =  Integer.parseInt( sArr[1].split(":")[1].replaceAll("살", "") );
		System.out.println( "> age: " + age );		
 		gender =  sArr[2].split(":")[1].equals("여자")?false:true;
 		System.out.println( "> gender: " + gender );
		*/
		

	} // main

} // class
