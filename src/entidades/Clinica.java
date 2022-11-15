package entidades;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import util.CadastraDados;

public class Clinica {
    private String cep;
    private String endereco;

    public Clinica(String cep) {
        this.cep = cep;
        this.endereco = "";
    }

    public Clinica(String cep, String endereco) {
        this.cep = cep;
        this.endereco = endereco;
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
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Clinica)) {
            return false;
        }
        Clinica clinica = (Clinica) obj;
        return clinica.cep.equals(this.cep);
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
