package br.edu.etec.usersystem.teste;

import br.edu.etec.usersystem.main.NivelAcesso;
import br.edu.etec.usersystem.main.Usuario;

public class teste {
    public static void main(String[] args) {
        Usuario admin = new Usuario("admin", "123456", NivelAcesso.ADMIN);

        boolean autenticado = admin.autenticar("123456");
        System.out.println("Usuário autenticado? " + autenticado);
        System.out.println("Nível de acesso: " + admin.getNivel());

        admin.desativar();
        boolean autenticadoAposDesativar = admin.autenticar("123456");
        System.out.println("Usuário autenticado após desativação? " + autenticadoAposDesativar);
    }
}
