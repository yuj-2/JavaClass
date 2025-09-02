package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11 {

	public static void main(String[] args) throws IOException {
		// 키보드로 부터 이름, 나이, 성별 입력받아서
		// 출력형식)
		// 이름은 "홍길동"이고, 나이는 24살이고, 성별은 true입니다.
		String name;
		byte age;
		boolean gender;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1 이름
		System.out.print("1. 이름 입력 ? ");
		name = br.readLine();
		// 2 나이
		System.out.print("2. 나이 입력 ? ");
		// Type mismatch: cannot convert from String to byte
		// X age = (byte)br.readLine();
		// String "24" -> byte 24 형변환
		age = Byte.parseByte( br.readLine() )    ;
		// 3 성별 String->boolean
		System.out.print("3. 성별 입력 ? ");
		gender = Boolean.parseBoolean( br.readLine() )    ;
		
		// System.out.println("이름은 \""+name+"\"이고, 나이는 " + age +"살이고, 성별은 "+gender+"입니다.");
		// 원하는 출력형식으로 출력할 때는 println() X, printf() 메서드를 사용하자
		//                                             format 형식
		System.out.printf("이름은 \"%s\"이고, 나이는 %d살이고, 성별은 %3$b(%3$B)입니다."
				, name, age, gender);

	}

}
