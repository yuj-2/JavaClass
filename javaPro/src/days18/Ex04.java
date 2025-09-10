package days18;

/**
 * @author kenik  
 * @date 2025. 9. 10. 오전 11:05:14 
 * @subject  [ 싱글톤(Singleton) 패턴 ]  (암기)
 * @content 
 */ 
public class Ex04 {

	public static void main(String[] args) {
		// 자바는 [단일 상속]만 지원하고, [다중 상속]을 지원하지 않는다. 
		// 왜?
		// ( ==> 인터페이스를 통해서 다중 상속을 대신할 수 있다. )
		
		// The constructor BoardDAO() [is not visible]
		BoardDAO dao1 = BoardDAO.getInstance();  //new BoardDAO();
		BoardDAO dao2 = BoardDAO.getInstance();  //new BoardDAO();
		BoardDAO dao3 = BoardDAO.getInstance();  //new BoardDAO();
		
		System.out.println( dao1.hashCode() );
		System.out.println( dao2.hashCode() );
		System.out.println( dao3.hashCode() );

	} // main

}

// 게시판(Board) - 글쓰기,수정,삭제,목록 등등 + DB 연동
// 멀티 스레드에 안전하지 않다. 
class BoardDAO{
	
	// 필드         발러타일
	private static volatile BoardDAO boardDAO = null;
	
	// 생성자의 접근지정자가 private 이기 때문에
	// new BoardDAO() 객체(인스턴스)화 할 수 없다.
	private BoardDAO() {
		
	}
	// 메서드 
	public static BoardDAO getInstance(){
		
		if ( boardDAO == null ) {				
			synchronized (BoardDAO.class) {
				if ( boardDAO == null ) {
					boardDAO = new BoardDAO();
				}
			}
			
		}
	
		return boardDAO;
	}
	
}




