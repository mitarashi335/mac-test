package com.misaki.action;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
		String title="***CODE BREAKER***";
		String rule="隠された３つの数字を当てるゲーム。\n"
				+ "・数字は1〜6の間の数字です。\n"
				+ "・同じ数字は使いません。\n"
				+ "・位置と数字が当たったらHit\n"
				+ "・数字のみはBlow\n"
				+ "・３Hitでクリア。\n\n";
		int[] answer=new int[3];
		int[] input=new int[3];

		int hit=0,blow=0,count=0;
		 BufferedReader br
         = new BufferedReader(new InputStreamReader(System.in));
	System.out.println(title);
	System.out.println(rule);

	for (int i = 0; i < answer.length; i++) {
        //自分より前の要素にかぶるやつがないか確かめる。
        //あったらもう1回random
        boolean flag = false;
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
	while (true) {
        count++;
        System.out.println("*** "+count + "回目 ***");
        //インプット
        for (int i = 0; i < answer.length; i++) {
            System.out.print( (i + 1) + "個目 : ");
            try {
                input[i] = Integer.parseInt(br.readLine());
            } catch (NumberFormatException e) {
                System.err.println("数値を入力してください");
                i--;
            } catch (IOException e) {
                System.err.println("もう一度入力してください");
                i--;
            }
        }
        //答え判断
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
        //終了判断　ヒットが3つになったら終了
        System.out.println("ヒット" + hit + " ブロー" + blow);
        if (hit == 3) {
            System.out.println("おめでとー");
            break;
        }else{
            System.out.println();
        }
    }
	}

}
