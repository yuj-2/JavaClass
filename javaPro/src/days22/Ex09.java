package days22;

/**
 * @author kenik  
 * @date 2025. 9. 16. 오후 3:06:36 
 * @subject   
 * @content 
 */ 
public class Ex09 {

	public static void main(String[] args) {
		/*
		 * Date
		 *   setYear(), getYear()
		 *   setMonth(), getMonth();
		 *   setXXX(), getXXX()
		 *   :
		 * Calendar
		 *   c.get( Calendar.XXX 상수 )
		 *   c.set( Calendar.XXX, 값 )
		 *   개강일.add( Calendar.DATE, 100 )    개강일로 부터 100일 기념일 언제냐?
		 *   :
		 *   equals() 날짜 , before(), after() 등등
		 *     
		 * 형식화 클래스 - DF, SDF, CF, MF : format()/parse() 
		 * [ jdk 1.8 java.time 패키지 및 하위 패키지 ]
		 *            ㄴ 날짜,시간  클래스 
		 *            
		 * 1. java.time 패키지 
		 *    ㄴ 하위 패키지
		 *    ㄴ
		 *    ㄴ
		 *    ㄴ  
		 *    
		 * 2. j.t 패키지 핵심 클래스      
		 *    1) LocalDate 클래스 - 날짜만 다루는 클래스
		 *    2) LocalTime 클래스 - 시간만 다루는 클래스
		 *    3) LocalDateTime 클래스 - 날짜 + 시간 을 다루는 클래스
		 *    4) ZonedDateTime 클래스 - 시간대 + 날짜 + 시간을 다루는 클래스
		 *      => 모두 Temporal, TemporalAccessor, TemporalAdjuster
		 *              시간의
		 *      인터페이스들을 구현한 클래스이다.     
		 * 
		 * 3. 날짜와 날짜 사이의 간격 : Period 클래스
		 *    시간과 시간 사이의 간격 : Duration 클래스      
		 *    => TemporalAmout 인터페이스를 구현하고 있다. 
		 *    
		 * 4. 날짜,시간 클래스 객체를 생성 : new 연산자 X
		 *   ㄴ now(), of() 메서드를 사용해서 객체를 생성.   
		 *   
		 * 5. 날짜정보, 시간 정보를 얻어올 때   
		 *    getXXX()
		 *    get( field )
		 *    
		 *    plus()/minus()
		 *    with()
		 *    등등
		 *    
		 *    시간의   단위
		 * 6. TemporalUnit 인터페이스
		 *     ㄴ 날짜,시간의 단위 정의해 놓은 인터페이스 
		 *     ㄴ 이 인터페이스를 구현한 클래스가 ChronoUnit 클래스
		 *     
		 * 7. TemporalField 인터페이스    
		 *     ㄴ 날짜,시간의 필드를 정의해 놓은 인터페이스
		 *     ㄴ 이 인터페이스를 구현한 클래스가 ChronoField 클래스.
		 * */

	}

}
