package com.sasako.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class UserCreateAction extends ActionSupport implements SessionAware{
	private int backFlag;
	private Map<String, Object>session;
	public String execute() {
		if(backFlag != 1) {
			session.remove("userId");
			session.remove("firstName");
			session.remove("familyName");
			session.remove("firstNameKana");
			session.remove("familyNameKana");
			session.remove("email");
			session.remove("sex");
			session.remove("insertDate");
			session.remove("password");
		}
		return SUCCESS;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public int getBackFlag() {
		return backFlag;
	}
	public void setBackFlag(int backFlag) {
		this.backFlag = backFlag;
	}
}
