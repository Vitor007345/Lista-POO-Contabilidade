package contas;

public class Titulo extends Conta{
	
	public static double multaPercentual = 1.1;

	public Titulo(int dia, int mes, int valor) {
		super(dia, mes, valor);
	}

	@Override
	public double getValorAPagar(int diaPago, int mesPago) {
		if(mesPago > this.mes | (mesPago == this.mes && diaPago > this.dia)) {
			return this.valor * multaPercentual;
		}
		return valor;
	}
	
	
	
}
