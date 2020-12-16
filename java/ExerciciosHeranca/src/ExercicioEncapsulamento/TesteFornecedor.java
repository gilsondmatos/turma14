package ExercicioEncapsulamento;

import java.text.NumberFormat;
import java.util.Locale;

public class TesteFornecedor {

	public static void main(String[] args) {
		
		Locale real = new Locale("pt", "BR");
		NumberFormat n = NumberFormat.getCurrencyInstance(real);

		Fornecedor forn01 = new Fornecedor("Antonio LTDA", "Rua Iratinga, 420 - São Paulo", "11 98773-8731");
		System.out.println("Fornecedor: " + forn01.getNome());
		System.out.println("Endereço: " + forn01.getEndereço());
		System.out.println("Whatsapp: " + forn01.getTelefone());

		forn01.setValorCredito(10000);
		forn01.setValorDivida(5000);

		System.out.println("----------------------------------------");
		System.out.println("Crédito " + n.format(forn01.getValorCredito()));
		System.out.println("Divida " + n.format(forn01.getValorDivida()));
		System.out.println("----------------------------------------");

		forn01.obterSaldo();
		System.out.println("----------------------------------------");

	}

}
