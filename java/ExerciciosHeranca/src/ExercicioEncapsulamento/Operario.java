package ExercicioEncapsulamento;

public class Operario extends Pessoa {

	public Operario(String nome) {
		super(nome);	
	}
	private double valorProducao; //Que corresponde ao valor monetário dos artigos efetivamente produzidos pelo operário
	private double comissao; //Que corresponde à porcentagem do valorProducao que será adicionado ao vencimento base do operário
	
	
	public double bonificacao () {
		
		return valorProducao*comissao;
	}
	
	
	//ENCAPSULAMENTO
	public double getValorProducao() {
		return valorProducao;
	}
	public void setValorProducao(double valorProducao) {
		this.valorProducao = valorProducao;
	}
	public double getComissao() {
		return comissao;
	}
	public void setComissao(double comissao) {
		this.comissao = comissao;
	}
	
	

}
