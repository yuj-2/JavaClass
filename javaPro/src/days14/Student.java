package days14;

// 속성+기능 구현된  학생 클래스 선언
public class Student {
	
	// 필드
	public int no;
	public String name;
	public int kor, eng, mat, tot, rank, wrank;
	public double avg;
	
	// 메서드 
	public String getInfo() {
		return String.format("[%d]\t%s\t%d\t%d\t%d\t%d\t%.2f\t%d\t%d\n"
				, no
				, name 
				, kor , eng , mat, tot 
				, avg , rank, wrank);
	}

}
