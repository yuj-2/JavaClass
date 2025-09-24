package days28;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 24. 오전 9:38:39 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {

		//	[ 테스트 1. ]
		//  부모클래스가 직렬화가 가능한 클래스이면 
		//  상속받은 자식클래스는 어떻게 될까? 

		// 파일 저장
		String name = ".\\src\\days28\\Child.ser";
		try ( FileOutputStream  fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos)	){
			
			Parent p = new Parent();
			p.name = "홍길동";
			
			Child c = new Child();
			c.name = "서영학";
			c.age  = 20;
			
			oos.writeObject(p);
			oos.writeObject(c);

			oos.flush(); // 저장 후 스트림은 비우기.
			System.out.println("p, c 객체를 직렬화해서 파일로 저장 완료!!~");
		} catch (Exception e) {
			e.printStackTrace();
		}


		System.out.println( " end ");

	} // main

} // class


/*
// [테스트 1]
class Parent implements Serializable{	
	
	private static final long serialVersionUID = -7781339316940440315L;
	
	String name;

	@Override
	public String toString() {
		return "Parent [name=" + name + "]";
	}
	
}

class Child extends Parent{	
	
	private static final long serialVersionUID = 3044447078375818902L;
	
	int age;

	@Override
	public String toString() {
		return "Child [age=" + age + ", name=" + name + "]";
	}
	
}
*/






