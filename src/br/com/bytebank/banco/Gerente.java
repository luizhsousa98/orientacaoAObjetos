package br.com.bytebank.banco;

public class Gerente extends Funcionario {

	private String login;
	private int senha;

	public boolean autentica(int senha) {

		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	// Sobrecarga
	public boolean autentica(String login, int senha) {

		if (this.login == login && this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}

	// Sobreeescrevendo meu método bonificação da classe mãe
	/*
	 * @Override public double getBonificacao() { // acessando direto o atributo
	 * salario, referencia a instancia dela mesma return this.salario; }
	 */

	public double getBonificacao() {
		// referencia a superclasse
		return super.getBonificacao() + super.getSalario();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

}
