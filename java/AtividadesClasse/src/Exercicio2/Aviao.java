package Exercicio2;

public class Aviao {
	String modelo;
	String empresa;
	double velocidadeAtual;
	double velocidadeDecolagem;

	public void liga() {
		System.out.println("Tudo pronto para decolar, todos procedimentos ligados!");
	}

		public void decola (double velocidade) {
		double velocidadeNova = this.velocidadeAtual + velocidade;
		this.velocidadeAtual = velocidade;
				
		}
		public void viaje() {
			
			if(this.velocidadeAtual < 0) {
				System.out.println("Está com medo! Assim não viajamos!");
			}
			
			else if(this.velocidadeAtual >=0 && this.velocidadeAtual<100) {
				System.out.println("Reze 40 Ave Maria");
			}
			else if(this.velocidadeAtual >=100 && this.velocidadeAtual<350) {
				System.out.println("Feche os olhos - E cante - Segure na mão de Deus");
			}
			else if(this.velocidadeAtual <= 360) {
				System.out.println("Prontos para decolar! Decolando.....");
				System.out.println("Vá ao banheiro se limpar!");	
			}else {
				System.out.println("Avião saiu da pista de decolagem!");
				System.out.println("Booom! Que tragédia! ");
				
			}
				

	}
}

