package days25;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * @author kenik  
 * @date 2025. 9. 19. 오전 10:08:25 
 * @subject   1차_팀편성.txt 파일을 읽어와서
 * @content   컬렉션 클래스를 사용하여 
 *            아래와 같이 출력  void dispTeam(컬렉션 객체)
 *              출력형식)
[1조]
	A. 권태정
	B. 김도훈
	C. 김민선
	D. 김승효

[2조]
	A. 김유미
	B. 김현수
	C. 박지웅
	D. 변상호
	E. 서재웅

[3조]
	A. 서주원
	B. 안우혁
	C. 안준호
	D. 양재원
	E. 이정인
	
	HashMap<String, ArrayList<String>> 
	key         value
	1조:       ArrayList(김다원/오승찬/이나영/김수진/장소예)
	2조:       ArrayList(김호연/김유진/김민배/문종범)
    3조:       ArrayList(오승종/최현아/류지호/이지혜/지영주)

 */ 
public class Ex02 {

	public static void main(String[] args) {
		// 업캐스팅
		Map<String, ArrayList<String>> hmap = new LinkedHashMap<>(); 
		//Map<String, ArrayList<String>> hmap = new HashMap<>();
		
		String fileName = ".\\src\\days25\\1차_팀편성.txt";
		try ( FileReader fr = new FileReader(fileName );
			  BufferedReader br = new BufferedReader(fr); ){
			
			String line = null;
			String key = null;
			ArrayList<String> tlist = null; 
			while ( ( line = br.readLine() ) != null) {
				//System.out.println( line );
				// key  ArrayList
				// 1조:김다원/오승찬/이나영/김수진/장소예
				String regex = "[:/]";
				String [] tInfo = line.split(regex);
				//System.out.println( Arrays.toString( tInfo ) );
				key = tInfo[0];
				tlist = new ArrayList<>(); // value
				for (int i = 1; i < tInfo.length ; i++) {
					tlist.add( tInfo[i] );
				}
				hmap.put(key, tlist); // 엔트리 추가
			} // while 
			
			dispTemp(hmap);
		} catch (Exception e) {
			e.printStackTrace();
		} // try
		
		System.out.println("end");

	} // main

	                            // 매개변수 다형성
	private static void dispTemp(Map<String, ArrayList<String>> hmap) {

      Set<Entry<String, ArrayList<String>>> es = hmap.entrySet();
      Iterator<Entry<String, ArrayList<String>>> ir = es.iterator();
      
      while (ir.hasNext()) {
		Entry<String, ArrayList<String>> entry = ir.next();
		 String key = entry.getKey();
		 System.out.printf("[%s]\n", key);
		 ArrayList<String> tlist = entry.getValue();
		 Iterator<String> ir2 =  tlist.iterator();
		 char no = 'A';
		 while (ir2.hasNext()) {
			String name = ir2.next();
			// A. 김유미
			System.out.printf("\t%c. %s\n", no++, name );
		}
		 
	  } // while
     
	}

} // class








