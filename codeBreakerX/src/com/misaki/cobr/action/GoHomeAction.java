package com.misaki.cobr.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class GoHomeAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	public String execute() {
		session.remove("tryOnea");
		session.remove("tryOneb");
		session.remove("tryOnec");
		session.remove("tryTwoa");
		session.remove("tryTwob");
		session.remove("tryTwoc");
		session.remove("tryThreea");
		session.remove("tryThreeb");
		session.remove("tryThreec");
		session.remove("tryFoura");
		session.remove("tryFourb");
		session.remove("tryFourc");
		session.remove("tryFivea");
		session.remove("tryFiveb");
		session.remove("tryFivec");

		session.remove("first");
		session.remove("second");
		session.remove("third");

		session.remove("hitCount0");
		session.remove("hitCount1");
		session.remove("hitCount2");
		session.remove("hitCount3");
		session.remove("hitCount4");
		session.remove("blowCount0");
		session.remove("blowCount1");
		session.remove("blowCount2");
		session.remove("blowCount3");
		session.remove("blowCount4");

		return  SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
