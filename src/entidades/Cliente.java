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

    public static void exibeOpcoesMenu() {
        System.out.println( "\nSistema de agendamento de consultas");
        System.out.println( "Informe a opção desejada:");
        System.out.println( "1 - Cadastrar paciente");
        System.out.println( "2 - Exibir pacientes cadastrados");
        System.out.println( "3 - Cadastrar médico");
        System.out.println(" 4 - Exibir Médicos cadastrados");
        System.out.println( "5 - Cadastrar clinica");
        System.out.println(" 6 - Exibir clinica cadastrada");
        System.out.println( "Qualquer outra tecla - Sair do programa");
    }

    public static String processaOpcoesMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.nextLine();
        String opcaoMenu = "0";
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
        return opcao;
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
