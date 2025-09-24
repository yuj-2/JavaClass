package days28;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author kenik  
 * @date 2025. 9. 24. 오전 9:38:39 
 * @subject   
 * @content 
 */ 
public class Ex03 {

	public static void main(String[] args) {

		//	[ 테스트 2. ]
		//  부모클래스는  직렬화가 가능하지 않은 클래스이고 
		//  상속받은 자식클래스는 직렬화가 가능한 클래스 일 경우 ? 

		// 파일 저장
		String name = ".\\src\\days28\\Child.ser";
		try ( FileOutputStream  fos = new FileOutputStream(name);
				ObjectOutputStream oos = new ObjectOutputStream(fos)	){

			// Parent p 는 직렬화 X
			//			Parent p = new Parent();
			//			p.name = "홍길동";

			Child c = new Child();
			c.name = "서영학";
			c.age  = 20;

			//			oos.writeObject(p);
			oos.writeObject(c);

			oos.flush(); // 저장 후 스트림은 비우기.
			System.out.println("c 객체를 직렬화해서 파일로 저장 완료!!~");
		} catch (Exception e) {
			e.printStackTrace();
		}


		System.out.println( " end ");

	} // main

} // class


// [테스트 2]
class Parent{	

	String name;  // 필드

	@Override
	public String toString() {
		return "Parent [name=" + name + "]";
	}

}

// 우리가 직접 부모클래스 Parent의 필드 name를 직렬화 대상에 추가 
class Child extends Parent  implements Serializable{	

	private static final long serialVersionUID = 3044447078375818902L;

	int age;

	@Override
	public String toString() {
		return "Child [age=" + age + ", name=" + name + "]";
	}

	// 개발자 직접 직렬화 대상에 추가(쓰기)
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.defaultWriteObject(); // 직렬화 age
	}
	// 직접 직렬화 대상에 추가(읽기)
	private void readObject(ObjectInputStream in) throws IOException
	, ClassNotFoundException {
		name = in.readUTF();
		in.defaultReadObject();
	}

}







