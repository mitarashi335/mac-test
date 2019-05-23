package com.misaki.ecsitePra1.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

//import com.misaki.ecsitePra1.dao.buyItemDAO;
import com.misaki.ecsitePra1.dao.loginDAO;
//import com.misaki.ecsitePra1.dto.buyItemDTO;
import com.misaki.ecsitePra1.dto.loginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport implements SessionAware{
	private String id;
	private String pass;
	public Map<String, Object> session;
	private loginDAO loginDAO = new loginDAO();
	private loginDTO loginDTO = new loginDTO();
//	private buyItemDAO buyItemDAO = new buyItemDAO();

	public String execute() {
		String result = ERROR;
		loginDTO = loginDAO.getLoginUserInfo(id, pass);
		session.put("loginUser", loginDTO);
		if(((loginDTO) session.get("loginUser")).getLoginFlg()) {
			result = SUCCESS;
//			buyItemDTO buyItemDTO = buyItemDAO.getBuyItemInfo();
			session.put("login_user_id",loginDTO.getId());
//			session.put("id", buyItemDTO.getId());
//			session.put("buyItem_name", buyItemDTO.getItemName());
//			session.put("buyItem_price", buyItemDTO.getItemPrice());
			return result;
		}
		return result;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
