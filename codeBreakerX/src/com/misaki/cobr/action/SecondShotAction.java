package com.misaki.cobr.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class SecondShotAction extends ActionSupport implements SessionAware {
	int[] hitCount=new int[9];
	int[] blowCount=new int[9];
	public String firstAnswer;
	public String secondAnswer;
	public String thirdAnswer;
	public static final String CLEAR = "clear";
	private Map<String, Object> session;
	private int tryTwoa;
	private int tryTwob;
	private int tryTwoc;
	private String sameNumberErrorMessage;

	public String execute() {
		String result = SUCCESS;
		hitCount[1] = 0;
		blowCount[1] = 0;
		session.put("tryTwoa", tryTwoa);
		session.put("tryTwob", tryTwob);
		session.put("tryTwoc", tryTwoc);
		//test
		System.out.println("answerCount");
		System.out.println(StartAction.Count);
		System.out.println("first");
		System.out.println(session.get("first"));
		System.out.println("second");
		System.out.println(session.get("second"));
		System.out.println("third");
		System.out.println(session.get("third"));
		System.out.println("tryTwoa");
		System.out.println(session.get("tryTwoa"));
		System.out.println("tryTwob");
		System.out.println(session.get("tryTwob"));
		System.out.println("tryTwoc");
		System.out.println(session.get("tryTwoc"));
		StartAction.Count++;
		//test
		System.out.println("answerCount");
		System.out.println(StartAction.Count);

		if (session.get("first") == session.get("tryTwoa")) {
			firstAnswer = "hit";
			hitCount[1]++;
		} else if (session.get("first") == session.get("tryTwob")
				|| session.get("first") == session.get("tryTwoc")) {
			firstAnswer = "blow";
			blowCount[1]++;
		} else {
			firstAnswer = "not";
		}

		if (session.get("second") == session.get("tryTwob")) {
			secondAnswer = "hit";
			hitCount[1]++;
		} else if (session.get("second") == session.get("tryTwoa")
				|| session.get("second") == session.get("tryTwoc")) {
			secondAnswer = "blow";
			blowCount[1]++;
		} else {
			secondAnswer = "not";
		}

		if (session.get("third") == session.get("tryTwoc")) {
			thirdAnswer = "hit";
			hitCount[1]++;
		} else if (session.get("third") == session.get("tryTwoa")
				|| session.get("third") == session.get("tryTwob")) {
			thirdAnswer = "blow";
			blowCount[1]++;
		} else {
			thirdAnswer = "not";
		}

		int hitCount1 = hitCount[1];
		int blowCount1 = blowCount[1];

		session.put("hitCount1", hitCount1);
		session.put("blowCount1", blowCount1);
		//test
		System.out.println(firstAnswer);
		System.out.println(secondAnswer);
		System.out.println(thirdAnswer);

		if(session.get("tryTwoa") == session.get("tryTwob")
		|| session.get("tryTwob") == session.get("tryTwoc")
		|| session.get("tryTwoa") == session.get("tryTwoc")){
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



	public int[] getHitCount() {
		return hitCount;
	}
	public void setHitcount(int[] hitCount) {
		this.hitCount = hitCount;
	}

	public int[] getBlowCount() {
		return blowCount;
	}
	public void setBlowCount(int[] blowCount) {
		this.blowCount = blowCount;
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

	public int getTryTwoa() {
		return tryTwoa;
	}
	public void setTryTwoa(int tryTwoa) {
		this.tryTwoa = tryTwoa;
	}

	public int getTryTwob() {
		return tryTwob;
	}
	public void setTryTwob(int tryTwob) {
		this.tryTwob = tryTwob;
	}

	public int getTryTwoc() {
		return tryTwoc;
	}
	public void setTryTwoc(int tryTwoc) {
		this.tryTwoc = tryTwoc;
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
