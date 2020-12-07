import java.util.Scanner;

public class Meunome {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
	
		//Variaveis
		
		String nome;
		char sexo;
		double salario;
		int anoNascimento;
		int anoAtual = 2020;
		
		System.out.print("Digite o nome do usuário: " );
		nome = leia.next();
		
		System.out.print("Qual o seu genêro: " );
		sexo = leia.next().charAt(0);
			
		System.out.print("Valor Salário: " );
		salario = leia.nextDouble();
		
		System.out.print("Em que ano você nasceu: " );
		anoNascimento = leia.nextInt();
		
		
		
		System.out.print("Você tem: "+(anoAtual-anoNascimento+" Anos"));
		
	
		leia.close();
	}
}
