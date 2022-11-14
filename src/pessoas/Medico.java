package pessoas;
import java.io.IOException;
import java.util.Scanner;

import clinica.Agenda;
import clinica.Clinica;
import clinica.Consultorio;
import util.CadastraDados;
import util.Gerenciador;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private Agenda agendas[];
    private int agendasOcupadas;
    private Consultorio consultorio;

    public Medico(String nome, String cpf, String eMail, String crm, String especialidade) {
        super(nome, cpf, eMail);
        this.crm = crm;
        this.especialidade = especialidade;
        this.agendas = new Agenda[10];
        this.agendasOcupadas = 0;
    }

    public static void exibeOpcoesMenu() {
        System.out.println( "\nSistema de agendamento de consultas");
        System.out.println( "Informe a opção desejada:");
        System.out.println( "1 - Cadastrar paciente");
        System.out.println( "2 - Exibir pacientes cadastrados");
        System.out.println( "3 - Cadastrar médico");
        System.out.println( "4 - Cadastrar paciente");
        System.out.println( "5 - Cadastrar clinica");
        System.out.println( "Qualquer outra tecla - Sair do programa");
    }

    public static String processaOpcoesMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String opcao = scanner.nextLine();
        String opcaoMenu = "0";
        switch (opcaoMenu){
            case "1": //Cadastrar Médico
            new CadastraDados().cadastrarMedico();
            break;

            case "2": //Listar Médicos
            System.out.println("Lista de Médicos cadastrados:");
            new CadastraDados().exibeInformacoesMedico();
            break;            
    }
        return opcao;
}

    @Override
    public void exibeInfo() {
        String msg = "";

        msg += this.nome + " - " + this.especialidade + "\n";
        msg += this.eMail + "\n";
        msg += "CPF: " + this.cpf + "\n";
        msg += "CRM: " + this.crm + "\n";
        msg += "Telefones:" + "\n";
        msg += this.listaTelefones();
        System.out.println(msg);
    }

    public void incluirAgenda(int diaSemana, Clinica clinica) {
        if (this.agendasOcupadas > 10) {
            this.agendasOcupadas = 0;
        }

        agendas[this.agendasOcupadas] = new Agenda(diaSemana, clinica, consultorio);
        this.agendasOcupadas += 1;
    }

    public Agenda[] getAgendas() {
        return this.agendas;
    }
  
    public void exibirAgendas() {
        System.out.println("Agenda de " + this.nome + ":\n");
        for (Agenda agenda : this.agendas) {
            System.out.println(agenda);
        }
    }
}

    // TODO: Implementar método hashCode e Equals
    // TODO: Organizar exibição de mensagens para o usuário