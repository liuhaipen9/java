package com.cn.firstannotion;

import java.util.List;

public class PassWordUtils {
	@UserCase(id=47,description="I'm name Roc")
	public boolean validatePassword(String password){
		return (password.matches("\\w*\\d\\w"));
	}
	@UserCase(id=48)
	public String encryptPassword(String password){
		return new StringBuilder(password).reverse().toString();
	}
	@UserCase(id=49,description="NEW passwords can't equal previously used ones")
	public boolean checkForNewPassword(List<String> prevPasswords,String password){
		return !prevPasswords.contains(password);
	}
}
