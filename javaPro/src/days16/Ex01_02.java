package days16;

import java.util.Arrays;

public class Ex01_02 {

	public static void main(String[] args) {
		String n = "keNik";   
		String m = "kKnie"; 
		
		char [] nArr =  n.toLowerCase().toCharArray();
		Arrays.sort( nArr  );
		n = String.valueOf(nArr); 
		
		char [] mArr =  m.toLowerCase().toCharArray();
		Arrays.sort( mArr  );
		m = String.valueOf(mArr);
		
		System.out.printf("%s과 %s 문자열은 %s\n", n, m
				, n.equals(m)?"같다":"다르다");
		 
		
	}

}
