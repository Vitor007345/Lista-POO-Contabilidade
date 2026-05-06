package contas;

import main.Passivo;

public abstract class Conta implements Passivo{
	protected int dia;
	protected int mes;
	protected double valor;
	
	
	
	public Conta(int dia, int mes, double valor) {
		this.dia = dia;
		this.mes = mes;
		this.valor = valor;
	}
	
	//getters
	public int getDia() {
		return dia;
	}
	public int getMes() {
		return mes;
	}
	public double getValor() {
		return valor;
	}
	
	
	//setters
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Conta: {dia=" + this.getDia() + ", mes=" + this.getMes() + ", valor=" + this.getValor() + "}";
	}
	
	
	
}
