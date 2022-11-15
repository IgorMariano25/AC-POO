package pessoas;

import java.io.IOException;
import java.util.Objects;
import java.util.Scanner;

import clinica.Agenda;
import clinica.Clinica;
import clinica.Consultorio;
import util.CadastraDados;

public class Medico extends Pessoa {
    private String cpfMedico;
    private String nomeMedico;
    private String emailMedico;
    private String especialidadeMedico;
    private String crmMedico;

    public Medico(String cpfMedico) {
        this.cpfMedico = cpfMedico;
        this.nomeMedico = "";
        this.emailMedico = "";
        this.crmMedico = "";
    }

    public Medico(String cpfMedico, String nomeMedico, String emailMedico, String crmMedico) {
        this.cpfMedico = cpfMedico;
        this.nomeMedico = nomeMedico;
        this.emailMedico = emailMedico;
        this.crmMedico = crmMedico;
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

    public static void exibeOpcoesMenu() {
        System.out.println("\n===================================");
        System.out.println("        Menu de opções Médico      ");
        System.out.println("===================================");
        System.out.println("1 - Cadastrar Médico");
        System.out.println("2 - Exibir Médicos cadastrados");
        System.out.println("Qualquer outra tecla - Sair do programa");
        System.out.print("\nInforme a opção desejada: ");
    }

    public static String processaOpcoesMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String opcaoMenu = scanner.nextLine();
        switch (opcaoMenu){
            case "1":
            new CadastraDados().cadastrarMedico();
            break;

            case "2":
            new CadastraDados().exibeInformacoesMedico();
            break;
        }
        scanner.close();
        return opcaoMenu;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Medico)) {
            return false;
        }
        Medico medico = (Medico) o;
        return Objects.equals(cpfMedico, medico.cpfMedico) && 
        Objects.equals(nomeMedico, medico.nomeMedico) && 
        Objects.equals(emailMedico, medico.emailMedico) && 
        Objects.equals(especialidadeMedico, medico.especialidadeMedico) && 
        Objects.equals(crmMedico, medico.crmMedico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfMedico, nomeMedico, emailMedico, especialidadeMedico, crmMedico);
    }

    @Override
    public String toString() {
        return cpfMedico + " - " + nomeMedico + " - " + emailMedico + " - " + especialidadeMedico + " - " + crmMedico;
    }
}