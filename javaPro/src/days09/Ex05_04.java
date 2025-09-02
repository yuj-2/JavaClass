package days09;

/**
 * @author kenik  
 * @date 2025. 8. 28. 오후 4:19:06 
 * @subject   
 * @content 
 */ 
public class Ex05_04 {

	public static void main(String[] args) {
		// 누승==거듭제곱==멱    2(밑)^3(지수)=2*2*2
		// power ==               pow
		// System.out.println(  Math.pow(2, 3)   );
		
		// double result = pow(2,  3);
		double result = recursivePow(2,  3);
		System.out.println(result);
		
	} // main

	private static double recursivePow(double b, double e) {
		
		return 0;
	}

	private static double pow(double b, double p) {  // b==밑, p==지수
		double result = 1;
		double e = p; // -3
		
		// p = p>0?p:-1*p;
		p = Math.abs(p);
		for (int i = 1; i <= p ; i++) {
			result *= b;
		}
		return  e > 0 ? result : 1/result;
	}

} // class








