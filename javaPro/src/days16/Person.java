package days16;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오전 11:25:14 
 * @subject   private 필드에 접근할 수 있는 방법과
 * @content   그에 대해서 설명하세요 .. 
 */ 
public class Person {

	// 필드
	String name; // 이름
	private int age; // 나이
	private boolean gender; // 성별

	// 생성자 
	public Person(String name, int age ) {
		//this(); // 디폴트 생성자 호출
		System.out.println("> Person Constructor 2 호출됨...");
		this.name = name;
		this.age = age;
	} 
	
	public Person(String name, int age, boolean gender) {
		this(name, age); // 또 다른 생성자를 호출할 때의 this 용도
		System.out.println("> Person Constructor 3 호출됨...");
		// Constructor call must be the first statement in a constructor
		//this.name = name;
		//this.age = age;
		this.gender = gender;
	}

	public Person() {
		this("익명",0,false);
		System.out.println("> Person Default Constructor  호출됨...");
	} 

	// 메서드
	// 나이를 매개변수 만큼 증가/감소 시키는 메서드
	// p1.changeAge(25)
	public Person changeAge(int n) {
		this.age += n;
		return this; // this의 3 용도    -  리턴값
	}
	
	
	// p1.dispPerson();
	public void dispPerson() {
		System.out.printf("> name:%s, age:%d, gender:%b\n", 
				this.name, this.age, this.gender);	
	}

	// Getter, Settr
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age >= 0) {
			this.age = age;			
		}else {
			// 강제로 에러 발생
			throw new RuntimeException("> 나이는 음수값 안됩니다.");
		}
	}

	public boolean isGender() {
		return gender;
	}

	/*
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	*/

}
