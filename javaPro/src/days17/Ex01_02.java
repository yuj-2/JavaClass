package days17;

/**
 * @author kenik  
 * @date 2025. 9. 9. 오전 9:21:35 
 * @subject   
 * @content 
 */ 
public class Ex01_02 {

	public static void main(String[] args) {
		
		Document doc1 = new Document();
		Document doc2 = new Document();
		Document doc3 = new Document("자바문서.txt");
		Document doc4 = new Document();
		Document doc5 = new Document();

	} // main

} // class

// 문서 1/2/3/4/5...
class Document{
	
	String fileName;
	static int count = 1; // 명시적 초기화   왜? 클래스 변수로 선언 이유 파악
	
	// 인스턴스 초기화 블럭
	{
		// count++;
	}
	
	Document(){
		//count++;
		this(String.format("Noname%d.txt", count++)); // this의 2번째 용도 - 또 다른 생성자를 호출할 때의 this
	}
	
	Document(String fileName){
		this.fileName = fileName; // this의 1번째 용도 - 멤버를 가리킬 때의 this
		System.out.printf("문서 \"%s\"가 생성되었습니다.\n", this.fileName);
	}
	
}

