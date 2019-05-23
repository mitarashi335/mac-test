package com.sasako.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sasako.dao.UserInfoDAO;


public class UserCreateCompleteAction extends ActionSupport implements SessionAware{
	private String loginUserId;
	private String userId;
	private String firstName;
	private String familyName;
	private String firstNameKana;
	private String familyNameKana;
	private String password;
	private String email;
	private String sex;
	private String insertDate;
	//InputChecker List
	private Map<String, Object>session;

	private UserInfoDAO uidao = new UserInfoDAO();

	public String execute() throws SQLException{

		String result = ERROR;
		uidao.createUserData(session.get("userId").toString(),session.get("password").toString(), session.get("familyName").toString(), session.get("firstName").toString(), session.get("familyNameKana").toString(), session.get("firstNameKana").toString(), session.get("sex").toString(), session.get("email").toString(), session.get("status").toString(), session.get("logined").toString(), session.get("insertDate").toString());

		session.put("loginUserId", session.get("userId"));

		session.remove("userId");
		session.remove("firstName");
		session.remove("familyName");
		session.remove("firstNameKana");
		session.remove("familyNameKana");
		session.remove("email");
		session.remove("sex");
		session.remove("insertDate");

		result = SUCCESS;

		return result;
	}


	public String getLoginUserId() {
		return loginUserId;
	}


	public void setLoginUserId(String loginUserId) {
		this.loginUserId = loginUserId;
	}


	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFamilyName() {
		return familyName;
	}
	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	public String getFirstNameKana() {
		return firstNameKana;
	}
	public void setFirstNameKana(String firstNameKana) {
		this.firstNameKana = firstNameKana;
	}

	public String getFamilyNameKana() {
		return familyNameKana;
	}
	public void setFamilyNameKana(String familyNameKana) {
		this.familyNameKana = familyNameKana;
	}

	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(String insertDate) {
		this.insertDate = insertDate;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session =session;
	}
}

