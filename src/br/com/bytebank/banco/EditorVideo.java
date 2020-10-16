package br.com.bytebank.banco;

public class EditorVideo extends Funcionario {
	
	@Override
    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Editor de Video");
        return 100.00;

    }

}
