package samples;

import java.util.Scanner;

public class NumberPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Number = sc.nextInt();
		System.out.println(isPalindrome(Number));

	}

	private static Boolean isPalindrome(int number) {
		boolean isPal = false;
		String Num = Integer.toString(number);
		String reversed = "";
		for(int i=Num.length()-1;i>=0;i--){
			reversed += Num.charAt(i);
		}
		if(Num.equals(reversed))
			isPal = true;
		
		return isPal;}

}
