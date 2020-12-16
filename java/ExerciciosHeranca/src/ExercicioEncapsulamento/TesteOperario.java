package ExercicioEncapsulamento;

public class TesteOperario {
	
	public static void main(String[] args) {
		
		Operario novoOperario = new Operario("Carlos Augusto Sampaio");
		
		System.out.println("Nome: " + novoOperario.getNome());
		
		novoOperario.getValorProducao();
		

		
	}

}
