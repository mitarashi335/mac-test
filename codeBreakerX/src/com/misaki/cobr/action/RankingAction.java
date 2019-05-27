package com.misaki.cobr.action;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.misaki.cobr.dao.RankingInfoDAO;
import com.misaki.cobr.dto.RankingInfoDTO;
import com.opensymphony.xwork2.ActionSupport;
public class RankingAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	private List<RankingInfoDTO>rankInfoList = new ArrayList<RankingInfoDTO>();
	public static final String Depo = "Deportation";
	private String rankName;
	private int id;
	private String answerTimes;

	public String execute() {
		//test
		System.out.println("answerCount");
		System.out.println(StartAction.Count);
		switch(StartAction.Count) {
		case 1:
			answerTimes = "1";
			break;
		case 2:
			answerTimes = "2";
			break;
		case 3:
			answerTimes = "3";
			break;
		case 4:
			answerTimes = "4";
			break;
		case 5:
			answerTimes = "5";
			break;
		}
		//直打ちで来た場合にエラー画面へ向かう。
		if(session.get("clearFlag")!="1") {
			return Depo;
		}
		//test
		System.out.println("answerCount");
		System.out.println(StartAction.Count);
		System.out.println("answerTimes");
		System.out.println(answerTimes);
		//test

		RankingInfoDAO dao = new RankingInfoDAO();
		rankInfoList = dao.getRankNameInfo(rankName, Integer.parseInt(answerTimes), id);
		session.put("answerTimes",answerTimes);
		System.out.println("rankInfoList");
		session.put("rankInfoList", rankInfoList);
		return SUCCESS;
	}

	public String getAnswerTimes() {
		return answerTimes;
	}
	public void setAnswerTimes(String answerTimes) {
		this.answerTimes = answerTimes;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;

	}

	public List<RankingInfoDTO> getRankInfoList() {
		return rankInfoList;
	}
	public void setRankInfoList(List<RankingInfoDTO> rankInfoList) {
		this.rankInfoList = rankInfoList;
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
}
