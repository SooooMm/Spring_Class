package kr.hs.study.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//dto
@Component
@Scope("prototype")
public class Login {
	private String userId;
	private String userPw;
	private String userName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setUsers(String userId,String userPw,String userName) {
		this.userName = userName;
		this.userPw = userPw;
		this.userId = userId;
	}
	
}
