package empregados;

public class Assalariado extends Empregado{
	private double horasExtras;

	public Assalariado(String nome, String sobrenome, int numIdent, double horasExtras) {
		super(nome, sobrenome, numIdent);
		this.horasExtras = horasExtras;
	}

	public double getHorasExtras() {
		return horasExtras;
	}

	public void setHorasExtras(double horasExtras) {
		this.horasExtras = horasExtras;
	}

	@Override
	public double getValorAPagar(int diaPago, int mesPago) {
		return SALARIO + (this.getHorasExtras() * HORA);
	}
	
	
	
}
