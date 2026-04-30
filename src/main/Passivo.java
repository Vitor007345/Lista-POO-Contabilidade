package main;

public interface Passivo {
	public static final double SALARIO = 1621;
	public static final double HORA = 65;
	public abstract double getValorAPagar(int diaPago, int mesPago);
}
