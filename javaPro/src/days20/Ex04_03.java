package days20;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오후 12:25:10 
 * @subject   
 * @content 
 */ 
public class Ex04_03 {

	public static void main(String[] args) {
		String s = "public static void main(String[] args) {";
		// s 문자열 속에   "st" 문자열 찾아서 위치(index)를 모두 출력.
//		int index s.indexOf(매개변수)
//		int index s.lastIndexOf(매개변수)		
//		boolean s.contains(매개변수)
		
		/*
		int index = s.toLowerCase().indexOf("st");
		System.out.println( index );
		
		index = s.toLowerCase().lastIndexOf("st");
		System.out.println( index );
		*/
		
		// [1] 문제
		// s 문자열 속에 대소문자 상관없이 's'를 찾아서 
		// 모든 위치값을 출력하고
		// 2번째 s를  한글 '에스'로 변경하는 코딩을 하세요. 
		String s2 = s.toLowerCase();
		String word = "s";
		int index = -1;
		int fromIndex = 0;
		
		int secondIndex = -1;
		int count = 1;
		while (  (index = s2.indexOf(word, fromIndex))!= -1) {			
			System.out.println(index);// 7
			if( count == 2 ) secondIndex = index;
			fromIndex = index + word.length();
			count++;
		} // while	
		
		System.out.println("> secondIndex: " + secondIndex);
		// replace(), replaceAll(), replaceFirst()
		System.out.println( s2.replace('s', 'X') );
		System.out.println( s2.replace("s", "에스") );
		System.out.println( s2.replaceAll("s", "에스") );
		System.out.println( s2.replaceFirst("s", "에스") );
	    
		System.out.println( s2.substring(0, secondIndex) +"에스" +s2.substring(secondIndex+1));
		
		/*
		while (true) {
			index = s2.indexOf(word, fromIndex); // -1
			if( index == -1 ) break;
			System.out.println(index);// 7
			fromIndex = index + word.length();
		}
		*/
		
		/*
		index = s2.indexOf(word, fromIndex); // -1
		System.out.println(index);// 7
		fromIndex = index + word.length();
		
		index = s2.indexOf(word, fromIndex); // -1
		System.out.println(index);// 7
        fromIndex = index + word.length();
		
		index = s2.indexOf(word, fromIndex); // -1
		System.out.println(index);// 7
        fromIndex = index + word.length();
		
		index = s2.indexOf(word, fromIndex); // -1
		System.out.println(index);// 7
		*/

	} // main

} // class






