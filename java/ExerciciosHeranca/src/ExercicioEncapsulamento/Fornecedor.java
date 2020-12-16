package ExercicioEncapsulamento;

import java.text.NumberFormat;
import java.util.Locale;

public class Fornecedor extends Pessoa {

	Locale real = new Locale("pt", "BR");
	NumberFormat n = NumberFormat.getCurrencyInstance(real);

	private double valorCredito;
	private double valorDivida;

	public Fornecedor(String nome, String endereço, String telefone) {
		super(nome, endereço, telefone);

	}

	void obterSaldo() {

		System.out.println("A diferença do valor é R$ " + n.format((valorCredito - valorDivida)));
	}

	public double getValorCredito() {
		return valorCredito;
	}

	public void setValorCredito(double valorCredito) {
		this.valorCredito = valorCredito;
	}

	public double getValorDivida() {
		return valorDivida;
	}

	public void setValorDivida(double valorDivida) {
		this.valorDivida = valorDivida;
	}

}