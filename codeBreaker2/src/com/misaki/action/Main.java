package com.misaki.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		String title="CodeBreaker2";
		String rule="4桁の数字を当てるゲーム\n"
				+ "1~9の数字から出題されます。\n"
				+ "同じ数字は使わないです。\n"
				+ "位置と数字が同じ場合、Hit\n"
				+ "数字のみの場合、blow\n"
				+ "4Hitでクリア。\n\n";
		int[] answer=new int[4];
		int[] input=new int[4];

		int hit=0,blow=0,count=0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(title);
		System.out.println(rule);

		for(int i=0; i < answer.length; i++) {
			boolean flag =false;
			answer[i]=(int)(Math.random()* 9 + 1 );
			do {
				flag = false;
				for(int j = i - 1;j >= 0; j--) {
					if(answer[i] == answer[j]) {
						flag =true;
						answer[i]=(int)(Math.random() * 9 + 1);
					}
				}
			}while(flag ==true);
		}
		while (true) {
			count++;
			System.out.println("***"+count+"回目***");

			for(int i = 0; i < answer.length; i++) {
				System.out.println( (i + 1) + "個目 : ");
				try {
					input[i] = Integer.parseInt(br.readLine());
				}catch(NumberFormatException e) {
					System.err.println("数値を入力してください。");
					i--;
				}catch(IOException e) {
					System.err.println("もう一度入力してください");
					i--;
				}
			}
			hit = 0;
			blow = 0;
	        for (int i = 0; i < answer.length; i++) {
	            for (int j = 0; j < answer.length; j++) {
	                if (i == j && input[i] == answer[j]) {
	                    hit++;
	                } else if (input[i] == answer[j]) {
	                    blow++;
	                }
	            }
	        }

		System.out.println("ヒット" + hit + " ブロー" + blow);
        if (hit == 4) {
            System.out.println("おめでとー");
            break;
        }else{
            System.out.println();
        }
		}
	}

}
