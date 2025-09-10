package days18;

public class MySQLJDBC implements JDBC {

	@Override
	public void db_open() {
		System.out.println("MySQL 연결...");
	}

	@Override
	public void db_close() {
		System.out.println("MySQL 종료...");
	}

	@Override
	public void select() {
		System.out.println("MySQL 조회...");
	}

	@Override
	public void insert() {
		System.out.println("MySQL 추가...");
	}

	@Override
	public void update() {
		System.out.println("MySQL 수정...");
	}

	@Override
	public void delete() {
		System.out.println("MySQL 삭제...");
	}

}
