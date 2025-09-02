package days03;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오후 4:06:33 
 * @subject   증감연산자 설명  
 * @content   단독으로 사용될 때는 전위형 == 후위형 동일
 *            전위형, 후위형의 차이점
 */ 
public class Ex08_04 {

	public static void main(String[] args) {
		
		int x = 10;
		
		/* XXX
		if (++x > 10) {
		//if (x++ > 10) {
			System.out.println("크다");
		}
		
		System.out.println("end");
		*/
		
		//System.out.printf("> x=%d \n", ++x);  // > x=11 
		//System.out.printf("> x=%d \n", x++);  // > x=10 
		
		//x++;
		//++x;
		//int y = x++;  // 후위형  > x=11, y=10
		//int y = ++x;  // 전위형  > x=11, y=11
		
		//System.out.printf("> x=%d, y=%d\n", x, y);

	} // main

} // class









