package days20;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오후 3:05:36 
 * @subject   
 * @content 
 */ 
public class Ex04_05 {

	public static void main(String[] args) {
		
		String [] urls = {
				"http://www.naver.com"
				,"www.naver.com"
				, "ftp://www.naver.com" 
				,"https://www.naver.com"
				,"http://www.sist.co.kr"
				,"http://www.iei.orkr"
				, "www"
		};
		// [문제] urls 배열에서 
		//       인터넷 주소가  kr로 끝나는 인터넷주소를 모두 출력
		for (int i = 0; i < urls.length; i++) {
			String url = urls[i];
			
			// [3] 정규현식
			// String regex = "www";  // www
			// String regex = "^www$";  // www
			// String regex = ".*www.*";  // www
			// String regex = "^www.+";  // www
			
			// String regex = ".*kr$";  // www
			String regex = ".*\\.kr$";  // www
			if (  url.matches(regex) ) System.out.printf("%s\n",  url);
			
			// [2]
			// if (  url.endsWith("kr") ) System.out.printf("%s\n",  url);
			
			/* [1] 
			if( url.substring(url.length()-2).equals("kr") ) {
				System.out.printf("%s\n",  url);
			}
			*/
		}
		 
		
		/*
		// 위의 인터넷주소 중에  ftp:// , http:// 으로 시작하는 주소를 찾고
		// X System.out.println(  "http://www.naver.com".contains("http://") );
		// boolean  startWith(String prefix)
		for (int i = 0; i < urls.length; i++) {
			String url = urls[i];
			if (  url.startsWith("http://") ) System.out.printf("%s\n",  url);
		}
		*/
		
		
		
		
		
		/* [1]
		// boolean equals()  
		// int compareTo() 문자열을 비교하는 메서드 
		System.out.println( "abc".equals("abc") ); //  true
		System.out.println( "abc".equalsIgnoreCase("abc") ); //  true
		
		System.out.println( "abc".compareTo("abc") ); //  0
		System.out.println( "abc".compareTo("Abc") ); //  32
		System.out.println( "Abc".compareTo("abc") ); //  -32
		System.out.println( "Abc".compareToIgnoreCase("abc") ); // 0
		*/
	} // main

} // class


// [과제] 회원가입
//       비밀번호 입력
//       1) 문자열 길이 8 ~ 15 사이
//       2) 알파벳 대문자 반드시 1개 이상
//       3) 알파벳 소문자 반드시 1개 이상
//       4) 특수문자 반드시 1개 이상
//       포함 
//       정규표현식 ~~