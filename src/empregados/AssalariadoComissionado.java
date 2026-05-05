package empregados;

public class AssalariadoComissionado extends Comissionado{
	public static double percentualBonus = 1.1;

	public AssalariadoComissionado(String nome, String sobrenome, int numIdent, double valorVendas) {
		super(nome, sobrenome, numIdent, valorVendas);
	}

	@Override
	public double getValorAPagar(int diaPago, int mesPago) {
		return (SALARIO * percentualBonus) + super.getValorAPagar(diaPago, mesPago);
	}
	
	
	
}
