package days10;

/**
 * @author kenik  
 * @date 2025. 8. 29. 오후 2:06:51 
 * @subject   
 * @content 
 */ 
public class Ex02_02 {

	public static void main(String[] args) {
		// 정수 -> 16진수로 출력
		// 16진수 : 0 1 2 3 4 5 6 7 8 9 a(10), b(11), c(12), d(13), e(14), f(15)
		int n = 31;
		// System.out.println( Integer.toBinaryString(n) ); // 11111
		// System.out.println( Integer.toOctalString(n) ); // 37
		// System.out.println( Integer.toHexString(n) ); // 1f

		String result = toHexConvert(n);
		System.out.println( result );
	} // main

	private static String toHexConvert(int n) {
		int rest;
		String hex = "";

		final char[] hexArr = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		
		while(n != 0) {
			rest = n%16;
			hex = hexArr[rest] + hex;
			
			/* [1]
			switch (rest) {
			case 10:
				hex = 'A' + hex;
				break;
			case 11:
				hex = 'B' + hex;
				break;
			case 12:
				hex = 'C' + hex;
				break;
			case 13:
				hex = 'D' + hex;
				break;
			case 14:
				hex = 'E' + hex;
				break;
			case 15:
				hex = 'F' + hex;
				break;
			default:
				hex = rest + hex;
				break;
			}
			*/
			n=n/16;
			// System.out.println(rest);
			
		}

		return String.format("0x%s", hex);
	}

} // class










