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
	
	@Override
	public String toString() {
		String str = super.toString().replace("Empregado", "Assalariado");
		str = str.substring(0, str.length() - 1);
		str += ", horasExtras=" + this.getHorasExtras() + "}";
		return str;
	}
	
	
}
