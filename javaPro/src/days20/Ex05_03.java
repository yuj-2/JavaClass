package days20;

/**
 * @author kenik  
 * @date 2025. 9. 12. 오후 4:43:45 
 * @subject   
 * @content 
 */ 
public class Ex05_03 {

	public static void main(String[] args) {
		
		// testString();
		 testStringBuilder();

	} // main

	// >> 처리 시간 :  15141300ns
	private static void testStringBuilder() { 
		long start = System.nanoTime();
		// String s = "a";
		StringBuffer s = new StringBuffer("a");		
		for (int i = 0; i < 2000000; i++) {
			// s += "a";
			s.append("a");
		} // 
		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
	}

	// >> 처리 시간 :  313230115100ns
	// 313.???초
	private static void testString() { 
		long start = System.nanoTime();
		// System.currentTimeMillis();
		
		String s = "a";
		for (int i = 0; i < 2000000; i++) {
			s += "a";
		} // 
		
		long end = System.nanoTime();
		System.out.println(">> 처리 시간 :  " + (end-start)+"ns");
	}

} // class









