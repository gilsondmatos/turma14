
public class EmitiSom {

	private String somAnimal;

	public void registroSom(Animal a) {
		String somEmitido = a.getEmitiSom();
		this.somAnimal = somEmitido;

	}

	public String getSom() {
		return this.somAnimal;

	}
}
