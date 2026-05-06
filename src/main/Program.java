package main;

import java.util.Scanner;

import empregados.*;
import contas.*;

import menu.Menu;


public class Program {
	
	public static Scanner sc = new Scanner(System.in);
	
	public static int askUserDiaPagamento() {
		System.out.println("Digite o dia do pagamento: ");
		return sc.nextInt();
	}
	public static int askUserMesPagamento() {
		System.out.println("Digite o mes do pagamento: ");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		ControlePagamento ctrlPag = new ControlePagamento();
		ctrlPag.addPagamento(new Terceirizado("Jacinto", "Souza", 9, 34.3));
		ctrlPag.addPagamento(new Comissionado("Josoares", "Silva", 11, 450.7));
		ctrlPag.addPagamento(new AssalariadoComissionado("Joaquim", "Carvalho", 69, 346.8));
		ctrlPag.addPagamento(new Assalariado("Juvenal", "Gomes", 67, 3.2));
		ctrlPag.addPagamento(new Titulo(11, 9, 121.5));
		ctrlPag.addPagamento(new Concessionaria(12, 2, 231.6));
		
		Menu menuPrincipal = new Menu("Menu-Principal");
		menuPrincipal.addOption("Sair do programa", ()->{});
		menuPrincipal.addOption("Listar pagamentos", ()->{
			int dia = askUserDiaPagamento();
			int mes = askUserMesPagamento();
			sc.nextLine();
			System.out.println(ctrlPag.listPagamentos(dia, mes));
			System.out.println("\n===Total empregados: " + ctrlPag.calcularPagamentoEmpregados(dia, mes));
			System.out.println("===Total contas: " + ctrlPag.calcularPagamentoContas(dia, mes));
			System.out.println("\n===Total: " + ctrlPag.calcularPagamentoTotal(dia, mes) + "\n");
			menuPrincipal.start();
		});
		menuPrincipal.addOption("Ver Total empregados", ()->{
			int dia = askUserDiaPagamento();
			int mes = askUserMesPagamento();
			sc.nextLine();
			System.out.println("\n===Total empregados: " + ctrlPag.calcularPagamentoEmpregados(dia, mes) + "\n");
			menuPrincipal.start();
		});
		
		menuPrincipal.addOption("Ver Total contas", ()->{
			int dia = askUserDiaPagamento();
			int mes = askUserMesPagamento();
			sc.nextLine();
			System.out.println("\n===Total contas: " + ctrlPag.calcularPagamentoContas(dia, mes) + "\n");
			menuPrincipal.start();
		});
		
		menuPrincipal.addOption("Ver Total empregados", ()->{
			int dia = askUserDiaPagamento();
			int mes = askUserMesPagamento();
			sc.nextLine();
			System.out.println("\n===Total: " + ctrlPag.calcularPagamentoTotal(dia, mes) + "\n");
			menuPrincipal.start();
		});
		
		menuPrincipal.start();
		
	}

}
