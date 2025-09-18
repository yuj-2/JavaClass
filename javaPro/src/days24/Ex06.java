package days24;

import java.util.HashSet;

/**
 * @author kenik  
 * @date 2025. 9. 18. 오후 2:14:02 
 * @subject  C -> S -> HashSet 컬렉션 클래스 
 * @content             - 순서 유지 X, 중복 허용 X
 *          ( 문제점 파악-> 해결 )
 *          Student 클래스 선언 -> 학생객체를 HashSet 저장.
 *          학번이 똑같은 홍길동이 2번 저장... (중복 허용 O) 
 *          ==> 해결
 *          Object.hashCode()   객체를 구별하기 위한 고유한 값  오버라이딩 + 학번
 *          equals()            객체가 같은지 체크할 때 학번을 사용하도록 오버라이딩.
 */ 
public class Ex06 {

	public static void main(String[] args) {
		
		HashSet<Student> hs = new HashSet<>();
		
		hs.add(new Student("202501001", "홍길동", 25));
		hs.add(new Student("202501002", "이나영", 23));
		hs.add(new Student("202501003", "김수진", 23));
		hs.add(new Student("202501004", "장소예", 23));
		hs.add(new Student("202501001", "홍길동", 25));
		
		System.out.println( hs );

	} // main

} // class

class Student{
	
	// 필드
	String name;
	int age;
	String no; // 학번   202501001
	
	// 생성자
	public Student() {
		super(); 
	}

	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	} 

	public Student(String no, String name, int age ) {
		super();
		this.name = name;
		this.age = age;
		this.no = no;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", no=" + no + "]\n";
	}

	// 학생 객체를 hashset 저장할 때 중복여부를 학번을 사용해서 체크
	@Override
	public int hashCode() { 
		return this.no.hashCode();
	}

	@Override
	public boolean equals(Object obj) { 
		
		if ( obj instanceof Student && obj != null ) {
			// Objedt obj => 다운캐스팅
			Student s = (Student) obj;
			return this.no.equals(s.no);
		}
		
		return false;
	}
	
	

 
	
}






