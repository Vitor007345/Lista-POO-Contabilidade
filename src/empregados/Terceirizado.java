package empregados;

public class Terceirizado extends Empregado{
	private double horasTrabalhadas;

	public Terceirizado(String nome, String sobrenome, int numIdent, double horasTrabalhadas) {
		super(nome, sobrenome, numIdent);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double getValorAPagar(int diaPago, int mesPago) {
		return horasTrabalhadas * HORA;
	}

	@Override
	public String toString() {
		String str = super.toString().replace("Empregado", "Terceirizado");
		str = str.substring(0, str.length() - 1);
		str += ", horasTrabalhadas=" + this.getHorasTrabalhadas() + "}";
		return str;
	}
	
	
	
	
	
	
}
