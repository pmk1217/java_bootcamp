package min;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("상품 정보를 입력하세요 : ");
		String name = scanner.next();
		
		System.out.println("가격 : ");
		int price = scanner.nextInt();
		
		System.out.println("재고량 : ");
		int countStock = scanner.nextInt();
		
		System.out.println(name + " : " + price + " : " + countStock);
		scanner.close();
	}

}
