package days28;

import java.io.Serializable;

public class UserInfo implements Serializable{
	
	private static final long serialVersionUID = 3368506331876513342L;
	
	String name;
	int age;
	transient String password;  // 직렬화할 때  포함시키지 않겠다.
	
	public UserInfo() {
		this("UnKnonw", 0, "1234");
	}
	
	public UserInfo(String name, int age, String password) {
		super();
		this.name = name;
		this.age = age;
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserInfo [name=" + name + ", age=" + age + ", password=" + password + "]";
	} 

}
