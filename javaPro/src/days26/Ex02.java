package days26;
 

/**
 * @author kenik  
 * @date 2025. 9. 22. 오전 10:08:23 
 * @subject   
 * @content 
 */ 
public class Ex02 {

	public static void main(String[] args) {
		// 열거 안에 있는 상수에게 특정값을 설정 -> 사용		
		Direction [] dirArr = Direction.values();
		for (Direction d : dirArr) {
			System.out.printf("> name:%s, value:%d, symbol:%s, %s \n"
					, d.name()
					, d.getValue()
					, d.getSymbol()
					, d.toString());
		}

	}

}
