package util;

import java.util.Scanner;

public class LeitoraDados {
    private Scanner scanner;

    public LeitoraDados() {
        this.scanner = new Scanner(System.in);
        //fecha o scanner quando se estiver destruindo a instancia dessa classe
        //limpeza do objeto pelo garbage collector
    }

    public String lerTexto() {
        return this.scanner.nextLine();
    }

    public String[] lerNovoCliente () {
        System.out.println("Informe o cpf: ");
        String cpf = this.lerTexto();

        System.out.println("Informe o nome: ");
        String nome  = this.lerTexto();

        return new String[] {cpf, nome};
    }

    public String[] lerClienteAlteracao(String cpf) {
        System.out.println("Informe o nome: ");
        String nome  = this.lerTexto();

        return new String[] {cpf, nome};
    }

    @Override
    protected void finalize () {
        this.scanner.close();
        //fecha scanner pra não deixar a leitura de dados aberta
    }

    //médico

    public String[] lerNovoMedico () {
        System.out.println("Informe o cpf: ");
        String cpf = this.lerTexto();

        System.out.println("Informe o nome: ");
        String nome  = this.lerTexto();

        return new String[] {cpf, nome};
    }

    public String[] lerMedicoAlteracao(String cpf) {
        System.out.println("Informe o nome: ");
        String nome  = this.lerTexto();

        return new String[] {cpf, nome};
    }

    //clínica

    public String[] lerNovaClinica () {
        System.out.println("Informe o cep: ");
        String cep = this.lerTexto();

        System.out.println("Informe o nome: ");
        String endereco  = this.lerTexto();

        return new String[] {cep, endereco};
    }

    public String[] lerClinicaAlteracao(String cep){
        System.out.println("Informe o endereço: ");
        String endereco  = this.lerTexto();

        return new String[] {cep, endereco};
    }
}
