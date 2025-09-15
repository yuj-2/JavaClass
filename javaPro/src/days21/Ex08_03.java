package days21;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 9. 15. 오후 2:11:32 
 * @subject 가변 배열을 사용해서 코딩 수정 + 추가.  
 * @content 
 */ 
public class Ex08_03 {

	public static void main(String[] args) {
		// 상대 경로
		String fileName = ".\\src\\days21\\Ex01.java";
 
		int [][] counts = new int[3][];
		counts[0] = new int[26]; // 대문자
		counts[1] = new int[26]; // 소문자
		counts[2] = new int[10]; // 숫자

		int one = 0;
		try ( FileReader fr = new FileReader(fileName);) {

			while (  (one = fr.read())  != -1 ) {
				if ( Character.isUpperCase(one) ) { // 대문자
					int index = one - 'A';
					counts[0][index]++;
				} else if ( Character.isLowerCase(one) ) { // 소문자
					int index = one - 'a';
					counts[1][index]++;
				} else if ( Character.isDigit(one) ) { // 숫자
					int index = one - '0';
					counts[2][index]++;
				}
			}
			
			// System.out.println( Arrays.toString(counts) );
			for (int i = 0; i < counts.length; i++) {
				
				// counts[i] -> IntStream 변경
				int totalCount = IntStream.of( counts[i] ).sum(); 
				System.out.printf("== %s: %d ==\n", i==0?"대문자":(i==1)?"소문자":"숫자"
						,  totalCount );
				for (int j = 0; j < counts[i].length; j++) { 
					System.out.printf("%c(%d) : %s\n", j + (i==0?'A':(i==1)?'a':'0')
							,  counts[i][j]
							, "#".repeat( counts[i][j] ));				
				} // for j
			}  // for i
			

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}  

		System.out.println( " end ");

	} // main

} // class



/*
// Ex08_02 코딩을 "가변 배열"을 사용해서 수정.
// 1반 30명 학생 이름
// 3반 30명 학생 이름
//String [] names1 = new String[30]; 
//String [] names2 = new String[30]; 
//String [] names3 = new String[30];

//String [] names123 = new String[90]; 

//	String [][] names = new String[3][30];

// 1반 25명 2반 20명 3반 29명 
String [][] names = new String[3][];
names[0] = new String[25];
names[1] = new String[20];
names[2] = new String[29];
 */








