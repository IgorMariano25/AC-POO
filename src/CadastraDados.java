import java.time.LocalDate;
import java.util.Scanner;
class CadastraDados {
  Paciente pacientes[];
  Medico medicos[];
  Consulta consultas[];
  Agenda agendas[];
  Clinica clinica;

  CadastraDados() {
    pacientes = new Paciente[5];
    medicos = new Medico[5];
    agendas = new Agenda[20];
    consultas = new Consulta[20];
  }

  // Retorna o inteiro referente ao índice do próximo elemento
  // vazio dentro do array.
  public int proximoElementoVazio(Object[] dado) {
    return 0;
  }
  
  public void cadastraPaciente() {
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

    };
    
    // LocalDate dia = LocalDate.of(2000, 11, 16);
    // paciente.cadastraEndereco(...);
  }

  /*
  1 - fulano - cardiologia
  2 - beltrano - oftalmologia

  2
  */
}