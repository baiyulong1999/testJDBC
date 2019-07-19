package test.pojo;

public class User {
	private int uid;
	private String uname;
	private String password;
	private String permissions;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int uid, String uname, String password, String permissions) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.password = password;
		this.permissions = permissions;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPermissions() {
		return permissions;
	}
	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", password=" + password + ", permissions=" + permissions
				+ "]";
	}
	
	
}
