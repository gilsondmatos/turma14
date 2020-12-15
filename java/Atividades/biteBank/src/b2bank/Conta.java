package b2bank;

public class Conta {

	private double saldo; // Nasce desce tipo e morreu desce tipo //double tem perda de precisão
	private int agencia;
	private String numero;
	Cliente titular;
	
	// Deposita
	public void deposita(double valor) {

		this.saldo += valor;
	}
	//Saca
	public void saca(double valor) {

		this.saldo -=valor;
	
		}

	
	/*public boolean transfere (double valor, Conta destino){
		
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	*/
	
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
		
	
	
	


