package com.misaki.cobr.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class RankingAction extends ActionSupport implements SessionAware{
	private String answerTimes;
	private Map<String, Object> session;

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
		//test
		System.out.println("answerCount");
		System.out.println(StartAction.Count);
		System.out.println("answerTimes");
		System.out.println(answerTimes);
		//test
		session.put("answerTimes",answerTimes);
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
}
