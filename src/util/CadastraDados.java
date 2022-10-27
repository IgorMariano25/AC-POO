package util;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import clinica.Agenda;
import clinica.Clinica;
import clinica.Consulta;
import pessoas.Medico;
import pessoas.Paciente;
public class CadastraDados {
  Paciente pacientes[];
  Medico medicos[];
  Consulta consultas[];
  Agenda agendas[];
  Clinica clinica[];

  public CadastraDados() {
    pacientes = new Paciente[5]; 
    medicos = new Medico[5];
    agendas = new Agenda[20];
    consultas = new Consulta[20];
    clinica = new Clinica[1]; 
  }

  // Retorna o inteiro referente ao índice do próximo elemento
  // vazio dentro do array.
  public int proximoElementoVazio(Object[] dado) {
    return 0;
  }

  String horarioInicioAgenda, horarioFimAgenda, medicoAgenda, clinicaAgenda, 
  consultorioAgenda, intervaloAgenda;
  
  Integer converteDiaSemana;
  public void cadastraAgenda() {
    Scanner cadastroAgendaScanner = new Scanner(System.in);
      System.out.println("===================================");
      System.out.println("        cadastro de Agenda         ");
      System.out.println("===================================");
  
      System.out.print("Informe o dia da semana da consulta: ");
        System.out.print("1 - Domingo");
        System.out.print("2 - Segunda-feira");
        System.out.print("3 - Terça-feira");
        System.out.print("4 - Quarta-feira");
        System.out.print("5 - Quinta-feira");
        System.out.print("6 - Sexta-feira");
        System.out.print("7 - Sábado");
        converteDiaSemana = cadastroAgendaScanner.nextInt();

      System.out.print("Informe o horário de início da consulta: ");
       horarioInicioAgenda =  cadastroAgendaScanner.nextLine();

      System.out.print("Informe o horário de fim da consulta: ");
        horarioFimAgenda = cadastroAgendaScanner.nextLine();  
      
      System.out.print("Informe o último dia que houve uma consulta: ");
        intervaloAgenda = cadastroAgendaScanner.nextLine();

      System.out.print("Informe o médico que irá realizar a consulta: ");
        medicoAgenda = cadastroAgendaScanner.nextLine();
        
      System.out.print("Informe a clinica que deve ocorrer a consulta: ");
        clinicaAgenda = cadastroAgendaScanner.nextLine();

      System.out.print("Informe o consultorio : ");
        consultorioAgenda = cadastroAgendaScanner.nextLine();

      cadastroAgendaScanner.close();
    };
  
  String  nomePaciente, cpfPaciente, emailPaciente;
  Integer diaNascimentoPaciente, mesNascimentoPaciente, anoNascimentoPaciente;
  public void cadastrarPaciente() {
    Scanner cadastroPacienteScanner = new Scanner(System.in);
      System.out.println("===================================");
      System.out.println("        Cadastro de Paciente       ");
      System.out.println("===================================");
  
      System.out.print("Informe o nome do paciente: ");
        nomePaciente = cadastroPacienteScanner.nextLine();

      System.out.print("Informe o CPF do paciente: ");
        cpfPaciente = cadastroPacienteScanner.nextLine();
      
      System.out.print("Informe e-mail do paciente: ");
        emailPaciente = cadastroPacienteScanner.nextLine();

      System.out.print("Informe dia do nascimento do paciente: ");
        diaNascimentoPaciente = cadastroPacienteScanner.nextInt();

      System.out.print("Informe (numericamente) o mês do nascimento do paciente: ");
        mesNascimentoPaciente = cadastroPacienteScanner.nextInt();

      System.out.print("Informe (numericamente) o ano do nascimento do paciente: ");
        anoNascimentoPaciente = cadastroPacienteScanner.nextInt();

        Paciente paciente = new Paciente(nomePaciente, cpfPaciente, emailPaciente, 
        LocalDate.of(anoNascimentoPaciente,mesNascimentoPaciente, diaNascimentoPaciente));
      
      cadastroPacienteScanner.close(); // fecha o cadastroPacienteScanner, não vai mais consumir memória
    };
    
    public void cadastrarEndereco(){

  }
    // LocalDate dia = LocalDate.of(2000, 11, 16);
    // paciente.cadastraEndereco(...);

     public void adicionaPaciente(){
      Set<Paciente> pacientes = new HashSet<Paciente>();
      Paciente paciente = new Paciente(nomePaciente, cpfPaciente, emailPaciente, 
      LocalDate.of(anoNascimentoPaciente,mesNascimentoPaciente, diaNascimentoPaciente));
      pacientes.add(paciente);
  }

  String nomeMedico, cpfMedico, emailMedico;
  public void cadastrarMedico(){
    Scanner cadastroMedicoScanner = new Scanner(System.in);
    System.out.println("===================================");
    System.out.println("        Cadastro de Médico         ");
    System.out.println("===================================");

    System.out.print("Informe o nome do médico: ");
      nomeMedico = cadastroMedicoScanner.nextLine();

    System.out.print("Informe o CPF do médico: ");
      cpfMedico = cadastroMedicoScanner.nextLine();
    
    System.out.print("Informe e-mail do médico: ");
        emailMedico = cadastroMedicoScanner.nextLine();

    cadastroMedicoScanner.close(); // fecha o cadastroMedicoScanner, não vai mais consumir memória
  }

  String dataConsulta, horaConsulta, revisaoConsulta, pacienteConsulta, medicoConsulta;
  public void cadastrarConsulta() {
    Scanner cadastroConsultaScanner = new Scanner(System.in);
    System.out.println( "===================================");
    System.out.println( "        Cadastro de Consulta       ");
    System.out.println( "===================================");

    System.out.print("Informe a data da consulta: ");
        dataConsulta = cadastroConsultaScanner.nextLine();

    System.out.print("Informe a hora da consulta: ");
        horaConsulta = cadastroConsultaScanner.nextLine();
    
    System.out.print("Informe se a consulta é revisão (Sim/Não): ");
        revisaoConsulta = cadastroConsultaScanner.nextLine();

    System.out.print("Informe o paciente que irá realizar a consulta: ");
        pacienteConsulta = cadastroConsultaScanner.nextLine();

    System.out.print("Informe o médico que irá realizar a consulta:");
        medicoConsulta = cadastroConsultaScanner.nextLine();

    cadastroConsultaScanner.close(); // fecha o cadastroConsultaScanner, não vai mais consumir memória
  }
  //   static  void adicionaPaciente(){
  //     Set<Paciente> pacientes = new HashSet<Paciente>();
  //     Paciente paciente = new Paciente();
  //     pacientes.add(paciente);
  // }

  String nomeClinica, cnpjClinica, enderecoClinica, telefoneClinica;
  public void cadastrarClinica() {
    Scanner cadastroClinicaScanner = new Scanner(System.in);
    System.out.println("===================================");
    System.out.println("        Cadastro de Clinica        ");
    System.out.println("===================================");

    System.out.print("Informe o nome da clinica: ");
      nomeClinica = cadastroClinicaScanner.nextLine();

    System.out.print("Informe o cnpj da clinica: ");
      cnpjClinica = cadastroClinicaScanner.nextLine();
    
    System.out.print("Informe o endereço da clinica: ");
      enderecoClinica = cadastroClinicaScanner.nextLine();

    System.out.print("Informe o telefone da clinica: ");
      telefoneClinica = cadastroClinicaScanner.nextLine();

    cadastroClinicaScanner.close(); // fecha o cadastroClinicaScanner, não vai mais consumir memória
  }

  String informacoesGeraisDeCadastro;
  public void exibeInformacoesGerais(){
    informacoesGeraisDeCadastro = "==============================================\n";
    informacoesGeraisDeCadastro += "        INFORMAÇÕES GERAIS DE CADASTRO       ";
    informacoesGeraisDeCadastro += "=============================================\n";
    System.out.println(informacoesGeraisDeCadastro);

    exibeInformacoesPaciente();
    exibeInformacoesMedico();
    exibeInformacoesConsulta();
    exibeInformacoesClinica();
  }

  String informacoesCadastroPaciente;
    public void exibeInformacoesPaciente(){
    System.out.println("===================================");
    System.out.println("        Cadastro de Paciente       ");
    System.out.println("===================================");

    informacoesCadastroPaciente += "Nome: " + nomePaciente;
    informacoesCadastroPaciente += "CPF: " + cpfPaciente;
    informacoesCadastroPaciente += "E-mail: " + emailPaciente;
    System.out.println(informacoesCadastroPaciente);
  }  

  String informacoesCadastroMedico;
    public void exibeInformacoesMedico(){
    System.out.println("===================================");
    System.out.println("        Cadastro de Médico       ");
    System.out.println("===================================");

    informacoesCadastroMedico += "Nome: " + nomeMedico;
    informacoesCadastroMedico += "CPF: " + cpfMedico;
    informacoesCadastroMedico += "E-mail: " + emailMedico;
    System.out.println(informacoesCadastroMedico);
    }

  String informacoesCadastroConsulta;
    public void exibeInformacoesConsulta(){
    System.out.println("===================================");
    System.out.println("        Cadastro de Consulta       ");
    System.out.println("===================================");

    informacoesCadastroConsulta += "Paciente: " + pacienteConsulta ;
    informacoesCadastroConsulta += "Médico: " + medicoConsulta;
    informacoesCadastroConsulta += "Data: " + dataConsulta;
    informacoesCadastroConsulta += "Hora: " + horaConsulta;
    informacoesCadastroConsulta += "É uma consulta de revisão ? " + revisaoConsulta;
    System.out.println(informacoesCadastroConsulta);
    }

    String informacoesCadastroClinica;
    public void exibeInformacoesClinica(){
    System.out.println("===================================");
    System.out.println("        Cadastro de Clinica        ");
    System.out.println("===================================");

    informacoesCadastroClinica += "Nome: " + nomeClinica  ;
    informacoesCadastroClinica += "CNPJ: " + cnpjClinica ;
    informacoesCadastroClinica += "Endereco: " + enderecoClinica;
    informacoesCadastroClinica += "Telefone: " + telefoneClinica;
    System.out.println(informacoesCadastroClinica);
    }

    // TODO: Fazer lógica do método equals
  @Override
  public boolean equals(Object object) {
      if (object == this)
          return true;
      if (!(object instanceof CadastraDados)) {
          return false;
      }
      CadastraDados cadastraDados = (CadastraDados) object;
      return
      Objects.equals(cpfPaciente, cadastraDados.cpfPaciente) && 
      Objects.equals(cpfMedico, cadastraDados.cpfMedico) && 
      Objects.equals(dataConsulta, cadastraDados.dataConsulta) && 
      Objects.equals(horaConsulta, cadastraDados.horaConsulta) &&
      Objects.equals(pacienteConsulta, cadastraDados.pacienteConsulta) && 
      Objects.equals(medicoConsulta, cadastraDados.medicoConsulta);
  }
}
  /*
  1 - fulano - cardiologia
  2 - beltrano - oftalmologia

  2
  */
