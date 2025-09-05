package days15;

/**
 * @author kenik  
 * @date 2025. 9. 5. 오후 2:14:51 
 * @subject   
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {
		/*
		 * 1. 클래스 앞에 붙는 접근지정자 설명
		 * 2. (암기) 멤버(==클래스의 구성요소==필드,메서드) 앞에 붙는 접근지정자 설명
		 *   1) public - 패키지 내/외부 어디서나 접근(참조) 가능 
		 *   2) protected - default 기능 + 상속
		 *   3) default - 패키지 내부에서만 접근(참조) 가능.
		 *   4) private - 같은 클래스 내에서만 접근(참조) 가능.
		 *   
		 *  public > protected > default > private
		 * */
		
		// 출근 시간
		// 퇴근 시간
		// 외출 시간
		// 조퇴 시간
		// 등등 시간 정보( 시:분:초 ) 처리....
		
		/* [1]
		int 출근hour,출근minute, 출근second;
		int 퇴근hour,퇴근minute, 퇴근second;
		int 외출hour,외출minute, 외출second;
		int 조퇴hour,조퇴minute, 조퇴second;
		*/
		
		/*  [2]
		int [] hourArr = new int[4];
		int [] minuteArr = new int[4];
		int [] secondArr = new int[4];
		*/

		// [3]
		// int [][] time = new int[4][3];
		
		// [4]
		Time [] timeArr = new Time[4];

	} // main

} // class













