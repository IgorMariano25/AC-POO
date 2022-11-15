package entidades;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import util.CadastraDados;

public class Clinica {
    private String cepClinica;
    private String enderecoClinica;
    private String cnpjClinica;
    private String telefoneClinica;

    public Clinica(String cepClinica) {
        this.cepClinica = cepClinica;
        this.enderecoClinica = "";
        this.cnpjClinica = "";
        this.telefoneClinica = "";
    }

    public Clinica() {
        this.cepClinica = cepClinica;
        this.enderecoClinica = enderecoClinica;
        this.cnpjClinica = cnpjClinica;
        this.telefoneClinica = cnpjClinica;
    }

    public static void exibeOpcoesMenu() {
        System.out.println("\n===================================");
        System.out.println("       Menu de opções Clinica     ");
        System.out.println("===================================");
        System.out.println("1 - Cadastrar clinica");
        System.out.println("2 - Exibir clinica cadastrada");
        System.out.println("Qualquer outra tecla - Sair do programa");
        System.out.print("\nInforme a opção desejada: ");
    }

    public static String processaOpcoesMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String opcaoMenu = scanner.nextLine();
        switch (opcaoMenu){
            case "1": 
            new CadastraDados().cadastrarClinica();
            break;

            case "2":
            new CadastraDados().exibeInformacoesClinica();
            break;
    }
        scanner.close();
        return opcaoMenu;
}

    @Override
    public boolean equals(Object object) {
        if (object == this)
            return true;
        if (!(object instanceof Clinica)) {
            return false;
        }
        Clinica clinica = (Clinica) object;
        return Objects.equals(cepClinica, clinica.cepClinica) && 
        Objects.equals(enderecoClinica, clinica.enderecoClinica) && 
        Objects.equals(cnpjClinica, clinica.cnpjClinica) && 
        Objects.equals(telefoneClinica, clinica.telefoneClinica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cepClinica, enderecoClinica, cnpjClinica, telefoneClinica);
    }

    @Override
    public String toString() {
        return 
            "CEP: " + cepClinica + "\n" +
            "Endereço: " + enderecoClinica + "\n" +
            "CNPJ: " + cnpjClinica + "\n" +
            "Telefone: " + telefoneClinica;
    }
}
