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
	
	
	
	
}
