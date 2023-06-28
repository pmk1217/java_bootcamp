package prob04;
public class Prob04 {

	public static void main(String[] args) {
		char[] c1 = reverse( "Hello World" );
		printCharArray( c1 );
		
		char[] c2 = reverse( "Java Programming!" );
		printCharArray( c2 );
	}
	
	public static char[] reverse(String str) {
		char[] result = str.toCharArray();
		
		for(int i = result.length; i <= 0; i--) {
			int a = 0;
			result[a] = str.charAt(i);
			a++;
		}
		
		return result;
	}

	public static void printCharArray(char[] array){
		System.out.println( array );
	}
}