package days27;

import java.io.File;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오후 3:39:05 
 * @subject   
 * @content 
 */ 
public class Ex04_06 {

	public static void main(String[] args) {
		// days27 폴더 
		//   ㄴ temp 
		//       ㄴ 1조
		//       ㄴ 2조
		//       ㄴ 3조
		/*
		File d1 = new File(".\\src\\days27\\temp\\1조");
		d1.mkdirs();
		File d2 = new File(".\\src\\days27\\temp\\2조");
		d2.mkdirs();
		File d3 = new File(".\\src\\days27\\temp\\3조");
		d3.mkdirs();
		*/
		
		/* [2]
		String parent = ".\\src\\days27\\temp";
		for (int i = 1; i <=3 ; i++) {
			String child = String.format("%d조", i);
			File f = new File( parent, child);
			f.mkdirs();
		}
		*/
		
		// [문제]
		String pathname = ".\\src\\days27\\temp";
		File temp = new File(pathname);
		
		// 재귀 함수 선언
		directoryDelete( temp );
		
		System.out.println( "end ");
		
		/*
		// System.out.println( d.exists() ); // true
		if( d.exists() ) {
			System.out.println(  d.delete() ); // temp 폴더 삭제
		}
		*/

	} // main

	private static void directoryDelete(File f) {
		
		while ( !f.delete() ) {
			// 하위 폴더+파일 존재
			File[] list =  f.listFiles();
			for (int i = 0; i < list.length; i++) {
				 File t = list[i];
				 if ( t.delete() ) {
					System.out.printf("%s 삭제 완료!!\n", t.getName());					
				} else {
					directoryDelete(t);
				}
			} // for i
			
		} // while
		
	}

} // class











