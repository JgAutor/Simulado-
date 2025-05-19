package br.edu.etec.pagamentos.main;

public abstract class Pagamentos {
    protected double valor;
    protected Status status;

    public Pagamentos(double valor) {
        this.valor = valor;
        this.status = Status.PENDENTE;
    }

    public abstract void processarPagamento();

    public void exibirStatus() {
        System.out.println("Status do pagamento: " + status);
    }
}

