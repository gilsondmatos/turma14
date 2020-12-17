
public class TesteAnimal {

	public static void main(String[] args) {

		Cachorro c1 = new Cachorro();
		c1.setNome("Labrador");
		c1.setIdade(5);
			
		EmitiSom sons = new EmitiSom();
		sons.registroSom(c1);
		
		System.out.println("CACHORRO");
		System.out.println("Nome: " + c1.getNome());
		System.out.println("Idade: " + c1.getIdade() + " anos");
		System.out.println("Tipo de Som: " + sons.getSom());
		System.out.println("=============================================");

		Cavalo cv1 = new Cavalo("Abissínio",10);
		sons.registroSom(cv1);
			
		System.out.println("CAVALO");
		System.out.println("Nome: " + cv1.getNome());
		System.out.println("Idade: " + cv1.getIdade() + " anos");
		System.out.println("Tipo de Som: " + sons.getSom());
		System.out.println("=============================================");
	
		Preguica p1 = new Preguica("Preguiça", 4);
		sons.registroSom(p1);
				
		System.out.println("PREGUIÇA");
		System.out.println("Nome: " + p1.getNome());
		System.out.println("Idade: " + p1.getIdade() + " anos");
		System.out.println("Tipo de Som: " + sons.getSom());
		System.out.println("=============================================");
		

	}

}
