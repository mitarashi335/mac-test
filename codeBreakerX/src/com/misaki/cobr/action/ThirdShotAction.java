package com.misaki.cobr.action;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;
public class ThirdShotAction extends ActionSupport implements SessionAware {
	int[] hitCount=new int[9];
	int[] blowCount=new int[9];
	public String firstAnswer;
	public String secondAnswer;
	public String thirdAnswer;
	public static final String CLEAR = "clear";
	public static final String Depo = "Deportation";
	private Map<String, Object> session;
	private int tryThreea;
	private int tryThreeb;
	private int tryThreec;
	private String sameNumberErrorMessage;
	private int LuckyShot;

	public String execute() {
		String result = SUCCESS;
		hitCount[2] = 0;
		blowCount[2] = 0;
		session.put("tryThreea", tryThreea);
		session.put("tryThreeb", tryThreeb);
		session.put("tryThreec", tryThreec);
		//test
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
		System.out.println("tryTwoa");
		System.out.println(session.get("tryTwoa"));
		System.out.println("tryTwob");
		System.out.println(session.get("tryTwob"));
		System.out.println("tryTwoc");
		System.out.println(session.get("tryTwoc"));
		System.out.println("tryThreea");
		System.out.println(session.get("tryThreea"));
		System.out.println("tryThreeb");
		System.out.println(session.get("tryThreeb"));
		System.out.println("tryThreec");
		System.out.println(session.get("tryThreec"));
		if(session.isEmpty()) {
			return Depo;
		}
		if(StartAction.Count == 2) {
			StartAction.Count++;
		}else if(StartAction.Count == 3){
			//現時点で処理なし
		}else {
			return Depo;
		}

		if (session.get("first") == session.get("tryThreea")) {
			firstAnswer = "hit";
			hitCount[2]++;
		} else if (session.get("first") == session.get("tryThreeb")
				|| session.get("first") == session.get("tryThreec")) {
			firstAnswer = "blow";
			blowCount[2]++;
		} else {
			firstAnswer = "not";
		}

		if (session.get("second") == session.get("tryThreeb")) {
			secondAnswer = "hit";
			hitCount[2]++;
		} else if (session.get("second") == session.get("tryThreea")
				|| session.get("second") == session.get("tryThreec")) {
			secondAnswer = "blow";
			blowCount[2]++;
		} else {
			secondAnswer = "not";
		}

		if (session.get("third") == session.get("tryThreec")) {
			thirdAnswer = "hit";
			hitCount[2]++;
		} else if (session.get("third") == session.get("tryThreea")
				|| session.get("third") == session.get("tryThreeb")) {
			thirdAnswer = "blow";
			blowCount[2]++;
		} else {
			thirdAnswer = "not";
		}

		int hitCount2 = hitCount[2];
		int blowCount2 = blowCount[2];

		session.put("hitCount2", hitCount2);
		session.put("blowCount2", blowCount2);
		System.out.println(firstAnswer);
		System.out.println(secondAnswer);
		System.out.println(thirdAnswer);
		System.out.println(hitCount[2]);
		System.out.println(blowCount[2]);
		System.out.println(hitCount2);
		System.out.println(blowCount2);

		if(session.get("tryThreea") == session.get("tryThreeb")
			|| session.get("tryThreeb") == session.get("tryThreec")
			|| session.get("tryThreea") == session.get("tryThreec")){
				sameNumberErrorMessage ="同じ数字が使われています。異なる３つの数字を入れてください。";
				System.out.println(sameNumberErrorMessage);
				StartAction.Count--;
				return ERROR;
		}

		if (firstAnswer == "hit"
				&& secondAnswer == "hit"
				&& thirdAnswer == "hit") {
			result = CLEAR;
			LuckyShot=2;
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

	public int getTryThreea() {
		return tryThreea;
	}

	public void setTryThreea(int tryThreea) {
		this.tryThreea = tryThreea;
	}

	public int getTryThreeb() {
		return tryThreeb;
	}

	public void setTryThreeb(int tryThreeb) {
		this.tryThreeb = tryThreeb;
	}

	public int getTryThreec() {
		return tryThreec;
	}

	public void setTryThreec(int tryThreec) {
		this.tryThreec = tryThreec;
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
