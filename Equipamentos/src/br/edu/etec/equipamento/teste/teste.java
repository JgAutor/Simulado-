package br.edu.etec.equipamento.teste;

import br.edu.etec.equipamento.main.Computador;
import br.edu.etec.equipamento.main.Equipamentos;

public class teste {
    public static void main(String[] args) {
        Equipamentos equip1 = new Equipamentos("Mouse","Redragon Cobra");
        Equipamentos equip2 = new Equipamentos("Teclado Mecânico","Gamer Switch Blue");
        Equipamentos equip3 = new Equipamentos("Monitor","LG 34");
        //
        Computador comp1 = new Computador("PC Gamer", "Alienware Aurora", "Intel® Core™ Ultra 9 285K");
        Computador comp2 = new Computador("PC Gamer", "TITAN AMD", "Nvidia Ge Force Rtx 3060");
        Computador comp3 = new Computador("PC Gamer", "Workstation Precision 3680", "14ª geração Intel® Core™ i7-14700");
        //
        equip1.exibirDados();
        comp1.exibirDados();
    }    
}