package br.com.bytebank.banco.teste;

import java.util.Locale;

import br.com.bytebank.banco.ControleBonificacao;
import br.com.bytebank.banco.Designer;
import br.com.bytebank.banco.EditorVideo;
import br.com.bytebank.banco.Funcionario;
/*import br.com.bytebank.banco.Funcionario;*/
import br.com.bytebank.banco.Gerente;

public class TestaReferencias {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		/**
		 * polimorfismo referencia genérica e objeto específico
		 */
		Funcionario f = new Gerente();
		f.setSalario(2000.0);

		Funcionario ev = new EditorVideo();
		ev.setSalario(2500.0);
		
		Funcionario d = new Designer();
		d.setSalario(2000.0);

		ControleBonificacao cb1 = new ControleBonificacao();
		cb1.registra(f);
		cb1.registra(ev);
		cb1.registra(d);

		System.out.println(String.format("%.2f", cb1.getSoma()));

	}
}
