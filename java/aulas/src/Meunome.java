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
		
		System.out.print("Digite o nome do usu�rio: " );
		nome = leia.next();
		
		System.out.print("Qual o seu gen�ro: " );
		sexo = leia.next().charAt(0);
			
		System.out.print("Valor Sal�rio: " );
		salario = leia.nextDouble();
		
		System.out.print("Em que ano voc� nasceu: " );
		anoNascimento = leia.nextInt();
		
		
		
		System.out.print("Voc� tem: "+(anoAtual-anoNascimento+" Anos"));
		
	
		leia.close();
	}
}
