package cn.tedu;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 6778044215318881530L;
	
	private String username;
	private String password;
	private String nick;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", nick=" + nick + "]";
	}
	
	

}
