package estruturaRepetitivaW;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int senha = sc.nextInt();
		
		while (senha != 2200) {
			System.out.println("acesso negado");
			senha = sc.nextInt();
		}
		
		System.out.println("acesso permitido");	
		

		
		sc.close();
	}
}
	



	