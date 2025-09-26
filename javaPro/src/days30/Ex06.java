package days30;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author kenik  
 * @date 2025. 9. 26. 오전 11:04:56 
 * @subject   Student 클래스 선언 -> 스트림에서 사용 예제
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		Stream<Student> s =  Stream.of(
									new Student("이자바",3,300),
									new Student("김자바",1, 200),
									new Student("안자바",2, 100),
									new Student("박자바",2, 150),
									new Student("소자바", 1, 200),
									new Student("나자바", 3, 290),
									new Student("감자바", 3, 180)
								);
		// 총점으로 내림차순 정렬해서 출력
//		s.sorted().forEach(System.out::println);
		
		// 1차 정렬 - 반별로 오름차순 정렬
		// 2차 정렬 - 성적(총점) 순으로 내림차순 정렬 
		
		s
		  .sorted( 
				   Comparator
				     .comparing(Student::getBan)
				     .thenComparing(Comparator.naturalOrder())
				  )
		  .forEach(System.out::println);
		

	} // main

} // class


// 비교하는 기능이 구현된 Student 클래스
class Student implements Comparable<Student>{
	
	String name;
	int ban;  
	int totalScore;
	
	Student(){}

	public Student(String name, int ban, int totalScore) { 
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", totalScore=" + totalScore + "]";
	}

	public String getName() {
		return name;
	}

	public int getBan() {
		return ban;
	}

	public int getTotalScore() {
		return totalScore;
	}

	// 기본 정렬은 총점으로 내림차순 정렬
	@Override
	public int compareTo(Student o) {		
		return  Integer.compare(o.totalScore, this.totalScore);
	} 
	
} // class

