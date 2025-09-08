package days16;

/**
 * @author kenik  
 * @date 2025. 9. 8. 오후 2:01:45 
 * @subject   
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) {
		
		Calc calc = new Calc();
		// calc.btnExec을 클릭하면 계산(실행)
		calc.btnExec.btn_click();
		

	} // main

} // class

// 계산기 클래스 선언
class Calc{
	
	// Button btnPlus; // +  24개의 버튼
	// Button [] btns = null;
	
	Button btnExec = null;  // 실행 버튼
	
	// 디폴트 생성자 - 필드 초기화
	public Calc() {
		init();
	}

	// 클래스의 필드 초기화 코딩
	private void init() {
		// this 1 용도 - 멤버를 가리킬 때의 this
		//                                  this 3 용도
		//                                  this == 현재 계산기 인스턴스
		this.btnExec = new Button("[ = ]" , this);
	}
	
	public void execDisp(String result) {
		System.out.printf("[화면결과 출력] %s\n", result);
	}
	
}

// 버튼 클래스 선언
class Button{
	
	String text; 
	Calc calc;
	
	public Button() {}
	public Button(String text) {
		this.text = text;
	}
	public Button(String text, Calc calc) {
		this(text); // this 2번째 용도
		this.calc = calc; // this 1번째 용도
	}
	 
	// 버튼을 클릭 이벤트 발생할 때 호출되는 메서드 ( 이벤트 핸들러 )
	public void btn_click() {
		String result = "3 + 5 = 8";
		// 이 버튼이 포함된 계산기의 화면에 계산 결과를 출력..
		// "실행된 현재 계산기"의 execDisp(result) 메서드를 호출.
		this.calc.execDisp(result);
	}
	
}






