package com.misaki.cobr.action;

import java.util.ArrayList;
import java.util.List;

import com.misaki.cobr.dao.RankingInfoDAO;
import com.misaki.cobr.dto.RankingInfoDTO;
import com.opensymphony.xwork2.ActionSupport;

public class FinRankingAction extends ActionSupport {
	private List<RankingInfoDTO>finRankInfoList = new ArrayList<RankingInfoDTO>();
	private String rankName;
	private int id;
	private int answerTimes;

	public String execute() {
		RankingInfoDAO dao = new RankingInfoDAO();
		finRankInfoList = dao.getFinRankNameInfo();
		System.out.println("finRankInfoList");
		return SUCCESS;
	}

	public List<RankingInfoDTO> getFinRankInfoList() {
		return finRankInfoList;
	}
	public void setFinRankInfoList(List<RankingInfoDTO> finRankInfoList) {
		this.finRankInfoList = finRankInfoList;
	}

	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	public int getAnswerTimes() {
		return answerTimes;
	}
	public void setAnswerTimes(int answerTimes) {
		this.answerTimes = answerTimes;
	}
}