package com.misaki.cobr.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class ForthShotAction extends ActionSupport implements SessionAware {
	int[] hitCount = new int[9];
	int[] blowCount = new int[9];
	public String firstAnswer;
	public String secondAnswer;
	public String thirdAnswer;
	public static final String CLEAR = "clear";
	public static final String Depo = "Deportation";
	private Map<String, Object> session;
	private int tryFoura;
	private int tryFourb;
	private int tryFourc;
	private String sameNumberErrorMessage;
	private int LuckyShot;

	public String execute() {
		String result = SUCCESS;
		hitCount[3] = 0;
		blowCount[3] = 0;
		session.put("tryFoura", tryFoura);
		session.put("tryFourb", tryFourb);
		session.put("tryFourc", tryFourc);
		//test
		System.out.println("answerCount");
		System.out.println(StartAction.Count);
		System.out.println("first");
		System.out.println(session.get("first"));
		System.out.println("second");
		System.out.println(session.get("second"));
		System.out.println("third");
		System.out.println(session.get("third"));
		System.out.println("tryFoura");
		System.out.println(session.get("tryFoura"));
		System.out.println("tryFourb");
		System.out.println(session.get("tryFourb"));
		System.out.println("tryFourc");
		System.out.println(session.get("tryFourc"));
		if(session.isEmpty()) {
			return Depo;
		}
		if(StartAction.Count == 3) {
			StartAction.Count++;
		}else if(StartAction.Count == 4){
			//現時点で処理なし
		}else {
			return Depo;
		}
		//test
		System.out.println("answerCount");
		System.out.println(StartAction.Count);

		if (session.get("first") == session.get("tryFoura")) {
			firstAnswer = "hit";
			hitCount[3]++;
		} else if (session.get("first") == session.get("tryFourb")
				|| session.get("first") == session.get("tryFourc")) {
			firstAnswer = "blow";
			blowCount[3]++;
		} else {
			firstAnswer = "not";
		}

		if (session.get("second") == session.get("tryFourb")) {
			secondAnswer = "hit";
			hitCount[3]++;
		} else if (session.get("second") == session.get("tryFoura")
				|| session.get("second") == session.get("tryFourc")) {
			secondAnswer = "blow";
			blowCount[3]++;
		} else {
			secondAnswer = "not";
		}

		if (session.get("third") == session.get("tryFourc")) {
			thirdAnswer = "hit";
			hitCount[3]++;
		} else if (session.get("third") == session.get("tryFoura")
				|| session.get("third") == session.get("tryFourb")) {
			thirdAnswer = "blow";
			blowCount[3]++;
		} else {
			thirdAnswer = "not";
		}

		int hitCount3 = hitCount[3];
		int blowCount3 = blowCount[3];

		session.put("hitCount3", hitCount3);
		session.put("blowCount3", blowCount3);
		System.out.println(firstAnswer);
		System.out.println(secondAnswer);
		System.out.println(thirdAnswer);

		if (session.get("tryFoura") == session.get("tryFourb")
			|| session.get("tryFourb") == session.get("tryFourc")
			|| session.get("tryFoura") == session.get("tryFourc")) {
			sameNumberErrorMessage = "同じ数字が使われています。異なる３つの数字を入れてください。";
			System.out.println(sameNumberErrorMessage);
			StartAction.Count--;
			return ERROR;
		}
		if (firstAnswer == "hit"
				&& secondAnswer == "hit"
				&& thirdAnswer == "hit") {
			result = CLEAR;
			LuckyShot=3;
			System.out.println(LuckyShot);
			session.put("clearFlag", "1");
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

	public int getTryFoura() {
		return tryFoura;
	}

	public void setTryFoura(int tryFoura) {
		this.tryFoura = tryFoura;
	}

	public int getTryFourb() {
		return tryFourb;
	}

	public void setTryFourb(int tryFourb) {
		this.tryFourb = tryFourb;
	}

	public int getTryFourc() {
		return tryFourc;
	}

	public void setTryFourc(int tryFourc) {
		this.tryFourc = tryFourc;
	}

	public String getSameNumberErrorMessage() {
		return sameNumberErrorMessage;
	}
	public void setSameNumberErrorMessage(String sameNumberErrorMessage) {
		this.sameNumberErrorMessage = sameNumberErrorMessage;
	}

	public int getLuckyShot() {
		return LuckyShot;
	}
	public void setLuckyShot(int luckyShot) {
		LuckyShot = luckyShot;
	}

	public Map<String, Object> getSession() {
		return session;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}
