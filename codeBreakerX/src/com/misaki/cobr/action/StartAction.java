package com.misaki.cobr.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class StartAction extends ActionSupport implements SessionAware{
	private Map<String, Object> session;
	static int Count = 0;
	public String execute() {
		int[] answer=new int[3];
		answer[0] = 0;
		while(answer[0] == 0) {
			for (int i = 0; i < answer.length; i++) {
				boolean flag = false;
		//乱数を配列に入れる。
				answer[i] = (int) (Math.random() * 6 + 1);
				do {
					flag = false;
					for (int j = i - 1; j >= 0; j--) {
						if (answer[i] == answer[j]) {
							flag = true;
							answer[i] = (int) (Math.random() * 6 + 1);
						}
					}
				} while (flag == true);
			}

        //一桁目
			session.put("first", answer[0]);
		//二桁目
			session.put("second", answer[1]);
		//三桁目
			session.put("third", answer[2]);
		//test
			System.out.println("first");
			System.out.println(session.get("first"));
			System.out.println("second");
			System.out.println(session.get("second"));
			System.out.println("third");
			System.out.println(session.get("third"));
		}
	return SUCCESS;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
}
