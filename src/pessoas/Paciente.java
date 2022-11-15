package pessoas;
import java.time.LocalDate;

import clinica.Endereco;
import util.PlanoSaude;
import util.Telefone;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import util.CadastraDados;

public class Paciente extends Pessoa {
    private String dataNascimento;
    private boolean planoParticular;
    private String plano;
    private String endereco;

    public Paciente(String nome, String cpf, String eMail, Telefone[] telefones) {
        super(cpf, telefones);
        this.dataNascimento = "";
        this.planoParticular = "" != null;
        this.plano = "";
        this.endereco = "";
    }

    public Paciente(String nome, String cpf, String eMail, String dataNascimento) {
        super(nome, cpf, eMail);
        this.dataNascimento = dataNascimento;
        this.planoParticular = false;
    }

    public void cadastraPlano(String plano) {
        this.planoParticular = true;
        this.plano = plano;
    }

    public void cadastraEndereco(String[] Endereco) {
        List<String> endereco = new ArrayList<String>();
        Scanner adicionaEndereco = new Scanner(System.in);
        do {
            System.out.println("Endereço atual: " + endereco);
            System.out.println("Complemento: (sim/não)");
            if (adicionaEndereco.next().startsWith("s")) {
                System.out.println("Complemento: ");
                endereco.add(adicionaEndereco.next());
            } else {
                break;
            }
        } while (true);
        adicionaEndereco.close();
        System.out.println("Endereço: " + endereco);
        String[] arr = endereco.toArray(new String[0]);
        System.out.println("Endereço: " + Arrays.toString(arr));
    }

    public boolean getPlanoParticular() {
        return this.planoParticular;
    }

    @Override
    public void exibeInfo() {
        String msg = "";

        msg += "Nome: " + this.nome + "\n";
        msg += "Data de nascimento: " + this.dataNascimento + "\n";
        msg += "E-mail: " + this.eMail + "\n";
        msg += "CPF: " + this.cpf + "\n";
        msg += "Telefones:" + "\n";
        msg += "Plano de Saúde: " + this.plano;
        msg += "Endereço: " + this.endereco;
        msg += this.listaTelefones();
        System.out.println(msg);
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
            case "1": 
            new CadastraDados().cadastrarPaciente();
            break;

            case "2": 
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
        if (!(obj instanceof Paciente)) {
            return false;
        }
        Paciente paciente = (Paciente) obj;
        return paciente.cpf.equals(this.cpf);
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