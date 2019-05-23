package com.misaki.cobr.action;
import com.opensymphony.xwork2.ActionSupport;
public class FirstShot extends ActionSupport{
	private int num1;
	private int num2;
	private int num3;

	public String execute() {
		String ret = ERROR;
		int[] input = {num1, num2, num3};

		StartAction ans =answer.select(0,1,2);



		return ret;
	}



}
