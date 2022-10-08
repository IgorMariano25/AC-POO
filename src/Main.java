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
    menu += "4 - Emitir nota de cobrança;\n";
    menu += "Qualquer outra tecla - Sair do programa;\n";
    opcao = "-";

    while ( opcao != "" ) {
      System.out.println(menu);
      opcao = scanner.nextLine();
      switch (opcao) {
        case "1":
          banco.cadastrarPaciente();
          System.out.println("opção 1: Cadastrar paciente!\n");
          break;
        case "2":
          
          System.out.println("opção 2: Exibir pacientes cadastrados!\n");
          break;
        case "3":
          banco.cadastrarMedico();
          System.out.println("opção 3: Cadastrar médico!\n");
          break;
        case "4":
          System.out.println("opção 4: Emitir nota de cobrança!"+ "\n" + emitirNotaCobranca());
        default:
          System.out.println("Volte sempre!\n");
          opcao = "";
        scanner.close();
      }
    }
    //testes

  }
}