package br.com.bytebank.banco;

public class Designer extends Funcionario {

    public double getBonificacao() {
        System.out.println("Chamando o método de bonificacao do Designer");
        return 200.0;
    }
}
