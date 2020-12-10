package biteBank;

public class CriaConta {

	public static void main(String[] args) {
		
		//Criando mecanismo de referência
		Conta primeiraConta = new Conta();//Criou um objeto do tipo conta
		
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta();
		segundaConta.saldo = 100;
		System.out.println(segundaConta.saldo);
		
	
	}

}
