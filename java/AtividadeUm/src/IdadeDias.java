import java.util.Scanner;

public class IdadeDias {
	
	
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade, meses, dias, idadeDias;
		int diasAno = 365;
		
		System.out.println("Digite sua idade (Em anos):");
		idade = leia.nextInt();
		
		System.out.println("Quantos meses se passaram ap�s o seu �ltimo anivers�rio: ");
		meses = leia.nextInt();
		
		System.out.println("Quantos dias se passaram ap�s a resposta anterior: ");
		dias = leia.nextInt();
		
		idadeDias = ((idade*diasAno) + (meses*30) + dias);
		
		System.out.println("Sua idade em dias �: " + idadeDias);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
