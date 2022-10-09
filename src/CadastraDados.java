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
  Integer intervaloAgenda, converteDiaSemana;
  public void cadastraAgenda() {
    Scanner cadastroAgendaScanner = new Scanner(System.in);
      // String horarioInicioAgenda, horarioFimAgenda, medicoAgenda, clinicaAgenda, consultorioAgenda;
      // Integer intervaloAgenda, converteDiaSemana;
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
       horarioInicioAgenda =  cadastroAgendaScanner.toString();

      System.out.print("Informe o horário de fim da consulta: ");
        horarioFimAgenda = cadastroAgendaScanner.toString();  
      
      System.out.print("Informe o último dia que houve uma consulta: ");
        intervaloAgenda = cadastroAgendaScanner.nextInt();

      System.out.print("Informe o médico que irá realizar a consulta: ");
        medicoAgenda = cadastroAgendaScanner.toString();
        
      System.out.print("Informe a clinica que deve ocorrer a consulta: ");
        clinicaAgenda = cadastroAgendaScanner.toString();

      System.out.print("Informe o consultorio : ");
        consultorioAgenda = cadastroAgendaScanner.toString();

      cadastroAgendaScanner.close();
    };
  
  String nomePaciente, cpfPaciente, emailPaciente;
  public void cadastrarPaciente() {
    Scanner cadastroPacienteScanner = new Scanner(System.in);
    // String nomePaciente, cpfPaciente, emailPaciente;

      System.out.println("===================================");
      System.out.println("        Cadastro de Paciente       ");
      System.out.println("===================================");
  
      System.out.print("Informe o nome do paciente: ");
        nomePaciente = cadastroPacienteScanner.toString();

      System.out.print("Informe o CPF do paciente: ");
        cpfPaciente = cadastroPacienteScanner.toString();
      
      System.out.print("Informe e-mail do paciente: ");
        emailPaciente = cadastroPacienteScanner.toString();
      
      cadastroPacienteScanner.close(); // fecha o cadastroPacienteScanner, não vai mais consumir memória
    };
    
    public void cadastrarEndereco(){

    }
    // LocalDate dia = LocalDate.of(2000, 11, 16);
    // paciente.cadastraEndereco(...);

    String nomeMedico, cpfMedico, emailMedico;
    public void cadastrarMedico(){
      Scanner cadastroMedicoScanner = new Scanner(System.in);
      // String nomeMedico, cpfMedico, emailMedico;
      System.out.println("===================================");
      System.out.println("        Cadastro de Médico         ");
      System.out.println("===================================");
  
      System.out.print("Informe o nome do médico: ");
       nomeMedico = cadastroMedicoScanner.toString();

      System.out.print("Informe o CPF do médico: ");
        cpfMedico = cadastroMedicoScanner.toString();
      
      System.out.print("Informe e-mail do médico: ");
         emailMedico = cadastroMedicoScanner.toString();

      cadastroMedicoScanner.close(); // fecha o cadastroMedicoScanner, não vai mais consumir memória
  }
    public void cadastrarConsulta() {
      Scanner cadastroConsultaScanner = new Scanner(System.in);

      String informacoesCadastro;
      informacoesCadastro = "===================================\n";
      informacoesCadastro += "       Cadastro de Consulta        ";
      informacoesCadastro += "===================================\n";
  
      System.out.print("Informe a data da consulta: ");
        String dataConsulta = cadastroConsultaScanner.toString();

      System.out.print("Informe a hora da consulta: ");
        String horaConsulta = cadastroConsultaScanner.toString();
      
      System.out.print("Informe se a consulta é revisão: ");
        String revisaoConsulta = cadastroConsultaScanner.toString();

      System.out.print("Informe o paciente que irá realizar a consulta: ");
        String pacienteConsulta = cadastroConsultaScanner.toString();

      System.out.print("Informe o médico que irá realizar a consulta:");
        String medicoConsulta = cadastroConsultaScanner.toString();

      cadastroConsultaScanner.close();
    }

    public void cadastrarClinica() {
      Scanner cadastroClinicaScanner = new Scanner(System.in);

      String informacoesCadastro;
      informacoesCadastro = "===================================\n";
      informacoesCadastro += "       Cadastro de Clinica       ";
      informacoesCadastro += "===================================\n";
  
      System.out.print("Informe o nome da clinica: ");
        String nomeClinica = cadastroClinicaScanner.toString();

      System.out.print("Informe o cnpj da clinica: ");
        String cnpjClinica = cadastroClinicaScanner.toString();
      
      System.out.print("Informe o endereço da clinica: ");
        String enderecoClinica = cadastroClinicaScanner.toString();

      System.out.print("Informe o telefone da clinica: ");
        String telefoneClinica = cadastroClinicaScanner.toString();

      cadastroClinicaScanner.close();
    }

  private void exibeInfo(){
    String informacoesGeraisDeCadastro = "";

    informacoesGeraisDeCadastro = "==============================================\n";
    informacoesGeraisDeCadastro += "       INFORMAÇÕES GERAIS DE CADASTRO        ";
    informacoesGeraisDeCadastro += "=============================================\n";

  return informacoesGeraisDeCadastro;
  }
}  

  /*
  1 - fulano - cardiologia
  2 - beltrano - oftalmologia

  2
  */
