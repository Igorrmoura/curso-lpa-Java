package programFuncionario;

import java.util.Locale;
import java.util.Scanner;
import atributos.dadosFuncio;

public class Funcionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		dadosFuncio emp = new dadosFuncio();
		
		System.out.print("nome do funcionario: ");
		emp.name = sc.nextLine();
		System.out.print("salario: ");
		emp.GrossSalary = sc.nextDouble();
		System.out.print("taxa: ");
		emp.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("dadosFuncio : " + emp);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		emp.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("updade data: " + emp);
		
		sc.close();

	}

}
