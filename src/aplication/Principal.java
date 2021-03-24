package aplication;

import entities.Conta;
import entities.ContaEmpresarial;
import entities.ContaPoupanca;

public class Principal {

	public static void main(String[] args) {
		// Realizando operações bancária
		Conta acc1 = new Conta(1001, "Jorge Paulo", 1000.0);
		acc1.sacar(200.0);
		System.out.println(acc1.getSaldo());
		
		Conta acc2 = new ContaPoupanca(1002, "Jorge Paulo", 1000.0, 0.01);
		acc2.sacar(200.0);
		System.out.println(acc2.getSaldo());
		
		Conta acc3 = new ContaEmpresarial(1003, "JPBS", 1000.0, 2000.0);
		acc3.sacar(200);
		
		System.out.println(acc3.getSaldo());

	}

}
