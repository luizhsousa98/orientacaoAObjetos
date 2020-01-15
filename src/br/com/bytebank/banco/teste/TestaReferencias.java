package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.ControleBonificacao;
import br.com.bytebank.banco.EditorVideo;
import br.com.bytebank.banco.Funcionario;
/*import br.com.bytebank.banco.Funcionario;*/
import br.com.bytebank.banco.Gerente;

public class TestaReferencias {

	public static void main(String[] args) {

		// somando todas as bonificações
		Gerente g1 = new Gerente();
		g1.setNome("Luiz");
		g1.setSalario(5000.0);

		Funcionario f = new Funcionario();
		f.setSalario(2000.0);

		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);

		ControleBonificacao cb1 = new ControleBonificacao();
		cb1.registra(g1);
		cb1.registra(f);
		cb1.registra(ev);

		System.out.println(cb1.getSoma());

	}
}
