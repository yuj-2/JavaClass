package days25;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오후 12:03:11 
 * @subject   파일
 * @content   A(10) ###########
 *            days21.Ex08.java
 */ 
public class Ex03 {

	public static void main(String[] args) {

		// 상대 경로
		String fileName = ".\\src\\days21\\Ex01.java";

		HashMap<Character, Integer> hmap = new HashMap<>();
		for (int i = 'A'; i <= 'Z'; i++) {
			hmap.put((char) i, 0);
		}
				
		int one = 0;
		try ( FileReader fr = new FileReader(fileName);) {

			while (  (one = fr.read())  != -1 ) {
				one = Character.toUpperCase(one);				
				if ( Character.isUpperCase(one) ) {					
					int value = hmap.get((char)one);
					hmap.put((char) one, value+1); 
				}
			}
			
			// 
			Set<Entry<Character, Integer>>  es = hmap.entrySet();
			Iterator<Entry<Character, Integer>> ir = es.iterator();
			while (ir.hasNext()) {
				Entry<Character, Integer> entry = ir.next();
				char alp = entry.getKey();    // 오토 언박싱
				int  count = entry.getValue();// 
				System.out.printf("%c(%d) : %s\n", alp,  count
						, "#".repeat( count));
			}
			
			/*
			// System.out.println( Arrays.toString(counts) );
			for (int i = 0; i < counts.length; i++) { 
				System.out.printf("%c(%d) : %s\n", i + 'A',  counts[i]
						, "#".repeat( counts[i]));				
			}
			*/

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}  

		System.out.println( " end ");



	} // main

} // class
