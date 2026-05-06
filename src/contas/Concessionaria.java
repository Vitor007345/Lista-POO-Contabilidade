package contas;

public class Concessionaria extends Conta{

	public Concessionaria(int dia, int mes, double valor) {
		super(dia, mes, valor);
	}

	@Override
	public double getValorAPagar(int diaPago, int mesPago) {
		return valor;
	}
	
	
	@Override 
	public String toString() {
		return super.toString().replace("Conta", "Concessionaria");
	}
	
	
}
