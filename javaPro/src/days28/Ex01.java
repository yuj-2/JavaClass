package days28;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 24. 오전 7:00:19 
 * @subject   
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) {		
		/* 
		 * 수: 팀 프로젝트 시작~
		 * 목: 람다와 스트림 2시간 , 프로젝트 진행
		 * 금: 람다와 스트림 2시간 , 프로젝트 진행		 * 
		 * 월: 오라클 DBMS 
		 * 
		 * [ 직렬화 / 역직렬화 ]
		 * 1. 직렬화( Serialization )
		 *    ㄴ 객체(Object)를 입출력하기 위해서 스트림으로 만든 것.
		 * 2. 역직렬화( Deserialization )
		 *    ㄴ 스트림을 다시 객체로 만드는 것.
		 * 3. 왜? 객체를 스트림 입출력 가능한가?   
		 *    ㄴ 네트워크으로 정보를 담고 있는 클래스의 객체를 
		 *       전송/수신(입출력)할 때  객체를 직렬화/역직렬화가 필요하다.
		 * 4. 자바에서 객체를 입출력하는 바이트 스트림을 제공
		 *    ObjectInputStream
		 *    ObjectOutputStream
		 * 5. 사용자의 정보를 저장하는 UserInfo 클래스 선언
		 *    -> 객체 생성 -> 파일로 쓰기/읽기 하는 예제      
		 * */
		
		UserInfo u1 = new UserInfo("홍길동", 20, "1234");
		UserInfo u2 = new UserInfo("서영학", 35, "4321");
		
		// 파일 저장
		String name = ".\\src\\days28\\UserInfo.ser";
		try ( FileOutputStream  fos = new FileOutputStream(name);
			  ObjectOutputStream oos = new ObjectOutputStream(fos)	){
			// u1, u2 객체를 직렬화시켜서 파일에 저장하는 메서드 : writeObject()
			oos.writeObject(u1);
			oos.writeObject(u2);
			
			ArrayList<UserInfo> list = new ArrayList<UserInfo>();
			list.add(u1);
			list.add(u2);			
			oos.writeObject(list);
			
		    oos.flush(); // 저장 후 스트림은 비우기.
		    System.out.println("u1, u2 객체를 직렬화해서 파일로 저장 완료!!~");
		} catch (Exception e) {
			e.printStackTrace();
		}
				

		System.out.println( " end ");
	} // main

} // class

/*
java.io.NotSerializableException: days28.UserInfo
at java.base/java.io.ObjectOutputStream.writeObject0(ObjectOutputStream.java:1185)
at java.base/java.io.ObjectOutputStream.writeObject(ObjectOutputStream.java:349)
at javaPro/days28.Ex01.main(Ex01.java:44) 
*/





