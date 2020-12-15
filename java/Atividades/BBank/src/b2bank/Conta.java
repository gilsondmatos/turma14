package b2bank;

public class Conta {

	private double saldo; 
	private String numero;
	private String cpf;
	Cliente titular;
	
	// Deposita
	public void deposita(double valor) {

		this.saldo += valor;
	}
	//Saca
	public void saca(double valor) {

		this.saldo -=valor;
	
		}

		
	public double getSaldo() {
		return this.saldo;
	
	}
	
	public String getNumero() {
		
		return this.numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
}
		
	
	
	


