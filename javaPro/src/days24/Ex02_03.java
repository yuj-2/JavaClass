package days24;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오전 9:33:01 
 * @subject   
 * @content 스택 활용 예 - 수식계산, 수식괄호검사, 웹브라우저 뒤로/앞으로 구현 등등
 *          큐   활용 예 - 최근 사용 문서, 인쇄 작업 대기 목록 등등
 */ 
public class Ex02_03 {

	public static void main(String[] args) {
		// 수식 괄호 검사
		
		if(args.length != 1) {
			System.out.println("Usage : java ExpValidCheck \"EXPRESSION\"");
			System.out.println("Example : java ExpValidCheck \"((2+3)*1)+3\"");
			System.exit(0);
		}
		
		Stack st = new Stack();
		// 수식 검사할 문자열 
		String expression = args[0];	// ((2+3)*1+3	
		System.out.println("expression:" + expression);
		
		char [] exprArr = expression.toCharArray();
		
		try {
			for (int i = 0; i < exprArr.length; i++) {
				char ch = exprArr[i];
				if ( ch == '(') {
					st.push(ch);
				}else if( ch == ')') {
					st.pop();	
				} // if
			} // for i
			
			System.out.println( st );
			
			if (st.isEmpty()) {
				System.out.println("괄호 일치한다.");
			}else {
				System.out.println("괄호 일치하지 않다.");
			}
		} catch (EmptyStackException e) {
			// 예외 처리
			System.out.println("괄호 일치하지 않다.");
		} catch (Exception e) { 
			e.printStackTrace();
		}
		
		System.out.println( " end ");
		
		

	} // main

} // class
