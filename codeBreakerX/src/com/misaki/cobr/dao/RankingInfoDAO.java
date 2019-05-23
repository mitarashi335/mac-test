package com.misaki.cobr.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.misaki.cobr.util.DBConnector;

public class RankingInfoDAO {
	private String sql = "insert into ranking_info(name, count) values(?,?)";

	public void rankingMake(String rankName, int answerTimes) throws SQLException{
		DBConnector dbc = new DBConnector();
		Connection con = dbc.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, rankName);
			ps.setInt(2, answerTimes);
			ps.execute();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			con.close();
		}
	}

}
