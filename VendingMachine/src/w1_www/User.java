package w1_www;

public class User {


	private String userName;
	private String password;
	private String name;
	private Boolean type;
	
	public Boolean ValidateUserName(String userName) {
		return type;
		
	}
	
	public Boolean ValidatePassword(String password) {
		return type;
		
	}
	
	public User(String userName, String password, String name, Boolean type) {
		super();
		this.userName = userName;
		this.password = password;
		this.name = name;
		this.type = type;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getType() {
		return type;
	}

	public void setType(Boolean type) {
		this.type = type;
	}

	

	
}
