package days16;

// 저축과 관련된 클래스
public class Save {

	// 필드 
	// 1) 인스턴스 변수
	private String name; // 예금주
	private int money;   // 예금액
	
	// 2) 정적 필드, static 필드, 클래스 변수, 공유(shared) 변수
	private static double rate = 0.04;  // 이자율
	// 가입일 등등

	// 생성자
	// 디폴트 생성자
	public Save() {
		// super(); 
	}
	// 3개 생성자
	public Save(String name, int money, double rate) {
		// super();
		this.name = name;
		this.money = money;
		this.rate = rate;
	}
	
	// 메서드
	public void printSave() {
		System.out.printf("> 예금주:%s, 예금액:%d, 이자율:%.2f\n"
				, this.name, this.money, this.rate);
	}
	
	// Getter, Setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	// 정적 메서드
	public static double getRate() {
		return rate;
	}
	public static void setRate(double rate) {
		Save.rate = rate;
	}
	
}
