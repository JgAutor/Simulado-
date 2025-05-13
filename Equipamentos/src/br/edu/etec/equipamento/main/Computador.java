package br.edu.etec.equipamento.main;

public class Computador extends Equipamentos {
    private String processador;
    
    public Computador(String nome, String modelo, String processador) {
        super(nome, modelo);
        this.processador = processador;
    }
    
    @Override
    public void exibirDados() {
        System.out.println("O equipamento de nome: " + nome + ", possuí o modelo: " + modelo + ". O processador do equipamento é " + processador);
    }
}
