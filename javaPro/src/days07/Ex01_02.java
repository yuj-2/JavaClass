package days07;

import java.util.Random;

/**
 * @author kenik  
 * @date 2025. 8. 26. 오전 10:15:30 
 * @subject   
 * @content 
 */ 
public class Ex01_02 {

	public static void main(String[] args) {
		
		new Random()
			.ints(1, 46)
			.distinct()
			.limit(6)
			.forEach(System.out::println);

	} // main

} // class



















