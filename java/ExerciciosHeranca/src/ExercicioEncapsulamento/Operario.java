package ExercicioEncapsulamento;

public class Operario extends Pessoa {

	
	public Operario(String nome) {
		super(nome);	
	}
	private double valorProducao; //Que corresponde ao valor monet�rio dos artigos efetivamente produzidos pelo oper�rio
	private double comissao; //Que corresponde � porcentagem do valorProducao que ser� adicionado ao vencimento base do oper�rio
	
	
	
	//METODOS
	public double bonificacao () {
		
		return valorProducao*comissao;
	}
	
	void vProducao (double valor) {
		valorProducao = (valorProducao+valor);
	}
	
	void porcentagemComissao (double valor) {
		comissao = comissao + valor;
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
