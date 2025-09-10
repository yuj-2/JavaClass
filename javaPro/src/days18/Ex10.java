package days18;

/**
 * @author kenik  
 * @date 2025. 9. 10. 오후 4:27:16 
 * @subject   
 * @content 
 */ 
public class Ex10 {

	public static void main(String[] args) {
		
		// DB - Oracle , My SQL, MS SQL Server 등등
		// 1) 연결 open
		// 2) CRUD
		// 3) 닫기 close
		// JAVA + DB 처리 표준 인터페이스 : JDBC
		
		// 첫번째 프로젝트에서 MySQL DB 사용.
		JDBC  db  =  new MySQLJDBC(); // new OracleJDBC();
		db.db_open();
		db.select();
		db.insert();
		db.update();
		db.delete();		
		db.db_close();
		System.out.println(" end ");
		

	} // main

} // class










