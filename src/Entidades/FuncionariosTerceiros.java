package Entidades;

public class FuncionariosTerceiros extends Funcionario {
	
	private double valorAdicional;

	public FuncionariosTerceiros() {
		super();
	}

	public FuncionariosTerceiros(String nome, Integer horas, Double valorHora, double valorAdicional) {
		super(nome, horas, valorHora);
		this.valorAdicional = valorAdicional;
	}
	
	@Override
	public double Pagamento() {
		return super.Pagamento() + valorAdicional * 1.1;
	}
	
}
