package contas;

public class Concessionaria extends Conta{

	public Concessionaria(int dia, int mes, int valor) {
		super(dia, mes, valor);
	}

	@Override
	public double getValorAPagar(int diaPago, int mesPago) {
		return valor;
	}
	
	
	
}
