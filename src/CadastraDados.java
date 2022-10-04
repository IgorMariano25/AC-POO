import java.time.LocalDate;
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
  
  public void cadastrarPaciente() {
    Scanner cadastroPacienteScanner = new Scanner(System.in);

      String informacoesCadastro;
      informacoesCadastro = "===================================\n";
      informacoesCadastro += "       cadastro de Paciente       ";
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

  }

  /*
  1 - fulano - cardiologia
  2 - beltrano - oftalmologia

  2
  */
}