package com.misaki.cobr.dto;

public class RankingInfoDTO {
	private String rankName;
	private int answerTimes;
	private int id;
	private int ranking;

	public String getRankName() {
		return rankName;
	}
	public void setRankName(String rankName) {
		this.rankName = rankName;
	}

	public int getAnswerTimes() {
		return answerTimes;
	}
	public void setAnswerTimes(int answerTimes) {
		this.answerTimes = answerTimes;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
}
