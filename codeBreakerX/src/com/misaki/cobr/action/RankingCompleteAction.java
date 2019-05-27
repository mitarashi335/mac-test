package com.misaki.cobr.action;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.misaki.cobr.dao.RankingInfoDAO;
import com.misaki.cobr.util.InputChecker;
import com.opensymphony.xwork2.ActionSupport;
public class RankingCompleteAction extends ActionSupport implements SessionAware{
	private String rankName;
	private Map<String, Object>session;
	private List<String> rankNameErrorMessageList;
	public static final String Depo = "Deportation";

	public String execute() throws SQLException{
		String result = ERROR;
		session.put("rankName", rankName);

		InputChecker ipcheck = new InputChecker();
		rankNameErrorMessageList = ipcheck.doCheck("名前",rankName,1,8,true,false,false,true,false,false,false);
		if(rankNameErrorMessageList.size() > 0) {
			return result;
		}
		//test
		System.out.println("completeAction");
		System.out.println("answerTimes");
		System.out.println(session.get("answerTimes"));
		System.out.println("name");
		System.out.println(session.get("rankName"));
		RankingInfoDAO ridao = new RankingInfoDAO();
		ridao.rankingMake(session.get("rankName").toString(), Integer.parseInt(session.get("answerTimes").toString()));
		result = SUCCESS;
		//直打ちで来た場合にエラー画面へ向かう。
		if(session.get("clearFlag")!="1") {
			return Depo;
		}
		return result;
	}
	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public List<String> getRankNameErrorMessageList() {
		return rankNameErrorMessageList;
	}
	public void setRankNameErrorMessageList(List<String> rankNameErrorMessageList) {
		this.rankNameErrorMessageList = rankNameErrorMessageList;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
