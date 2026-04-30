package contas;

import main.Passivo;

public abstract class Conta implements Passivo{
	protected int dia;
	protected int mes;
	protected int valor;
	
	
	
	public Conta(int dia, int mes, int valor) {
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
	public int getValor() {
		return valor;
	}
	
	
	//setters
	public void setDia(int dia) {
		this.dia = dia;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	
}
