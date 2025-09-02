package days06;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @author kenik  
 * @date 2025. 8. 25. 오후 4:46:53 
 * @subject   
 * @content 
 */ 
public class Ex05_04 {

	public static void main(String[] args) {
		
		// 람다와 스트림.
		//int sum = IntStream.rangeClosed(2, 5).sum();
		//System.out.println( sum );
		
		Random rnd = new Random();
		/*
		int [] m = IntStream
					  .generate(()-> rnd.nextInt(100)+1)
					  .limit(20)
					  .toArray();
		*/
		OptionalInt  maxOptionInt =  IntStream
				  .generate(()-> rnd.nextInt(100)+1)
				  .limit(20)
				  .max();
		
		System.out.println( maxOptionInt.getAsInt() );
	} // main

} // class









