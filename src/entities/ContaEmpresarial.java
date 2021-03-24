package entities;

public class ContaEmpresarial extends Conta{
	private Double limite;
	
	public ContaEmpresarial() {
		super();
	}

	public ContaEmpresarial(Integer numero, String titular, Double saldo, Double limite) {
		super(numero, titular, saldo);
		this.limite = limite;
	}

	public Double getLimite() {
		return limite;
	}

	public void setLimite(Double limite) {
		this.limite = limite;
	}
	
	public void emprestimo(double valor) {
		if(valor <= limite) {
			saldo += valor;
		}else {
			System.out.println("Valor maior que o seu limite.");
		}
	}
	
	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		saldo -= 2.0;
	}
}
