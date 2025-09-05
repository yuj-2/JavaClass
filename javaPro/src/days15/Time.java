package days15;

public class Time {
	
	// 필드
	public int hour;
	protected  int minute;
	int second;
	private int millisecond;
	//int nano;
	
	// 생성자 추가.  
	public Time(int hour, int minute, int second) {		
		System.out.println("> Time Constructor 3 호출됨...");		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}  
	
	public Time() {
		System.out.println("> Time Default Constructor  호출됨...");	
	}

	// 메서드
	public void disp() {
		millisecond = 10;
	}
	

}
