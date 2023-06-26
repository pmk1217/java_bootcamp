package prob2;

import java.util.Iterator;

public class Prob2 {
	public static void main(String[] args) {
		for(int a = 1; a <= 10; a++) {
			int sum = a;
			for(int i = 1; i <= 10; i++) {
				System.out.print(sum +" ");
				sum = sum + 1;
			}
			System.out.println("");
		}
	}
}
