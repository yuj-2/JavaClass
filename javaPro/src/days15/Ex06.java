package days15;

/**
 * @author kenik  
 * @date 2025. 9. 5. 오후 4:17:59 
 * @subject   생성자 ( Constructor ) 
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * [생성자(Constructor)]  (암기)
		 * 1. 역할 : 객체 생성 동시에 필드를 초기화 .
		 * 2. 선언 ?
		 *          반드시 클래스명으로 생성자함수의 이름으로 설정
		 *          리턴자료형 X
		 * 3. 호출 X,   객체를 생성할 때 자동으로 호출된다.
		 * 4. 매개변수 한 개도 없는 생성자를 "디폴트 생성자" 라고 부른다.   
		 * 5. 생성자도 오버로딩이 가능하다. 
		 * 6. 생성자는 상속되지 않는다.
		 * 7. 생성자도 일종의 메소드 이다.  
		 * 8. 생성자를 1개도 선언을 하지 않으면 컴파일러가 컴파일 할 때 
		 *   디폴트 생성자를 자동으로 생성해서 추가한다. 
		 * */
		
		/*
		// 1+
		Point p1 = new Point();
		// 2+ 필드 x, y 초기화
		p1.x = 10;
		p1.y = 20;
		*/
		
		/*
		Point p1 = new Point();
		p1.dispPoint();
				
		Point p2 = new Point(10);
		p2.dispPoint();
		*/
		
		// The constructor Point(int, int) is undefined
		Point p3 = new Point(10, 20);
		p3.dispPoint();

	}

}
