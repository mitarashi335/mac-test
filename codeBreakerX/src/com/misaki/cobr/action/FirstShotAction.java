package com.misaki.cobr.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class FirstShotAction extends ActionSupport implements SessionAware {
	int[] hitCount=new int[9];
	int[] blowCount=new int[9];
	public String firstAnswer;
	public String secondAnswer;
	public String thirdAnswer;
	public static final String CLEAR = "clear";
	private Map<String, Object> session;
	private int tryOnea;
	private int tryOneb;
	private int tryOnec;
	private String sameNumberErrorMessage;

	public String execute() {
		String result = SUCCESS;
		hitCount[0] = 0;
		blowCount[0] = 0;
		session.put("tryOnea", tryOnea);
		session.put("tryOneb", tryOneb);
		session.put("tryOnec", tryOnec);
		//test
		System.out.println("Count");
		System.out.println(StartAction.Count);
		System.out.println("first");
		System.out.println(session.get("first"));
		System.out.println("second");
		System.out.println(session.get("second"));
		System.out.println("third");
		System.out.println(session.get("third"));
		System.out.println("tryOnea");
		System.out.println(session.get("tryOnea"));
		System.out.println("tryOneb");
		System.out.println(session.get("tryOneb"));
		System.out.println("tryOnec");
		System.out.println(session.get("tryOnec"));
		StartAction.Count++;

		System.out.println("answerCount");
		System.out.println(StartAction.Count);

		if (session.get("first") == session.get("tryOnea")) {
			firstAnswer = "hit";
			hitCount[0]++;
		} else if (session.get("first") == session.get("tryOneb")
				|| session.get("first") == session.get("tryOnec")) {
			firstAnswer = "blow";
			blowCount[0]++;
		} else {
			firstAnswer = "not";
		}

		if (session.get("second") == session.get("tryOneb")) {
			secondAnswer = "hit";
			hitCount[0]++;
		} else if (session.get("second") == session.get("tryOnea")
				|| session.get("second") == session.get("tryOnec")) {
			secondAnswer = "blow";
			blowCount[0]++;
		} else {
			secondAnswer = "not";
		}

		if (session.get("third") == session.get("tryOnec")) {
			thirdAnswer = "hit";
			hitCount[0]++;
		} else if (session.get("third") == session.get("tryOnea")
				|| session.get("third") == session.get("tryOneb")) {
			thirdAnswer = "blow";
			blowCount[0]++;
		} else {
			thirdAnswer = "not";
		}
		int hitCount0 = hitCount[0];
		int blowCount0 = blowCount[0];

		session.put("hitCount0", hitCount0);
		session.put("blowCount0", blowCount0);
		System.out.println(firstAnswer);
		System.out.println(secondAnswer);
		System.out.println(thirdAnswer);
		System.out.println(hitCount[0]);
		System.out.println(blowCount[0]);
		System.out.println(hitCount0);
		System.out.println(blowCount0);

		if(session.get("tryOnea") == session.get("tryOneb")
		|| session.get("tryOneb") == session.get("tryOnec")
		|| session.get("tryOnea") == session.get("tryOnec")){
			sameNumberErrorMessage ="同じ数字が使われています。異なる３つの数字を入れてください。";
			System.out.println(sameNumberErrorMessage);
			result = ERROR;
		}

		if (firstAnswer == "hit"
			&& secondAnswer == "hit"
			&& thirdAnswer == "hit") {
			result = CLEAR;
		}
		return result;
	}

	public int[] getBlowCount() {
		return blowCount;
	}

	public void setBlowCount(int[] blowCount) {
		this.blowCount = blowCount;
	}

	public int[] getHitCount() {
		return hitCount;
	}

	public void setHitCount(int[] hitCount) {
		this.hitCount = hitCount;
	}

	public String getFirstAnswer() {
		return firstAnswer;
	}

	public void setFirstAnswer(String firstAnswer) {
		this.firstAnswer = firstAnswer;
	}

	public String getSecondAnswer() {
		return secondAnswer;
	}

	public void setSecondAnswer(String secondAnswer) {
		this.secondAnswer = secondAnswer;
	}

	public String getThirdAnswer() {
		return thirdAnswer;
	}

	public void setThirdAnswer(String thirdAnswer) {
		this.thirdAnswer = thirdAnswer;
	}

	public int getTryOnea() {
		return tryOnea;
	}
	public void setTryOnea(int tryOnea) {
		this.tryOnea = tryOnea;
	}

	public int getTryOneb() {
		return tryOneb;
	}
	public void setTryOneb(int tryOneb) {
		this.tryOneb = tryOneb;
	}

	public int getTryOnec() {
		return tryOnec;
	}
	public void setTryOnec(int tryOnec) {
		this.tryOnec = tryOnec;
	}

	public String getSameNumberErrorMessage() {
		return sameNumberErrorMessage;
	}
	public void setSameNumberErrorMessage(String sameNumberErrorMessage) {
		this.sameNumberErrorMessage = sameNumberErrorMessage;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
