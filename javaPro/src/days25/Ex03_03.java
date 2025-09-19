package days25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 12:23:16 
 * @subject   Ex03_02.java 의 반복되는 코딩을 줄이자.. ?
 * @content 
 */ 
public class Ex03_03 {

	public static void main(String[] args) {
		// 상대 경로
		String fileName = ".\\src\\days21\\Ex01.java";

		// 0 'A'(65)  25 'Z'(90)
		HashMap<Character, Integer> hmUpper = new HashMap<>();
		for (int i = 'A'; i <= 'Z'; i++)   hmUpper.put((char) i, 0); 
		
		// 0 'a'(97)  25 'z'(122)
		HashMap<Character, Integer> hmLower = new HashMap<>();
		for (int i = 'a'; i <= 'z'; i++)   hmLower.put((char) i, 0); 
		
		// 0  '0'(48)  9  '9'(57)
		HashMap<Character, Integer> hmDigit = new HashMap<>();
		for (int i = '0'; i <= '9'; i++)   hmDigit.put((char) i, 0); 

		int one = 0;
		try ( FileReader fr = new FileReader(fileName);) {

			while (  (one = fr.read())  != -1 ) {
				if ( Character.isUpperCase(one) ) { // 대문자 
					int value = hmUpper.get((char)one);
					hmUpper.put((char) one, value+1); 
				} else if ( Character.isLowerCase(one) ) { // 소문자
					int value = hmLower.get((char)one);
					hmLower.put((char) one, value+1); 
				} else if ( Character.isDigit(one) ) { // 숫자
					int value = hmDigit.get((char)one);
					hmDigit.put((char) one, value+1); 
				}
			}
			//			        ==대문자:19==
			{
				Set<Entry<Character, Integer>>  es = hmUpper.entrySet();
				Iterator<Entry<Character, Integer>> ir = es.iterator();
				while (ir.hasNext()) {
					Entry<Character, Integer> entry = ir.next();
					char alp = entry.getKey();    // 오토 언박싱
					int  count = entry.getValue();// 
					System.out.printf("%c(%d) : %s\n", alp,  count
							, "#".repeat( count));
				}
			}
			//					==소문자:486==
			{
				Set<Entry<Character, Integer>>  es = hmLower.entrySet();
				Iterator<Entry<Character, Integer>> ir = es.iterator();
				while (ir.hasNext()) {
					Entry<Character, Integer> entry = ir.next();
					char alp = entry.getKey();    // 오토 언박싱
					int  count = entry.getValue();// 
					System.out.printf("%c(%d) : %s\n", alp,  count
							, "#".repeat( count));
				}
			}			
			//					==숫자:55==
			{
				Set<Entry<Character, Integer>>  es = hmDigit.entrySet();
				Iterator<Entry<Character, Integer>> ir = es.iterator();
				while (ir.hasNext()) {
					Entry<Character, Integer> entry = ir.next();
					char alp = entry.getKey();    // 오토 언박싱
					int  count = entry.getValue();// 
					System.out.printf("%c(%d) : %s\n", alp,  count
							, "#".repeat( count));
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}  

		System.out.println( " end ");



	} // main

} // class
