// import java.time.LocalDate;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    CadastraDados banco = new CadastraDados();
    String menu, opcao;

    Scanner scanner = new Scanner(System.in);
    
    menu = "\nSistema de agendamento de consultas\n";
    menu += "Informe a opção desejada:\n";
    menu += "1 - Cadastrar paciente;\n";
    menu += "2 - Exibir pacientes cadastrados;\n";
    menu += "3 - Cadastrar médico;\n";
    menu += "Qualquer outra tecla - Sair do programa;\n";
    opcao = "-";

    while ( opcao != "" ) {
      System.out.println(menu);
      opcao = scanner.nextLine();
      switch (opcao) {
        case "1":
          System.out.println("opção 1: Cadastrar paciente!\n");
          banco.cadastrarPaciente();
          break;
        case "2":
          System.out.println("opção 2: Exibir pacientes cadastrados!\n");
          // banco.exibeInfo();
          break;
        case "3":
          System.out.println("opção 3: Cadastrar médico!\n");
          banco.cadastrarMedico();
          break;
        default:
          System.out.println("Volte sempre!\n");
          opcao = "";
        scanner.close();
      }
    }
    //testes

    //Emição de nota de cobrança:
    // Paciente paciente1 = new Paciente("José", "1234", "email_real@gmail.com", LocalDate.of(1958, 8, 25));
    // Medico medico1 = new Medico("Aurélio", "98765", "email_de_medico@yahoo.com", "65651", "ortopedista");
    // Consulta exibe = new Consulta(true, paciente1, medico1);
    // System.out.println("opção 4: Emitir nota de cobrança!"+ "\n" + exibe.emitirNotaCobranca());
  }
}