package entidades;

import pessoas.Medico;

import java.io.IOException;
import java.util.Scanner;

public class Gerenciador {
    private Scanner scanner;

    public String lerTexto() {
        return scanner.nextLine();
    }
    public static void exibeOpcoesMenu() {
        System.out.println("===================================");
        System.out.println("           Menu de opções          ");
        System.out.println("===================================");
        System.out.println("1 - Cliente- (Paciente)");
        System.out.println("2 - Médicos");
        System.out.println("3 - Clínica");
        System.out.println("Qualquer outra tecla - Sair do programa");
        System.out.print("\nInforme a opção desejada: ");
    }
    
    public String processaOpcoesMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String opcaoMenu = scanner.nextLine();

        switch (opcaoMenu) {
            case "1": //cliente
            while (!opcaoMenu.equals("")){
                 opcaoMenu = Cliente.processaOpcoesMenu();
                     }

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
