package days26;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;

/**
 * @author kenik  
 * @date 2025. 9. 22. 오후 5:15:18 
 * @subject   18.8 기본 타입 스트림.
 * @content   기본형 8가지를 읽기/쓰기 쉽게 하도록 만든 [바이트 스트림.]
 *            DataInputStream, Data[OutputStream]
 *            
 *            Ex09.java(쓰기) Ex09_02.java(읽기) 설명
 *            Ex10.java Ex10_02.java 설명  DataInputStream, Data[OutputStream]
 */ 
public class Ex10 {

	public static void main(String[] args) {
		// 기본형- int, double, boolean 
		//        String
		String name = "서영학";
		int kor = 3, eng = 7, mat = 9;
		int tot = kor + eng + mat;
		double avg = (double)tot/3;
		boolean gender = true;

		String fileName = "student.dat"; // 파일로 저장.
		//  파일 끝에 계속 추가 true
		try ( FileOutputStream fos = new FileOutputStream(fileName, true);
				DataOutputStream dos = new DataOutputStream(fos)){
			dos.writeUTF(name);
			dos.writeInt(kor);
			dos.writeInt(mat);
			dos.writeInt(eng);
			dos.writeInt(tot);
			dos.writeDouble(avg);
			dos.writeBoolean(gender);
			
			dos.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println(" end ");
	}  // main

}
