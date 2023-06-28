package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in  );
		System.out.print("금액 : ");
		int money = scanner.nextInt();
		
		final int[] MONEYS = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};

		/* 코드 작성 */
		for(int i = 0; i < MONEYS.length; i++) {
			int change;
			change = money / MONEYS[i];
			System.out.println(MONEYS[i] + "원 : " + change + "개");
			for(int  a = 0; a < change; a++) {
				money = money - MONEYS[i];
			}
		}
		
		
		/* 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 */
		
		scanner.close();
 	}
}