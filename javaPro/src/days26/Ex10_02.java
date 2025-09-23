package days26;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class Ex10_02 {

	public static void main(String[] args) { 
		String name ;
		int kor , eng , mat ;
		int tot;
		double avg ;
		boolean gender ;

		String fileName = "student.dat"; // 파일로 저장.
		//  파일 끝에 계속 추가 true
		try ( 
				FileInputStream fis = new FileInputStream(fileName);
				DataInputStream dis = new DataInputStream(fis)){

			while (dis.available() > 0) {
				name = dis.readUTF();
				kor = dis.readInt();
				eng = dis.readInt();
				mat = dis.readInt();
				tot = dis.readInt();
				avg = dis.readDouble();
				gender = dis.readBoolean();
				System.out.printf("%s,%d,%d,%d,%d,%f,%b\n"
						, name, kor, eng, mat, tot, avg, gender);
			}//while
		}catch (Exception e) {
			e.printStackTrace();
		} // try

		System.out.println(" end ");
	}  // main

}
