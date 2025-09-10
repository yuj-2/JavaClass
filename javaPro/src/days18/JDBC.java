package days18;

public interface JDBC {
	
	void db_open();
	void db_close();
	
	// CRUD
	void select();
	void insert();
	void update();
	void delete();

}
