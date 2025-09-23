package days27;

import java.io.File;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오후 3:24:30 
 * @subject   days27 폴더 안에 upload 폴더 가 있는지 확인한 후 
 * @content   만약에 없으면 upload 폴더 생성
 */ 
public class Ex04_05 {

	public static void main(String[] args) {
		
		File parent = new File(".\\src\\days27");
		
		File uf = new File(parent, "upload");
		
		// [2] days27\\upload 폴더 있는 지 확인 후에 
		//    있으면 upload 폴더를 삭제하는 코딩.
		if ( uf.exists() ) {
			System.out.println( uf.delete() );
		}
		
		
		/* [1] 폴더 생성 코딩
		// System.out.println( uf.exists() );
		if ( !uf.exists() ) {
			// 폴더 생성 메서드
			System.out.println( uf.mkdir()  );  // days27\\upload
			//System.out.println( uf.mkdirs() );
		}
		*/

	} // main

} // class








