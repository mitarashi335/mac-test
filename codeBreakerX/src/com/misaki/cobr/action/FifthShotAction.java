package com.misaki.cobr.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class FifthShotAction extends ActionSupport implements SessionAware {
	int[] hitCount=new int[9];
	int[] blowCount=new int[9];
	public String firstAnswer;
	public String secondAnswer;
	public String thirdAnswer;
	public static final String CLEAR = "clear";
	private Map<String, Object> session;
	private int tryFivea;
	private int tryFiveb;
	private int tryFivec;
	private String sameNumberErrorMessage;

	public String execute() {
		String result = SUCCESS;
		hitCount[4] = 0;
		blowCount[4] = 0;
		session.put("tryFivea", tryFivea);
		session.put("tryFiveb", tryFiveb);
		session.put("tryFivec", tryFivec);
		//test
		System.out.println("answerCount");
		System.out.println(StartAction.Count);
		System.out.println("first");
		System.out.println(session.get("first"));
		System.out.println("second");
		System.out.println(session.get("second"));
		System.out.println("third");
		System.out.println(session.get("third"));
		System.out.println("tryFivea");
		System.out.println(session.get("tryFivea"));
		System.out.println("tryFiveb");
		System.out.println(session.get("tryFiveb"));
		System.out.println("tryFivec");
		System.out.println(session.get("tryFivec"));
		StartAction.Count++;
		//test
		System.out.println("answerCount");
		System.out.println(StartAction.Count);

		if (session.get("first") == session.get("tryFivea")) {
			firstAnswer = "hit";
			hitCount[4]++;
		} else if (session.get("first") == session.get("tryFiveb")
				|| session.get("first") == session.get("tryFivec")) {
			firstAnswer = "blow";
			blowCount[4]++;
		} else {
			firstAnswer = "not";
		}

		if (session.get("second") == session.get("tryFiveb")) {
			secondAnswer = "hit";
			hitCount[4]++;
		} else if (session.get("second") == session.get("tryFivea")
				|| session.get("second") == session.get("tryFivec")) {
			secondAnswer = "blow";
			blowCount[4]++;
		} else {
			secondAnswer = "not";
		}

		if (session.get("third") == session.get("tryFivec")) {
			thirdAnswer = "hit";
			hitCount[4]++;
		} else if (session.get("third") == session.get("tryFivea")
				|| session.get("third") == session.get("tryFiveb")) {
			thirdAnswer = "blow";
			blowCount[4]++;
		} else {
			thirdAnswer = "not";
		}

		int hitCount4 = hitCount[4];
		int blowCount4 = blowCount[4];

		session.put("hitCount4", hitCount4);
		session.put("blowCount4", blowCount4);
		System.out.println(firstAnswer);
		System.out.println(secondAnswer);
		System.out.println(thirdAnswer);

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

	public int[] getHitCount() {
		return hitCount;
	}
	public void setHitCount(int[] hitCount) {
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

	public int getTryFivea() {
		return tryFivea;
	}
	public void setTryFivea(int tryFivea) {
		this.tryFivea = tryFivea;
	}

	public int getTryFiveb() {
		return tryFiveb;
	}
	public void setTryFiveb(int tryFiveb) {
		this.tryFiveb = tryFiveb;
	}

	public int getTryFivec() {
		return tryFivec;
	}
	public void setTryFivec(int tryFivec) {
		this.tryFivec = tryFivec;
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
