package util;

import pessoas.Medico;
import entidades.Cliente;
import entidades.Clinica;

import java.io.IOException;
import java.util.Scanner;

public class Gerenciador {
    private Scanner scanner;
    public static void exibeOpcoesMenu() {
        System.out.println("\nSistema de agendamento de consultas");
        System.out.println("Informe a opção desejada:");
        System.out.println("1 - Cadastrar paciente");
        System.out.println("2 - Exibir pacientes cadastrados");
        System.out.println("3 - Cadastrar médico");
        System.out.println("4 - Exibir Médicos cadastrados");
        System.out.println("5 - Cadastrar clinica");
        System.out.println("6 - Exibir clinica cadastrada");
        System.out.println("Qualquer outra tecla - Sair do programa");
    }
    
    public String lerTexto() {
        return scanner.nextLine();
    }
    
    public static String processaOpcoesMenu() throws IOException {
         Scanner scanner = new Scanner(System.in);
        String opcao = scanner.nextLine();
        String opcaoMenu = "0";

        switch (opcaoMenu) {
            case "1": //cliente
            while (!opcaoMenu.equals("")){
                 Cliente.exibeOpcoesMenu();
                 opcaoMenu = Cliente.processaOpcoesMenu();
                     }

            //break;

            case "2": //médicos
            while (!opcaoMenu.equals("")){
                Medico.exibeOpcoesMenu();
                opcaoMenu = Medico.processaOpcoesMenu();
                    }

            case "3": //clínicas
            while (!opcaoMenu.equals("")){
                 Clinica.exibeOpcoesMenu();
                 opcaoMenu = Clinica.processaOpcoesMenu();
                     }

            default:
                System.out.println("Volte sempre!");
                opcao = "";
            break;
        }

        return opcao;
    }
}
