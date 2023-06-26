package prob5;

import java.util.Iterator;

public class Prob5 {

	public static void main(String[] args) {
		for(int i = 1; i < 100; i++) {
			String number = String.valueOf(i);
				for(int a=0; a < number.length(); a++) {
					if(number.charAt(a) == '3' || number.charAt(a) == '6' || number.charAt(a) == '9') {
						System.out.println(i + " 짝");
					}
				}
		}
	}
}
