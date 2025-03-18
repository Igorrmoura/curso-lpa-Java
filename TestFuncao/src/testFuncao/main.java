package testFuncao;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int higher = max(a, b, c);
		ShowResult(higher);
		
		sc.close();

	}
	// nao precisa ser o mesmo nome da variavel de cima 
	public static int max(int x, int y, int z) {
		int aux;
		if (x > y && x > z) {
			aux = x;
		} else if (y > z) {
			aux = y;
		} else {
			aux = z;
		}
		
		return aux;	
			
	}
	
	public static void ShowResult(int value) {
		System.out.println("higher= " + value);
	}

}
