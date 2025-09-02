package days03;

/**
 * @author kenik  
 * @date 2025. 8. 20. 오후 3:40:43 
 * @subject   증감연산자 p81
 * @content    ++   --
 */ 
public class Ex08_03 {

	public static void main(String[] args) {
		
		int i = 20;
		
		// i 변수의 값을 1증가.
		// 1)  i = i+1;
		i += 1; // 복합대입연산자
		
		// this.txtbox.text = this.txtbox.text + "안녕";
		// this.txtbox.text += "안녕";
		
		// 2)  i++;  후위형
		// 3)  ++i;  전위형
		
		// i 변수의 값을 1감소.
		// i = i-1;
		i -= 1;
		// i--;
		
		// 예) i =  i * 5;      i*=5;
		//    i = i/5;          i/=5;
		
		// i 변수의 값을 x증가/x감소.
		// i = i+x;
		// i = i-x;
		
		System.out.printf("> i=%d\n", i);
		
		 
	}//main

}//class









