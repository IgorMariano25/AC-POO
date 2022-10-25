import java.util.Scanner;
class CadastraDados {
  Paciente pacientes[];
  Medico medicos[];
  Consulta consultas[];
  Agenda agendas[];
  Clinica clinica[];

  CadastraDados() {
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

  String horarioInicioAgenda, horarioFimAgenda, medicoAgenda, clinicaAgenda, consultorioAgenda;
  String intervaloAgenda;
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

      System.out.println("Informe o horário de início da consulta: ");
       horarioInicioAgenda =  cadastroAgendaScanner.nextLine();

      System.out.println("Informe o horário de fim da consulta: ");
        horarioFimAgenda = cadastroAgendaScanner.nextLine();  
      
      System.out.println("Informe o último dia que houve uma consulta: ");
        intervaloAgenda = cadastroAgendaScanner.nextLine();

      System.out.println("Informe o médico que irá realizar a consulta: ");
        medicoAgenda = cadastroAgendaScanner.nextLine();
        
      System.out.println("Informe a clinica que deve ocorrer a consulta: ");
        clinicaAgenda = cadastroAgendaScanner.nextLine();

      System.out.println("Informe o consultorio : ");
        consultorioAgenda = cadastroAgendaScanner.nextLine();

      cadastroAgendaScanner.close();
    };
  
  String nomePaciente, cpfPaciente, emailPaciente;
  public void cadastrarPaciente() {
    Scanner cadastroPacienteScanner = new Scanner(System.in);
      System.out.println("===================================");
      System.out.println("        Cadastro de Paciente       ");
      System.out.println("===================================");
  
      System.out.println("Informe o nome do paciente: ");
        nomePaciente = cadastroPacienteScanner.nextLine();

      System.out.println("Informe o CPF do paciente: ");
        cpfPaciente = cadastroPacienteScanner.nextLine();
      
      System.out.println("Informe e-mail do paciente: ");
        emailPaciente = cadastroPacienteScanner.nextLine();
      
      cadastroPacienteScanner.close(); // fecha o cadastroPacienteScanner, não vai mais consumir memória
    };
    
    public void cadastrarEndereco(){

    }
    // LocalDate dia = LocalDate.of(2000, 11, 16);
    // paciente.cadastraEndereco(...);

    String nomeMedico, cpfMedico, emailMedico;
    public void cadastrarMedico(){
      Scanner cadastroMedicoScanner = new Scanner(System.in);
      System.out.println("===================================");
      System.out.println("        Cadastro de Médico         ");
      System.out.println("===================================");
  
      System.out.println("Informe o nome do médico: ");
       nomeMedico = cadastroMedicoScanner.nextLine();

      System.out.println("Informe o CPF do médico: ");
        cpfMedico = cadastroMedicoScanner.nextLine();
      
      System.out.println("Informe e-mail do médico: ");
         emailMedico = cadastroMedicoScanner.nextLine();

      cadastroMedicoScanner.close(); // fecha o cadastroMedicoScanner, não vai mais consumir memória
  }

  String dataConsulta, horaConsulta, revisaoConsulta, pacienteConsulta, medicoConsulta;
  public void cadastrarConsulta() {
    Scanner cadastroConsultaScanner = new Scanner(System.in);
    System.out.println( "===================================");
    System.out.println( "        Cadastro de Consulta       ");
    System.out.println( "===================================");

    System.out.println("Informe a data da consulta: ");
        dataConsulta = cadastroConsultaScanner.nextLine();

    System.out.println("Informe a hora da consulta: ");
        horaConsulta = cadastroConsultaScanner.nextLine();
    
    System.out.println("Informe se a consulta é revisão (Sim/Não): ");
        revisaoConsulta = cadastroConsultaScanner.nextLine();

    System.out.println("Informe o paciente que irá realizar a consulta: ");
        pacienteConsulta = cadastroConsultaScanner.nextLine();

    System.out.println("Informe o médico que irá realizar a consulta:");
        medicoConsulta = cadastroConsultaScanner.nextLine();

    cadastroConsultaScanner.close(); // fecha o cadastroConsultaScanner, não vai mais consumir memória
  }

  String nomeClinica, cnpjClinica, enderecoClinica, telefoneClinica;
  public void cadastrarClinica() {
    Scanner cadastroClinicaScanner = new Scanner(System.in);
    System.out.println("===================================");
    System.out.println("        Cadastro de Clinica        ");
    System.out.println("===================================");

    System.out.println("Informe o nome da clinica: ");
      nomeClinica = cadastroClinicaScanner.nextLine();

    System.out.println("Informe o cnpj da clinica: ");
      cnpjClinica = cadastroClinicaScanner.nextLine();
    
    System.out.println("Informe o endereço da clinica: ");
      enderecoClinica = cadastroClinicaScanner.nextLine();

    System.out.println("Informe o telefone da clinica: ");
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
}
  /*
  1 - fulano - cardiologia
  2 - beltrano - oftalmologia

  2
  */