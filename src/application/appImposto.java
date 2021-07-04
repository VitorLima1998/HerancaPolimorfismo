package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class appImposto {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Pessoa> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data: ");
			System.out.print("Individual or Company (I/C)? ");
			char ch = sc.next().charAt(0);

			if (ch == 'i') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Health Expentures: ");
				Double healthExpense = sc.nextDouble();
				list.add(new PessoaFisica(name, anualIncome, healthExpense));
			}

			if (ch == 'c') {
				System.out.print("Name: ");
				sc.nextLine();
				String name = sc.nextLine();
				System.out.print("Anual Income: ");
				Double anualIncome = sc.nextDouble();
				System.out.print("Numbers of employees: ");
				Integer employees = sc.nextInt();
				list.add(new PessoaJuridica(name, anualIncome, employees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (Pessoa p1 : list) {
			System.out.println(p1.getName() + " : $ " + String.format("%.2f", p1.tax()));
		}
		
		System.out.println();
		System.out.println("TOTAL TAXES");
		Double sum = 0.0;
		for (Pessoa p2 : list) {
			sum += p2.tax();
		}

		System.out.println(sum);
		sc.close();
	}
}
