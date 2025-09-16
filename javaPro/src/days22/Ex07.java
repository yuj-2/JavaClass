package days22;

import java.text.ChoiceFormat;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 12:31:57 
 * @subject   ChoiceFormat 클래스
 * @content    ㄴ 특정 범위에 속하는 값을 문자열로 반환해 주는 형식화클래스
 *            예) 국어 점수를 입력받아서 수/우/미/양/가 출력
 */ 
public class Ex07 {

	public static void main(String[] args) {
		
		int kor = 78;
		
//		double [] limits = { 0, 60, 70, 80, 90};
//		String [] formats = {"가", "양", "미", "우", "수"};
//		ChoiceFormat cf = new ChoiceFormat(limits, formats);
				
		String newPattern = "0#가|60#양|70#미|80#우|90#수";
		ChoiceFormat cf = new ChoiceFormat(newPattern);	
		String grade = cf.format(kor);
		System.out.printf("%d점수 - %s 등급\n", kor ,  grade );
		

	} // main

} // class


