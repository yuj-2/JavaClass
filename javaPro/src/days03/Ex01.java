package days03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오전 8:11:10 
 * @subject   
 * @content 
 */ 
public class Ex01 {

	public static void main(String[] args) throws IOException {
		
		// 변수 선언
		/*
		String _name;
		String $name;
		String 1name;
		String n_$ame1;		
		String int;
		
		String first_name;
		String firstName;
		*/
		
		
		String name;
		
		// Name cannot be resolved to a variable
		//System.out.println(Name);
		
		/*
		byte kor;
		byte eng;
		byte mat;
		*/
		
		// byte kor=0, eng=0, mat=0;
		byte kor, eng, mat;
		// ←←←←←←←←←←
		kor=eng=mat=0;
		// →→→→→→→
		// 3+5+4+2
		short tot = 0;
		double avg = 0;// 자동형변환   int -> double
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 1. 이름  Alt + 방향키
		System.out.print("  > 이름 입력: ");
		name = br.readLine();
		// 2. 국어
		System.out.print("  > 국어 입력: ");
		// Type mismatch: cannot convert from String to byte
		kor = Byte.parseByte( br.readLine() ); // "89" -> 89 형변환
		// 3. 영어
		System.out.print("  > 영어 입력: ");
		eng = Byte.parseByte( br.readLine() );
		// 4. 수학  Alt + Shift + A
		System.out.print("  > 수학 입력: ");
		mat = Byte.parseByte( br.readLine() ); 
		
		// 5. 총점,평균 계산
		// Type mismatch: cannot convert from int to short
		tot = (short)(kor + eng + mat);
		avg = (double)tot / 3; // 2.333333333333333
		// 6. 출력  Ctrl + F
		System.out.printf("이름: \"%s\"\n"
				+ "  국어: %d\n"
				+ "  영어: %d\n"
				+ "  수학: %d\n"
				+ "  총점: %d\n"
				+ "  평균: %.2f", name, kor, eng, mat, tot, avg);
		 

	}// main

}// class


/*
[ 자바에서 식별자(identifier)를 명명할 때 지켜야 하는 기본 규칙]
문자 시작
식별자는 문자(A-Z, a-z), 달러 기호($), 밑줄(_)로 시작해야 합니다.
숫자(0-9)로 시작할 수 없습니다.
문자 조합
첫 글자 이후에는 문자, 숫자, 달러 기호, 밑줄을 사용할 수 있습니다.
예약어 금지
자바 예약어(예: class, int, for 등)는 식별자로 사용할 수 없습니다.
대소문자 구분
자바 식별자는 대소문자를 구분합니다. 예를 들어 myVar와 myvar는 다른 식별자입니다.
공백 및 특수문자 금지
식별자에는 공백이나 특수문자(@, #, % 등)는 사용할 수 없습니다.
길이 제한 없음
길이에 제한은 없지만 너무 길면 가독성이 떨어질 수 있습니다.

예시
올바른 식별자: myVar, _count, $value, num123
잘못된 식별자: 123num (숫자로 시작), my-var (하이픈 포함), class (예약어)
*/

/*
Quick Search  에서
[                ] in: [         ] 
입력하는 곳이 두군데 인데 사용법 설명해줘
ChatGPT의 말:

이클립스에서 **Quick Search (Ctrl + H)**를 실행하면 나오는 검색 대화 상자에는 보통 다음과 같은 두 개의 입력란이 있습니다:

🔍 Quick Search 입력란 설명
[   Search string 입력란   ]   in: [   검색 대상 설정 드롭다운   ]

1. Search string ([ ] 왼쪽 칸)

무엇을 찾을지 입력하는 곳입니다.

키워드, 메서드 이름, 클래스 이름, 심볼 등을 입력합니다.

와일드카드 (*, ?) 또는 정규식 검색도 가능 (옵션 선택 시)

예시:

get* → getName, getValue, getData 등

User? → Users, User1, UserA 등

*.java → Java 파일명 검색

2. in: ([ ] 오른쪽 드롭다운)

어디에서 검색할지 설정하는 곳입니다.

보통 아래와 같은 항목 중 선택할 수 있습니다:

항목	설명
Workspace	전체 워크스페이스에서 검색
Selected resources	현재 선택한 파일/폴더/프로젝트만 검색
Enclosing projects	현재 열려 있는 프로젝트들에서 검색
Working set	사용자가 지정한 파일 집합에서만 검색
예시:

get* in: Workspace → 전체 프로젝트 내에서 get으로 시작하는 항목 검색

UserService in: Selected resources → 현재 선택한 폴더/파일 안에서만 검색

💡 예시 전체 시나리오
Search string:   getUser*
in:              Workspace


→ 전체 워크스페이스에서 getUser로 시작하는 이름(메서드, 클래스, 변수 등)을 검색

📌 추가 팁

아래 쪽 옵션에서:

Case sensitive: 대소문자 구분

Regular expression: 정규 표현식 사용

File name patterns: 특정 확장자 제한 (예: *.java, *.xml)

필요하다면 Java Search 탭, File Search 탭의 차이도 설명해 드릴 수 있어요.
 * */


