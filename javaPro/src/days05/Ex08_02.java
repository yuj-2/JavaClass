package days05;

/**
 * @author kenik  
 * @date 2025. 8. 22. 오후 4:13:18 
 * @subject   
 * @content 
 */ 
public class Ex08_02 {

	public static void main(String[] args) {
		int i=0, sum=0;		
		while (++i<=10) {
			if( i%2==0 )   continue; 
			System.out.printf("%d+",i);
			sum += i; 
		}		
		System.out.printf("\b=%d", sum);
	} // main

} // class







