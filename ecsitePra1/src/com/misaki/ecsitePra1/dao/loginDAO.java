package com.misaki.ecsitePra1.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.misaki.ecsitePra1.dto.loginDTO;
import com.misaki.ecsitePra1.util.DBConnector;


public class loginDAO {
	private DBConnector DBC= new DBConnector();
	private Connection connection=DBC.getConnection();
	private loginDTO loginDTO = new loginDTO();

	public loginDTO getLoginUserInfo(String id,String pass) {
		String sql = "SELECT * FROM login_user_transaction where login_id = ? AND login_pass = ?";
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			preparedStatement.setString(2, pass);
			ResultSet resultSet = preparedStatement.executeQuery();
			if(resultSet.next()) {
				loginDTO.setId(resultSet.getString("login_id"));
				loginDTO.setPass(resultSet.getString("login_pass"));
				loginDTO.setName(resultSet.getString("user_name"));
				if(!(resultSet.getString("login_id").equals(null))) {
					loginDTO.setLoginFlg(true);
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return loginDTO;
	}
	public loginDTO getLoginDTO() {
	return loginDTO;
	}
}
