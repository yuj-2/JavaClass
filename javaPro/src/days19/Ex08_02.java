package days19;

import java.io.IOException;
import java.util.Scanner;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오후 3:40:22 
 * @subject   국어 점수를 입력받아서 출력하는 코딩
 * @content   1) getScore() 메서드 선언 
 *                 입력 잘못했을 때  IOException 발생 X
 *                 사용자 정의한 예외클래스를 발생시키도록 코딩 수정.
 */ 
public class Ex08_02 {

	public static void main(String[] args) {
		
		int kor = 0;
		
		try {
			kor = getScore();
			System.out.println("> kor: " + kor);
		} catch (ScoreOutOfBoundException e) { 
			e.printStackTrace();
		} catch( Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(" end ");

	} // main

	private static int getScore() {
		Scanner scanner = new Scanner(System.in);
		int score = 0;
		
		System.out.print("> 점수 입력 ? ");
		String input = scanner.next();
		
		String regex = "^(\\d|[1-9]\\d|100)$";
		
		if (input.matches(regex)) {
			score = Integer.parseInt(input);
			return score;
		} else { 
			throw new ScoreOutOfBoundException(1005, "> 점수 입력 잘못!!!(0~100)");		 
		}
		
		// return score;
	}

} // class


// 사용자 정의 예외 클래스
class ScoreOutOfBoundException extends RuntimeException{ // unchecked 예외

	private static final long serialVersionUID = -8500808734962896007L; 
	
	// 예외 코드 번호
	private final int EXCEPTION_CODE;

	public int getEXCEPTION_CODE() {
		return EXCEPTION_CODE;
	}
 
	public ScoreOutOfBoundException(String message) {
		this(1001, message);
	}
	public ScoreOutOfBoundException( int exception_code, String message) {
		super(message);
		this.EXCEPTION_CODE = exception_code;
	} 
	
}








