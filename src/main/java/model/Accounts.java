package model;


public class Accounts {
	private String username;
	private String pass;
	private int id_sd;
	private int isadmin;
	
	public Accounts (String username, String pass, int id_sd, int isadmin) {
		super();
		this.username = username;
		this.pass = pass;
		this.id_sd = id_sd;
		this.isadmin = isadmin;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getId_sd() {
		return id_sd;
	}
	public void setId_sd(int id_sd) {
		this.id_sd = id_sd;
	}
	public int getIsadmin() {
		return isadmin;
	}
	public void setIsadmin(int isadmin) {
		this.isadmin = isadmin;
	}
}
