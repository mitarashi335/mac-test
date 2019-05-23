package com.misaki.cobr.action;
import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.misaki.cobr.dao.RankingInfoDAO;
import com.opensymphony.xwork2.ActionSupport;
public class RankingCompleteAction extends ActionSupport implements SessionAware{
	private String rankName;
	private Map<String, Object>session;
	RankingInfoDAO ridao = new RankingInfoDAO();
	public String execute() throws SQLException{
		String result = ERROR;
		session.put("rankName", rankName);
		//test
		System.out.println("completeAction");
		System.out.println("answerTimes");
		System.out.println(session.get("answerTimes"));
		System.out.println("name");
		System.out.println(session.get("rankName"));
		ridao.rankingMake(session.get("rankName").toString(), Integer.parseInt(session.get("answerTimes").toString()));
		result = SUCCESS;
		return result;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
