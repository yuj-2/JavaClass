package days23;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author kenik  
 * @date 2025. 9. 17. 오후 3:02:58 
 * @subject   
 * @content 
 */ 
public class Ex07 {

	public static void main(String[] args) {
		
		ArrayList plist = new ArrayList();
		
		Person p1 = new Person("홍길동", 20);
		plist.add(p1);
		Person p2 = new Person("이나영", 27);
		plist.add(p2);
		Person p3 = new Person("김수진", 25);
		plist.add(p3);
		Person p4 = new Person("장소예", 23);
		plist.add(p4);
		
		// 순서 유지 O,  중복 허용 O
		System.out.println( plist );
		
		// 이름 순으로 오름차순 정렬
		//        Comparotor c
		//plist.sort( null );
		
		plist.sort(new Comparator<Person>() { 
			@Override
			public int compare(Person o1, Person o2) {  
				return o1.name.compareTo(o2.name);
			}
		});
		
		System.out.println( plist );

	} // main

} // class

class Person implements Comparable<Person>{
	
	// 필드
	String name;
	int age;
	
	// 생성자
	public Person() {
		super(); 
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	// 메서드	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	// 이름으로 정렬
	// 나이순으로 정렬
	@Override
	public int compareTo(Person o) {		
		// return o.name.compareTo( this.name );
		return o.age  -  this.age;
	} 
	
	
}







