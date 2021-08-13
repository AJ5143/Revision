package samples;

import java.util.Scanner;

public class GCD {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(findGCD(a,b));
		

	}

	public static int findGCD(int a, int b) {
		
		return a%b==0?b:findGCD(b,a%b);
		
	}

}
