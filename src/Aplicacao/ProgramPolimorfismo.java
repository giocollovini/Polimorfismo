package Aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Funcionario;
import Entidades.FuncionariosTerceiros;

public class ProgramPolimorfismo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Enter the number of Funcionarios: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Funcionario #" + i + " data:");
			System.out.print("Terceiro (y/n)? ");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Horas: ");
			int horas = sc.nextInt();
			System.out.print("Valor por Hora: ");
			double valorPorHora = sc.nextDouble();
			if (ch == 'y') {
				System.out.print("Valor Adicional: ");
				double valorAdicional = sc.nextDouble();
				list.add(new FuncionariosTerceiros(nome, horas, valorPorHora, valorAdicional));
			}
			else {
				list.add(new Funcionario(nome, horas, valorPorHora));
			}
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS:");
		for (Funcionario emp : list) {
			System.out.println(emp.getNome() + " - $ " + String.format("%.2f", emp.Pagamento()));
		}
		
		sc.close();
	}

}
