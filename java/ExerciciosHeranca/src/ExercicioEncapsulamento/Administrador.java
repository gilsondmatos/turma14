package ExercicioEncapsulamento;

public class Administrador extends Pessoa {

	public Administrador(String nome) {
		super(nome);
	}
	
	private double ajudaDeCusto;

	public double getAjudaDeCusto() {
		return ajudaDeCusto;
	}

	public void setAjudaDeCusto(double ajudaDeCusto) {
		this.ajudaDeCusto = ajudaDeCusto;
	}	
	
}
