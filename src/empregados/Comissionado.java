package empregados;

public class Comissionado extends Empregado{
	private static double percentualSobreVendas = 1.06;
	private double valorVendas;
	public Comissionado(String nome, String sobrenome, int numIdent, double valorVendas) {
		super(nome, sobrenome, numIdent);
		this.valorVendas = valorVendas;
	}
	
	public double getValorVendas() {
		return valorVendas;
	}
	public void setValorVendas(double valorVendas) {
		this.valorVendas = valorVendas;
	}

	@Override
	public double getValorAPagar(int diaPago, int mesPago) {
		return this.valorVendas * percentualSobreVendas;
	}
	
	
	
	
	
	
}
