package entidades;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import util.CadastraDados;

public class Cliente {
    private String cpf;
    private String nome;

    public Cliente(String cpf) {
        this.cpf = cpf;
        this.nome = "";
    }

    public Cliente(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    public Cliente() {
    }

    public static void exibeOpcoesMenu() {
        System.out.println("\n===================================");
        System.out.println("       Menu de opções Cliente      ");
        System.out.println("===================================");
        System.out.println( "1 - Cadastrar paciente");
        System.out.println( "2 - Exibir pacientes cadastrados");
        System.out.println( "Qualquer outra tecla - Sair do programa");
        System.out.print("\nInforme a opção desejada: ");
    }

    public static String processaOpcoesMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String opcaoMenu = scanner.nextLine();
        switch (opcaoMenu){
            case "1": //Cadastrar Médico
            new CadastraDados().cadastrarPaciente();
            break;

            case "2": //Listar Médicos
            System.out.println("Lista de Médicos cadastrados:");
            new CadastraDados().exibeInformacoesPaciente();
            break;
    }
        scanner.close();
        return opcaoMenu;
}

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Cliente)) {
            return false;
        }
        Cliente cliente = (Cliente) obj;
        return cliente.cpf.equals(this.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome);
    }

    @Override
    public String toString() {
        return cpf + " - " + nome;
    }
}
