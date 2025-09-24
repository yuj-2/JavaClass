package days28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 24. 오전 9:27:02 
 * @subject   
 * @content 
 */ 
public class Ex01_02 {

	public static void main(String[] args) {
		
		UserInfo u1 = null;
		UserInfo u2 = null;

		// 파일 저장
		String name = ".\\src\\days28\\UserInfo.ser";
		
		try ( FileInputStream  fis = new FileInputStream(name);
			  ObjectInputStream ois = new ObjectInputStream(fis)	){
			
			u1 = (UserInfo) ois.readObject(); // Object->UserInfo 다운캐스팅
			u2 = (UserInfo) ois.readObject(); // Object->UserInfo 다운캐스팅
			
			System.out.println( u1 );
			System.out.println( u2 );
			
			ArrayList<UserInfo> list = (ArrayList<UserInfo>) ois.readObject();
			System.out.println( "🤩🤩🤩 " +  list );
			
		} catch (Exception e) {
			e.printStackTrace();
		}


		System.out.println( " end ");

	} // main

} // class









