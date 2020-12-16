package ExercicioEncapsulamento;

import java.text.NumberFormat;
import java.util.Locale;

public class TesteEmpregado {

	public static void main(String[] args) {
		
		Locale real = new Locale("pt", "BR");
		NumberFormat n = NumberFormat.getCurrencyInstance(real);

		
		Empregado empregado001 = new Empregado("Gilson Amorim de Matos");
		
		empregado001.setCodigoSetor(100);
		
		System.out.println("Código Setor: " + empregado001.getCodigoSetor());
		System.out.println("Colaborador: " + empregado001.getNome());
		
		
		System.out.println("Salário base: " + n.format(empregado001.getSalarioBase()));
		System.out.println("Impostos: " + n.format(empregado001.calcularSalario()));
		System.out.println("Salário Liquido: " + n.format(empregado001.getSalarioBase()-empregado001.calcularSalario()));
		
		
		
		
		

	}

}
