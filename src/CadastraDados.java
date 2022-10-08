import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
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

  public void cadastraAgenda() {
    Scanner cadastroAgendaScanner = new Scanner(System.in);

      String informacoesCadastro;
      informacoesCadastro = "===================================\n";
      informacoesCadastro += "       cadastro de Agenda         ";
      informacoesCadastro += "===================================\n";
  
      System.out.print("Informe o dia da semana da consulta: ");
        System.out.print("1 - Domingo");
        System.out.print("2 - Segunda-feira");
        System.out.print("3 - Terça-feira");
        System.out.print("4 - Quarta-feira");
        System.out.print("5 - Quinta-feira");
        System.out.print("6 - Sexta-feira");
        System.out.print("7 - Sábado");
        int converteDiaSemana = cadastroAgendaScanner.nextInt();

      System.out.print("Informe o horário de início da consulta: ");
        String horarioInicioAgenda =  cadastroAgendaScanner.toString();

      System.out.print("Informe o horário de fim da consulta: ");
        String horarioFimAgenda = cadastroAgendaScanner.toString();  
      
      System.out.print("Informe o último dia que houve uma consulta: ");
        Integer intervaloAgenda = cadastroAgendaScanner.nextInt();

      System.out.print("Informe o médico que irá realizar a consulta: ");
        String medicoAgenda = cadastroAgendaScanner.toString();
        
      System.out.print("Informe a clinica que deve ocorrer a consulta: ");
        String clinicaAgenda = cadastroAgendaScanner.toString();

      System.out.print("Informe o consultorio : ");
        String consultorioAgenda = cadastroAgendaScanner.toString();

      cadastroAgendaScanner.close();  
    };
  
  public void cadastrarPaciente() {
    Scanner cadastroPacienteScanner = new Scanner(System.in);

      String informacoesCadastro;
      informacoesCadastro = "===================================\n";
      informacoesCadastro += "       Cadastro de Paciente       ";
      informacoesCadastro += "===================================\n";
  
      System.out.print("Informe o nome do paciente: ");
        String nomePaciente = cadastroPacienteScanner.toString();

      System.out.print("Informe o CPF do paciente: ");
        String cpfPaciente = cadastroPacienteScanner.toString();
      
      System.out.print("Informe e-mail do paciente: ");
        String emailPaciente = cadastroPacienteScanner.toString();

      cadastroPacienteScanner.close(); // fecha o notas, não vai mais consumir memória
    };
    
    public void cadastrarEndereco(){

    }
    // LocalDate dia = LocalDate.of(2000, 11, 16);
    // paciente.cadastraEndereco(...);

    public void cadastrarMedico(){
      Scanner cadastroMedicoScanner = new Scanner(System.in);

      String informacoesCadastro;
      informacoesCadastro = "===================================\n";
      informacoesCadastro += "       Cadastro de Médico         ";
      informacoesCadastro += "===================================\n";
  
      System.out.print("Informe o nome do médico: ");
        String nomeMedico = cadastroMedicoScanner.toString();

      System.out.print("Informe o CPF do médico: ");
        String cpfMedico = cadastroMedicoScanner.toString();
      
      System.out.print("Informe e-mail do médico: ");
        String emailMedico = cadastroMedicoScanner.toString();

      cadastroMedicoScanner.close();
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
