package br.edu.etec.pagamentos.main;

public class PgarCartao extends Pagamentos {
    private String numCartao;

    public PgarCartao(double valor, String numCartao) {
        super(valor);
        this.numCartao = numCartao;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Processando pagamento com cartão...");
        status = Status.PROCESSANDO;

        // Simula tempo de processamento
        try {
            Thread.sleep(1000); // 1 segundo
        } catch (InterruptedException e) {
            status = Status.FALHA;
            System.out.println("Erro no processamento.");
            return;
        }

        status = Status.CONCLUIDO;

        String ultimos4 = numCartao.length() >= 4
                ? numCartao.substring(numCartao.length() - 4)
                : numCartao;

        System.out.println("Pagamento concluído com cartão final " + ultimos4);
    }
}
