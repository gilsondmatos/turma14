package ExercicioEncapsulamento;

import java.text.NumberFormat;
import java.util.Locale;

public class TesteOperario {
	
	public static void main(String[] args) {
		
		Locale real = new Locale("pt", "BR");
		NumberFormat n = NumberFormat.getCurrencyInstance(real);
		
		Operario novoOperario = new Operario("Carlos Augusto Sampaio");
		
		double salarioBase = 2500;
		
		novoOperario.setValorProducao(500);
		novoOperario.setComissao(0.2);	
		
		System.out.println("Oper�rio: " + novoOperario.getNome());
		
	
		System.out.println("Valor de Produc�o: " + n.format(novoOperario.getValorProducao()));
		System.out.println("Comiss�o: " + n.format(novoOperario.bonificacao()));
		System.out.println("Sal�rio m�s: " + n.format(salarioBase + novoOperario.bonificacao()));
		

		
	}

}
