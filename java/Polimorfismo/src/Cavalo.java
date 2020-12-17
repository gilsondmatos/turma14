
public class Cavalo extends Animal {
	
	private String Cavalo;
	
	public Cavalo(String nome, int idade) {
		super(nome, idade);
	}

	public Cavalo() {
		super();
	}
	
	public String getEmitiSom() {
		String somCavalo = "Rudigo - Resfôlego - Guincho";
		return somCavalo;

	}
}
