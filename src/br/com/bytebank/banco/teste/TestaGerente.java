package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		Gerente g2 = new Gerente();

		g1.setNome("Luiz");
		g1.setCpf("235567413");
		g1.setSalario(1100.0);

		// Para atribuir informações indenticas nas senhas utilizar setSenha

		g1.setSenha(11200);

		boolean autenticou = g1.autentica(11200);
		System.out.println(autenticou);

		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.getBonificacao());

		System.out.println();
		System.out.println("Autenticando login e senha");

		g2.setNome("Luiz Henrique de Sousa");
		g2.setCpf("123.456.789-1");
		g2.setSalario(1200.00);
		g2.setLogin("lhsousa");
		g2.setSenha(1234);

		boolean autenticacao = g2.autentica("lhsousa", 1234);
		System.out.println(autenticacao);

		System.out.println(g2.getNome());
		System.out.println(g2.getCpf());
		System.out.println(g2.getSalario());
		System.out.println(g2.getBonificacao());

	}

}
