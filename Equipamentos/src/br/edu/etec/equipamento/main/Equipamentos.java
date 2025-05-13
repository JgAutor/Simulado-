package br.edu.etec.equipamento.main;

public class Equipamentos {
    String nome;
    String modelo;
    
    public Equipamentos(String nome, String modelo) {
        this.nome = nome;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public void exibirDados() {
        System.out.println("O equipamento de nome: " + nome + ", possuí o modelo: " + modelo);
    }
}