package days16;

import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오후 3:28:47 
 * @subject   
 * @content 
 */ 
public class Ex06 {

	public static void main(String[] args) {
		/*
		 * 1. 클래스의 어떤 필드를 static 필드로 선언할까요?
		 * 2. 클래스의 어떤 메서드를 static 메서드로 선언할까요?
		 *   1) private static double rate ->  static 메서드 
		 *   2) 
		 * */ 
		
		//Random rnd = new Random();
		//rnd.nextInt(45)+1;
		
		Math.abs(-100);
		Math.round(3.45);
		

		// 클래스명.static메서드명() 호출 가능
		// Ex06.disp();
		// disp();
		
		Ex06 obj = new Ex06();
		obj.disp();
	}
	
	
	// public static void disp() {
    public void disp() {
		System.out.println("> disp() 메서드 호출됨..");
	}

}
