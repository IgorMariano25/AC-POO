package entidades;

import pessoas.Medico;

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
    
    public String processaOpcoesMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String opcaoMenu = scanner.nextLine();

        switch (opcaoMenu) {
            case "1": //cliente
            while (!opcaoMenu.equals("")){
                 opcaoMenu = Cliente.processaOpcoesMenu();
                     }

            break;

            case "2": //médicos
            while (!opcaoMenu.equals("")){
                opcaoMenu = Medico.processaOpcoesMenu();
                    }

            case "3": //clínicas
            while (!opcaoMenu.equals("")){
                 opcaoMenu = Clinica.processaOpcoesMenu();
                     }

            default:
                System.out.println("Volte sempre!");
                opcaoMenu = "";
            break;
        }

        scanner.close();
        return opcaoMenu;
    }
}
