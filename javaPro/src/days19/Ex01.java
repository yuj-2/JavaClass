package days19;

/**
 * @author kenik  
 * @date 2025. 9. 11. 오전 8:31:40 
 * @subject  인터페이스   
 * @content    ㄴ 상수 필드
 *             ㄴ 추상 메서드 
 *             
 *             ㄴ 디폴트 메서드 , 정적 메서드 추가 + private 메서드 
 */ 
public class Ex01 {

	public static void main(String[] args) {
		// html 문서 또는 xml 문서들을 구문분석(파싱)을 해서 
		// 그 문서 속에서 내가 원하는 내용을 얻어오는 작업...
		
		String fileName = "sample.html";
		String docType = "html";
		
		Parseable parser = ParserManager.getParser(docType);
		
		parser.parse(fileName);
		parser.print();
		
		System.out.println(" end ");
		

	} // main

} // class

// 2000년 A개발자 구현
interface Parseable{	
	// 구문 분석하는 데 사용되는 추상 메서드 선언
	void parse(String fileName);  // public abstract 생략
	
	// 구문 분석한 후에 분석결과를 인쇄하는 추상 메서드 선언
	default void print()  // 2025년도에 추가.
	{
		System.out.println("인쇄 기능 구현된 메소드 추가");
	}
	
	// 25년 새로운 기능의 메서드
	static void test() {
		System.out.println("기능");
	}
}

//2000년 A개발자 구현
// XML문서를 파싱하는 클래스 선언
class XMLParser implements Parseable{

	@Override
	public void parse(String fileName) {
		System.out.println("XML 문서 파일을 구분 분석 메서드 호출됨...");
	}
	
}

//2000년 A개발자 구현
// HTML문서를 파싱하는 클래스 선언
class HTMLParser implements Parseable{

	@Override
	public void parse(String fileName) {	
		System.out.println("HTML 문서 파일을 구분 분석 메서드 호출됨...");
	}
	
}

//2020년 A개발자 구현
// PDF 문서를 파싱하는 클래스 선언
class PDFParser implements Parseable{

	@Override
	public void parse(String fileName) {	
		System.out.println("PDF 문서 파일을 구분 분석 메서드 호출됨...");
	}
	
	public void print()  {
		System.out.println("인쇄 기능 구현된 메소드 추가");
	}
	
}

//2024년 A개발자 구현
//WORD 문서를 파싱하는 클래스 선언
class WordParser implements Parseable{

	@Override
	public void parse(String fileName) {	
		System.out.println("Word 문서 파일을 구분 분석 메서드 호출됨...");
	}
	
}

// 인터페이스 상속 ( extends 키워드 사용 )
interface ParseablePlus extends Parseable{	
	// 인쇄하는 추상 메소드 선언
	void print();
}


// Parser를 관리하는 클래스
class ParserManager{
	
	//     [ 다형성  ]  
	public static Parseable getParser(String docType){
		Parseable parser = null;
		switch ( docType) {
		case "xml":
			// [ 업캐스팅 ]
			parser = new XMLParser();
			break; 
		case "html":
			parser = new HTMLParser();
			break; 
		case "pdf":
			parser = new PDFParser();
			break;
		case "word":
			parser = new WordParser();
			break; 
		default:
			parser = null;
			break;
		} // switch
		
		return parser;
	}
	
}








