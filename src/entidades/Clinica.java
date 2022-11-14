package entidades;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import util.CadastraDados;
import util.Gerenciador;

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
            case "1": //Cadastrar Clinica
            new CadastraDados().cadastrarClinica();
            break;

            case "2": //Listar Clinica
            System.out.println("Lista de Médicos cadastrados:");
            new CadastraDados().exibeInformacoesClinica();
            break;            
    }
        scanner.close();
        return opcao;
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
        return Objects.hash(cep, endereco);
    }

    @Override
    public String toString() {
        return cep + " - " + endereco;
    }
}
