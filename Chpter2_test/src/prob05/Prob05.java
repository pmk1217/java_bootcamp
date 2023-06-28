package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int answer;	

		// 정답 램덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt( 100 ) + 1;
		System.out.println(correctNumber);
		System.out.println("수를 결정하였습니다. 맞춰 보세요");
		System.out.println("1 - 100");
		answer = scanner.nextInt();
		int a = 0, b = 100;
		
			while(correctNumber != answer) {
				answer = scanner.nextInt();
				if(correctNumber > answer) {
					System.out.println("더 높게");
					a = answer;
					System.out.println(a +"-"+b);
				}			
				if(correctNumber < answer) {
					System.out.println("더 낮게");
					b = answer;
					System.out.println(a +"-"+b);
				}		
				
				if(correctNumber == answer) {
					System.out.println("맞았습니다.");
					System.out.println("다시 하시겠습니까(y/n) >> ");
				}
		}
		
		scanner.close();
	}

}