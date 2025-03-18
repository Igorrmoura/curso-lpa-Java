package testFuncao;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("imprima o maior numero");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if (a > b && a > c) {
			System.out.println("higher= " + a);
		}
		else if (b > c) {
			System.out.println("higher= " + b);
		}
		else {
			System.out.println("higher= " + c);
		}
		
		
		sc.close();

	}

}
