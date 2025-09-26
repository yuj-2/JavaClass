package days30;

import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 11:04:56 
 * @subject   Student 클래스 선언 -> 스트림에서 사용 예제
 * @content 
 */ 
public class Ex08 {

	public static void main(String[] args) {
		
		Student [] sArr = {
				new Student("이자바",3,300),
				new Student("김자바",1, 200),
				new Student("안자바",2, 100),
				new Student("박자바",2, 150),
				new Student("소자바", 1, 200),
				new Student("나자바", 3, 290),
				new Student("감자바", 3, 180)
		};
		
		Stream<Student> s =  Stream.of(sArr); 
		
		s
		  .sorted( 
				   Comparator
				     .comparing(Student::getBan)
				     .thenComparing(Comparator.naturalOrder())
				  )
		  .forEach(System.out::println);
		
		System.out.println("=".repeat(100));
		
		/*
		// 1. 학생수 
		s = Stream.of(sArr);
		System.out.println( "> 총 학생수: " + s.count() );
		
		// 2. 총점만을 가지는 스트림을 만들어서 출력.
		s = Stream.of(sArr);
		IntStream sTot = s.mapToInt( Student::getTotalScore );
		// sTot.forEach(System.out::println);
		// System.out.println( sTot.sum() ); // 1420
		// System.out.println( sTot.average() ); // OptionalDouble[202.85714285714286]
		///*/
		
		s = Stream.of(sArr);
		IntStream sTot = s.mapToInt( Student::getTotalScore );
		
		IntSummaryStatistics iss = sTot.summaryStatistics();
		
		System.out.println( iss.getCount() );
		System.out.println( iss.getSum() );
		System.out.println( iss.getAverage() );
		System.out.println( iss.getMax() );
		System.out.println( iss.getMin() );
		
	} // main

} // class


 