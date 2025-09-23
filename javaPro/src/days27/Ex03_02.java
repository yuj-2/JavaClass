package days27;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @author kenik  
 * @date 2025. 9. 23. 오전 11:45:23 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		// 1 차원 배열 -> 2 차원 배열 초기화 수정.
		int [][] score = {
				// 번호, 국어, 영어, 수학
				{ 1, 100, 90, 90 },
				{ 2, 70 , 90,100 },
				{ 3, 100,100,100 },
				{ 4, 70 , 60, 80 },
				{ 5, 70 , 90,100 }
		};
		
		String name = "score.dat";
		String mode = "rw"; // 읽기, 쓰기
		
		try ( RandomAccessFile raf = new RandomAccessFile(name, mode) ){
			
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < score[i].length; j++) {
					long fp = raf.getFilePointer();
					System.out.printf("> 현재 FP: %d - [%d]\n"
							, fp, score[i][j]);
					raf.writeInt(score[i][j]); // 파일 쓰기
				} // for j
			} // for i
						
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		일시정지();
		
		// [문제1] score.dat파일을 RandomAccessFile 클래스로 읽어와서
		//        모든 학생의 번호, 국어, 영어, 수학, 총점, 평균 정보를 출력
		int no, kor, eng, mat;
		int tot;
		double avg;
		
        try ( RandomAccessFile raf = new RandomAccessFile(name, mode) ){
			// fp = 0      
        	// while (raf.getFilePointer() < raf.length()) {
        	while(true) {
	        	no = raf.readInt();
	        	kor = raf.readInt();
	        	eng = raf.readInt();
	        	mat = raf.readInt();
	        	
	        	tot = kor + eng + mat;
	        	avg = (double)tot/3;
	        	
	        	System.out.printf(
						"번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
						no, kor, eng, mat, tot, avg);			
        	}
		} catch (EOFException e) {		
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		일시정지();
		
		// [문제2]
		// 3번 학생의 수학점수(100)을 20점으로 수정하는 코딩
		try ( RandomAccessFile raf = new RandomAccessFile(name, mode) ){
			// > 현재 FP: 44 - [100] -> 20 수정
			long pos = (4+4+4+4)*2 + (4+4+4) ; // 44
			raf.seek(pos);
			raf.writeInt(20);
		} catch (EOFException e) {		
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		일시정지();
		
		// [문제3]
		// 3번 학생의 번/국/영/수/총/평 을 출력해서 확인하는 코딩.
		try ( RandomAccessFile raf = new RandomAccessFile(name, mode) ){
			long pos = (4+4+4+4)*2  ;  
			raf.seek(pos); 
			
			no = raf.readInt();
        	kor = raf.readInt();
        	eng = raf.readInt();
        	mat = raf.readInt();
        	
        	tot = kor + eng + mat;
        	avg = (double)tot/3;
        	
        	System.out.printf(
					"번호:%d, 국어:%d, 영어:%d, 수학:%d, 총점:%d, 평균:%.2f\n", 
					no, kor, eng, mat, tot, avg);	
		} catch (EOFException e) {		
		} catch (Exception e) {
			e.printStackTrace();
		}
 
		일시정지();

	} // main

	private static void 일시정지() {
		System.out.println("> 엔터 치면 진행한다. ");
		try {
			System.in.read();
			System.in.skip(System.in.available()); // 13, 10 제거
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

} // class
