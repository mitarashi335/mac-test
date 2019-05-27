package com.misaki.cobr.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.misaki.cobr.dto.RankingInfoDTO;
import com.misaki.cobr.util.DBConnector;

public class RankingInfoDAO {
	public void rankingMake(String rankName, int answerTimes) throws SQLException{
		String sql = "insert into ranking_info(name, count) values(?,?)";
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

	public List<RankingInfoDTO> getRankNameInfo(String rankName,int answerTimes,int id){
		DBConnector dbc = new DBConnector();
		Connection con = dbc.getConnection();
		List<RankingInfoDTO> rankdtoList = new ArrayList<RankingInfoDTO>();
		String sql = "select * from ranking_info order by count,id ASC limit 5";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int ranking = 1;
			while(rs.next()) {
				RankingInfoDTO dto = new RankingInfoDTO();
				dto.setRankName(rs.getString("name"));
				dto.setAnswerTimes(rs.getInt("count"));
				dto.setId(rs.getInt("id"));
				dto.setRanking(ranking);
				rankdtoList.add(dto);
				ranking++;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try{
			con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return rankdtoList;
	}

	public List<RankingInfoDTO> getFinRankNameInfo(){
		DBConnector dbc = new DBConnector();
		Connection con = dbc.getConnection();
		List<RankingInfoDTO> finRankdtoList = new ArrayList<RankingInfoDTO>();
		String sql = "select * from ranking_info order by count,id ASC ";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			int ranking = 1;
			while(rs.next()) {
				RankingInfoDTO dto = new RankingInfoDTO();
				dto.setRankName(rs.getString("name"));
				dto.setAnswerTimes(rs.getInt("count"));
				dto.setId(rs.getInt("id"));
				dto.setRanking(ranking);
				finRankdtoList.add(dto);
				ranking++;
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			try{
			con.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return finRankdtoList;
	}
}
