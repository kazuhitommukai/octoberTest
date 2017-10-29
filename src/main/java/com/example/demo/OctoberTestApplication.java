package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OctoberTestApplication {

	public static void main(String[] args) {
		
		/* キーボードから値を入力 */
		System.out.print("数値 >");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();

		/* エラーチェック */
		if(input<0 || input>127) {
			System.out.println("数値は0から127の範囲で入力してください");
			System.exit(0);
		}

		/*
		 * 2進数計算(逆の桁から計算)
		 * ＜イメージ＞
		 * 2)55
		 *   --
		 * 2)27 余り1  8桁目↑
		 *   --
		 * 2)13 余り1  7桁目↑
		 *   --
		 * 2) 6 余り1  6桁目↑
		 *   --
		 * 2) 3 余り0  5桁目↑
		 *   --
		 * 2) 1 余り1  4桁目↑
		 *   --
		 * 2) 0 余り1  3桁目↑
		 *   --
		 *    0 余り0  2桁目↑
		 *    ↑1桁目→
		 */
		// 2進数(逆の桁から先に計算していく)
		int[] binary_reverse = new int[8];

		// 作業用変数に代入
		int work = input;
		for(int i=0; i < 8 ; i++) {
			// 余りを格納
			binary_reverse[i] = work % 2;
			// 商を次の計算に設定
			work /= 2;
		}

		/*
		 * 表示を行う
		 * 末尾の桁から格納されていることに注意する
		 * ＜イメージ＞
		 * 2進数の桁  8  7  6  5  4  3  2  1
		 *            ← ← ← ← ← ← ← ←表示
		 * 配列の添字 0  1  2  3  4  5  6, 7
		 * 配列の状態{1, 1, 1, 0, 1, 1, 0, 0}
		 * 最終表示形 00110111
		 */
		for(int i = 7; i >= 0; i--) {
			System.out.print(binary_reverse[i]);
		
		
		
		
		
		SpringApplication.run(OctoberTestApplication.class, args);
	}
}
