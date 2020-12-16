package ExercicioEncapsulamento;

import java.text.NumberFormat;
import java.util.Locale;

public class Empregado extends Pessoa{
	
	
	public Empregado(String nome) {
	super(nome);
	}
	
	
	private int codigoSetor;
	private double salarioBase = 2500;// (vencimento base)
	private double imposto = 0.2;// (porcentagem retida dos impostos). 
	
	
	public double calcularSalario () {
		return this.salarioBase*imposto;
	}
	
	//ENCAPSULAMENTO
	public int getCodigoSetor() {
		return codigoSetor;
	}
	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getImposto() {
		return imposto;
	}
	public void setImposto(double imposto) {
		this.imposto = imposto;
	}
	

}
