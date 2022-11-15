package util;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import clinica.Agenda;
import clinica.Clinica;
import clinica.Consulta;
import entidades.Cliente;
import entidades.Medico;
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
  
      System.out.println("Informe o dia da semana da consulta: ");
        System.out.println("1 - Domingo");
        System.out.println("2 - Segunda-feira");
        System.out.println("3 - Terça-feira");
        System.out.println("4 - Quarta-feira");
        System.out.println("5 - Quinta-feira");
        System.out.println("6 - Sexta-feira");
        System.out.println("7 - Sábado");
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

      System.out.print("Informe (numericamente) o dia do nascimento do paciente: ");
        diaNascimentoPaciente = cadastroPacienteScanner.nextInt();

      System.out.print("Informe (numericamente) o mês do nascimento do paciente: ");
        mesNascimentoPaciente = cadastroPacienteScanner.nextInt();

      System.out.print("Informe (numericamente) o ano do nascimento do paciente: ");
        anoNascimentoPaciente = cadastroPacienteScanner.nextInt();

      while (cadastroPacienteScanner.hasNextLine()){
        if (!cadastroPacienteScanner.hasNextLine()) {
          cadastroPacienteScanner.close(); // fecha o cadastroPacienteScanner, não vai mais consumir memória
          adicionaPaciente();
          break;
        }
      }
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

    cadastroMedicoScanner.close();
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

    cadastroConsultaScanner.close(); 
  }

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

    cadastroClinicaScanner.close();
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
    informacoesCadastroPaciente += "E-mail: " + emailPaciente  + "\n";
    System.out.println(informacoesCadastroPaciente);
  }  

  String informacoesCadastroMedico;
    public void exibeInformacoesMedico(){
    System.out.println("===================================");
    System.out.println("        Cadastro de Médico       ");
    System.out.println("===================================");

    informacoesCadastroMedico += "Nome: " + nomeMedico;
    informacoesCadastroMedico += "CPF: " + cpfMedico;
    informacoesCadastroMedico += "E-mail: " + emailMedico + "\n";
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
    informacoesCadastroConsulta += "É uma consulta de revisão ? " + revisaoConsulta + "\n";
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
    informacoesCadastroClinica += "Telefone: " + telefoneClinica  + "\n";
    System.out.println(informacoesCadastroClinica);
    }

    // TODO: Fazer lógica do método equals
  @Override
  public boolean equals(Object object) {
      if (object == this)
          return true;
      if (!(object instanceof CadastraDados) || (object == null)) {
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

  @Override
  public int hashCode() {
    return Objects.hash(
    // pacientes[], medicos[], consultas[], agendas[], clinica[], 
    horarioInicioAgenda, horarioFimAgenda, medicoAgenda, clinicaAgenda, 
    consultorioAgenda, intervaloAgenda, converteDiaSemana, nomePaciente, 
    cpfPaciente, emailPaciente, diaNascimentoPaciente, mesNascimentoPaciente,
    anoNascimentoPaciente, nomeMedico, cpfMedico, emailMedico, dataConsulta, 
    horaConsulta, revisaoConsulta, pacienteConsulta, medicoConsulta, nomeClinica, 
    cnpjClinica, enderecoClinica, telefoneClinica, informacoesGeraisDeCadastro, 
    informacoesCadastroPaciente, informacoesCadastroMedico, 
    informacoesCadastroConsulta, informacoesCadastroClinica);
  }

}
  /*
  1 - fulano - cardiologia
  2 - beltrano - oftalmologia

  2
  */
