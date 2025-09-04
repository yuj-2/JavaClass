package days14;

import java.util.Arrays;

/**
 * @author kenik  
 * @date 2025. 9. 4. 오후 4:10:41 
 * @subject   클래스(객체) 배열 설명
 * @content 
 */ 
public class Ex12_02 {

	public static void main(String[] args) {
		// 5명의 사람(Person)객체를 생성해서 -> 일 시키도록 하겠습니다. 
		// 배열 선언
		// 자료형 [] 배열명 = new 자료형[배열크기];
		Person [] pArr = new Person[5];
		String [] pNames = {"김다원","김민배","김수진","김유진","김호연"};
		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i] = new Person();
			pArr[i].name = pNames[i];
		}		
		System.out.println( Arrays.toString(pArr));		
		for (int i = 0; i < pArr.length; i++) {
			pArr[i].work();
		}
		
		// Person p1;
		//pArr[0].name = "김다원";
		

	} // main
 
} // class










