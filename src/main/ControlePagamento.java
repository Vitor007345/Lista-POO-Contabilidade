package main;

import java.util.ArrayList;
import contas.Conta;
import empregados.Empregado;

public class ControlePagamento {
	private ArrayList<Passivo> pagamentos;
	
	public ControlePagamento() {
		this.pagamentos = new ArrayList<>();
	}
	
	public ControlePagamento(ArrayList<Passivo> pagamentos) {
		this.pagamentos = pagamentos;
	}
	
	
	public boolean addPagamento(Passivo pagamento) {
		return this.pagamentos.add(pagamento);
	}
	
	public Passivo removePagamento(int index) {
		return this.pagamentos.remove(index);
	}
	
	private interface CondicaoPassivo {
		public boolean isTrue(Passivo p);
	}
	
	private double calcularPagamentoIf(int diaPago, int mesPago, CondicaoPassivo cond) {
		double pagamento = 0;
		for(Passivo p : this.pagamentos) {
			if(cond.isTrue(p)) {
				pagamento += p.getValorAPagar(diaPago, mesPago);
			}
		}
		return pagamento;
	}
	
	public double calcularPagamentoContas(int diaPago, int mesPago){
		return calcularPagamentoIf(diaPago, mesPago, (p)->p instanceof Conta);
	}
	
	public double calcularPagamentoEmpregados(int diaPago, int mesPago){
		return calcularPagamentoIf(diaPago, mesPago, (p)->p instanceof Empregado);
	}
	
	public double calcularPagamentoTotal(int diaPago, int mesPago) {
		double pagamento = 0;
		for(Passivo p : this.pagamentos) {
			pagamento += p.getValorAPagar(diaPago, mesPago);
		}
		return pagamento;
	}
	
	public String listPagamentos(int diaPago, int mesPago) {
		String str = "Todos passivos: \n";
		for(Passivo p : this.pagamentos) {
			str += p.toString() + ", Valor:" + p.getValorAPagar(diaPago, mesPago) +"\n";
		}
		return str;
	}
	
	
	@Override
	public String toString() {
		String str = "Todos passivos: \n";
		for(Passivo p : this.pagamentos) {
			str += p.toString() + "\n";
		}
		return str;
	}
	
	
}
