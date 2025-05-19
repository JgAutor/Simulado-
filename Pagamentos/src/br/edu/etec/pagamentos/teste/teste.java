package br.edu.etec.pagamentos.teste;

import br.edu.etec.pagamentos.main.PgarCartao;

public class teste {
    public static void main(String[] args) {
        PgarCartao pagamento = new PgarCartao(150.0, "1234567890123456");

        System.out.println("Antes do processamento:");
        pagamento.exibirStatus();

        pagamento.processarPagamento();

        System.out.println("Após o processamento:");
        pagamento.exibirStatus();
    }
}
