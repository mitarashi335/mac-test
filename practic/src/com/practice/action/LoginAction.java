package com.practice.action;

import java.sql.SQLException;

import com.opensymphony.xwork2.ActionSupport;
import com.practice.dao.loginDAO;
import com.practice.dto.loginDTO;

public class LoginAction extends ActionSupport{
	private String name;
	private String pass;

	public String execute()throws SQLException {
		String ret = ERROR;

		loginDAO dao = new loginDAO();
		loginDTO dto = new loginDTO();

		dto=dao.select(name,pass);
		if(name.equals(dto.getName())) {
			if(pass.equals(dto.getPass())) {
				ret=SUCCESS;
			}
		}
	return ret;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
}
