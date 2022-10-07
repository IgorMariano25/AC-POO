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

      System.out.print("Informe o CPF do paciente: ");
        String cpfMedico = cadastroMedicoScanner.toString();
      
      System.out.print("Informe e-mail do paciente: ");
        String emailMedico = cadastroMedicoScanner.toString();
  }

  private String exibeInfo(){
    String informacao = "";
    
  return informacao;
  }
}  

  /*
  1 - fulano - cardiologia
  2 - beltrano - oftalmologia

  2
  */
