package br.com.bytebank.banco.teste;
import br.com.bytebank.banco.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {

		Funcionario f1 = new Funcionario();

		f1.setNome("Luiz Henrique");
		f1.setCpf("223355678- 9");
		f1.setSalario(2600.00);
		
		System.out.println(f1.getNome());
		System.out.println(f1.getBonificacao());
	}
}
