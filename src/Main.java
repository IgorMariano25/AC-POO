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
          banco.cadastrarPaciente();
          System.out.println("opção 1!\n");
          break;
        case "2":
          System.out.println("opção 2!\n");
          break;
        case "3":
          System.out.println("opção 3!\n");
          break;
        default:
          System.out.println("Volte sempre!\n");
          opcao = "";
      }
    }
  }
}