
public class Animal {

	private String nome;
	private int idade;
	private String som;
	private boolean corre;

	public Animal() {

	}

	//CONSTRUTORES
	public Animal(String nome, int idade, String som, boolean corre) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.som = som;
		this.corre = corre;
	}

	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}
	
	//METODOS
	public String getEmitiSom() {
		return this.som;
	}
	
	// ENCAPSULAMENTO
	
	public void setSom(String som) {
		this.som = som;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

		public boolean isCorre() {
		return corre;
	}

	public void setCorre(boolean corre) {
		this.corre = corre;
	}


}
