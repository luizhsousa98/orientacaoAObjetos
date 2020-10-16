package br.com.bytebank.banco;

public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	public Funcionario() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	/**
	 * Pode-se criar getters e setter, que n�o tem rela��es ao encapsulamento do
	 * atributo
	 */
	public abstract double getBonificacao();

}
