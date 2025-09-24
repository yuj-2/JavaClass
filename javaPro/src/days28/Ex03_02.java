package days28;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * @author kenik  
 * @date 2025. 9. 24. 오전 9:38:57 
 * @subject   
 * @content 
 */ 
public class Ex03_02 {

	public static void main(String[] args) {
		
		Child c = null;

		// 파일 저장
		String name = ".\\src\\days28\\Child.ser";

		try ( FileInputStream  fis = new FileInputStream(name);
				ObjectInputStream ois = new ObjectInputStream(fis)	){
			
			c = (Child) ois.readObject();
			
			// Child [age=20, name=null]
			System.out.println( c );
 
		} catch (Exception e) {
			e.printStackTrace();
		}


		System.out.println( " end ");

	} // main

} // class
