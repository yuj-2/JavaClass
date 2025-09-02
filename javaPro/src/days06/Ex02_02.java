package days06;

import java.util.Scanner;

public class Ex02_02 {

	public static void main(String[] args) {
		int user;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("> user 가위(1)/바위(2)/보(3) 선택 ? ");
		
		// 회원가입
		// 비밀번호   8~15, 특수문자 1개, 숫자 1개 , 대소문자 1갱 등등
		
		// 가위, 3.14 , true, a   , 4, 0 
		// 1,2,3
		String input = scanner.next();
		// boolean input.matches(String regex)
		// \s
		// * 0 이상
		// () 그룹화
		// |
		// []
		// -
		// String regex = "(1|2|3|4|5|6|7|8|9)";
		// String regex = "[123456789]";
		String regex = "[1-3]";
		if( input.matches(regex) ) {
			user = Integer.parseInt(input);
			System.out.printf("> user=%d\n", user);
		}else {
			System.out.println("입력잘못!!");
		}
		
	    /*
	    user = scanner.nextInt();
	    
		if( 1<= user && user <=3) {
			System.out.printf("> user=%d\n", user);
		}else {
			System.out.println("입력잘못!!");
		}
		*/
		 
		
		

	}

}
