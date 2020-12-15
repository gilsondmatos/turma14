package ExerciciosLacoCondicional;

import java.util.Scanner;


public class Operarios {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		// VARIAVEIS
		String idFuncionario;
		int horasTrabalhadas = 0;
		int E = 0;
		double salarioTotal = 0.0, salarioExcedente = 0.0, salarioBase = 0.0;

		final double VALORHORANORMAL = 10.00;
		final double VALORHORAEXCEDENTE = 20.00;
		final int LIMITEHORAS = 50;

		System.out.println("Digite o codigo do funcionario: ");
		idFuncionario = leia.next();
		System.out.println("Digite a qtde de horas trabalhadas: ");
		horasTrabalhadas = leia.nextInt();

		if (horasTrabalhadas <= LIMITEHORAS) {
			salarioBase = (horasTrabalhadas * VALORHORANORMAL);
			salarioTotal = salarioBase;
		
		} else {
			E = (horasTrabalhadas - LIMITEHORAS);
			salarioBase = (LIMITEHORAS * VALORHORANORMAL);
			salarioExcedente = E * VALORHORAEXCEDENTE;
			salarioTotal = salarioBase + salarioExcedente;

		}

		System.out.println("Horas Trabalhadas: " + horasTrabalhadas + " horas");
		System.out.println("Horas excedentes: " + E + " horas");
		System.out.println("Salário base: R$ " + salarioBase);
		System.out.println("Salario excedente: R$ " + salarioExcedente);
		System.out.println("Salario total: R$ " + salarioTotal);

	}

}
