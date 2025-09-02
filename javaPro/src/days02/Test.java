package days02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//키보드로 부터 이름, 나이, 성별 입력받아서
		// 출력형식)
		// 이름은 "홍길동"이고, 나이는 24살이고, 성별은 true입니다.

public class Test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		byte age;
		boolean gender;
		
		//이름
		System.out.print("이름 : ");
		name = br.readLine();
		
		//나이
		System.out.print("나이 : ");
		age = Byte.parseByte(br.readLine());
		
		//성별
		System.out.print("성별 : ");
		gender = Boolean.parseBoolean(br.readLine());
		
		System.out.printf("이름은 \"%s\"이고, 나이는 %d살이고, 성별은 %b입니다.", name, age, gender);
	}
	

}
