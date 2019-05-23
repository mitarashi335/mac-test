package com.sasako.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
import com.sasako.dao.UserInfoDAO;
import com.sasako.util.CommonUtility;
import com.sasako.util.InputChecker;
public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	private String userId;
	private String firstName;
	private String familyName;
	private String firstNameKana;
	private String familyNameKana;
	private String password;
	private String email;
	private String sex;
	private String commonUtility;
	private String checkUserIdInfoMessage;
	private List<String> userIdErrorMessageList;
	private List<String> firstNameErrorMessageList;
	private List<String> familyNameErrorMessageList;
	private List<String> firstNameKanaErrorMessageList;
	private List<String> familyNameKanaErrorMessageList;
	private List<String> passwordErrorMessageList;
	private List<String> emailErrorMessageList;
	//InputChecker List
	private Map<String, Object>session;

	public String execute(){
		String result=ERROR;

		session.put("userId", userId);
		session.put("familyName", familyName);
		session.put("firstName", firstName);
		session.put("familyNameKana", familyNameKana);
		session.put("firstNameKana", firstNameKana);
		session.put("password", password);
		session.put("email", email);
		session.put("sex", sex);
		session.put("comonnUtility", commonUtility);

		InputChecker ipcheck = new InputChecker();

		userIdErrorMessageList = ipcheck.doCheck("ユーザーID", userId, 1, 8, true, false, false, true, false, false, false);
		firstNameErrorMessageList = ipcheck.doCheck("名", firstName, 1, 16, true, true, true, false, false, false, false);
		familyNameErrorMessageList = ipcheck.doCheck("姓", familyName, 1, 16, true, true, true, false, false, false, false);
		firstNameKanaErrorMessageList = ipcheck.doCheck("めい", firstNameKana, 1, 16, false, false, true, false, false, false, false);
		familyNameKanaErrorMessageList = ipcheck.doCheck("せい", familyNameKana, 1, 16, false, false, true, false, false, false, false);
		passwordErrorMessageList = ipcheck.doCheck("パスワード", password, 1, 16, true, false, false, true, false, false, false);
		emailErrorMessageList = ipcheck.doCheckForEmail("メールアドレス", email, 10, 32);


		if(userIdErrorMessageList.size()>0
		|| firstNameErrorMessageList.size()>0
		|| familyNameErrorMessageList.size()>0
		|| firstNameKanaErrorMessageList.size()>0
		|| familyNameKanaErrorMessageList.size()>0
		|| passwordErrorMessageList.size()>0
		|| emailErrorMessageList.size()>0){
			//test
			System.out.println(userIdErrorMessageList);
			return result;
		}
		UserInfoDAO uidao =new UserInfoDAO();
		if(uidao.checkUserIdInfo(userId)){
			checkUserIdInfoMessage ="既に存在しているユーザーIDです。";
		}else{
			CommonUtility commonUtility = new CommonUtility();

			//test
			System.out.println(password);
			//test

			password = commonUtility.concealPassword(password);
				result=SUCCESS;
		}
		return result;
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

	public String getCheckUserIdInfoMessage() {
		return checkUserIdInfoMessage;
	}



	public void setCheckUserIdInfoMessage(String checkUserIdInfoMessage) {
		this.checkUserIdInfoMessage = checkUserIdInfoMessage;
	}


	public String getCommonUtility() {
		return commonUtility;
	}
	public void setCommonUtility(String commonUtility) {
		this.commonUtility = commonUtility;
	}
	public List<String> getUserIdErrorMessageList() {
		return userIdErrorMessageList;
	}
	public void setUserIdErrorMessageList(List<String> userIdErrorMessageList) {
		this.userIdErrorMessageList = userIdErrorMessageList;
	}
	public List<String> getFirstNameErrorMessageList() {
		return firstNameErrorMessageList;
	}
	public void setFirstNameErrorMessageList(List<String> firstNameErrorMessageList) {
		this.firstNameErrorMessageList = firstNameErrorMessageList;
	}
	public List<String> getFamilyNameErrorMessageList() {
		return familyNameErrorMessageList;
	}
	public void setFamilyNameErrorMessageList(List<String> familyNameErrorMessageList) {
		this.familyNameErrorMessageList = familyNameErrorMessageList;
	}
	public List<String> getFirstNameKanaErrorMessageList() {
		return firstNameKanaErrorMessageList;
	}
	public void setFirstNameKanaErrorMessageList(List<String> firstNameKanaErrorMessageList) {
		this.firstNameKanaErrorMessageList = firstNameKanaErrorMessageList;
	}
	public List<String> getFamilyNameKanaErrorMessageList() {
		return familyNameKanaErrorMessageList;
	}
	public void setFamilyNameKanaErrorMessageList(List<String> familyNameKanaErrorMessageList) {
		this.familyNameKanaErrorMessageList = familyNameKanaErrorMessageList;
	}
	public List<String> getPasswordErrorMessageList() {
		return passwordErrorMessageList;
	}
	public void setPasswordErrorMessageList(List<String> passwordErrorMessageList) {
		this.passwordErrorMessageList = passwordErrorMessageList;
	}
	public List<String> getEmailErrorMessageList() {
		return emailErrorMessageList;
	}
	public void setEmailErrorMessageList(List<String> emailErrorMessageList) {
		this.emailErrorMessageList = emailErrorMessageList;
	}
	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
