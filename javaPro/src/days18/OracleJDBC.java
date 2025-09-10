package days18;

public class OracleJDBC implements JDBC {

	@Override
	public void db_open() {
		System.out.println("오라클 연결...");
	}

	@Override
	public void db_close() {
		System.out.println("오라클 종료...");
	}

	@Override
	public void select() {
		System.out.println("오라클 조회...");
	}

	@Override
	public void insert() {
		System.out.println("오라클 추가...");
	}

	@Override
	public void update() {
		System.out.println("오라클 수정...");
	}

	@Override
	public void delete() {
		System.out.println("오라클 삭제...");
	}

}
