// import java.time.LocalDate;
import java.util.Scanner;

import util.CadastraDados;

// Critérios de pontuçaõ de acordo com o professor Victor Machado
  // --> TODO: Verificar se as variáveis e métodos foram bem nomeados (Uso de camelCase, nomes claros, etc...)
  // --> TODO: Verificar se as classes e métodos foram bem nomeados (Uso de camelCase, nomes claros, etc...)
  // --> TODO: Verificar se o espaçamento está correto (a + b ao invés de a+b)
  // --> TODO: Instruções tiveram espaçamento correto (print("exemplo") ao invés de print("exemplo"))
  // --> TODO: Linhas com comprimentos adequados
  // --> TODO: Código está rodando quando é executado ?
  // --> TODO: Código não apresenta redundância
  // --> TODO: Armarzenar dados de input no Arry pacientes, Medicos Agenda, Consulta, Clinica
  // --> TODO: Devover informaçõs de input
  // --> TODO: Exibir mnsagem de erro, caso a informação buscada não exista
  // --> TODO: Verificar o melhor tipo de Arry para ser aplicado
  // --> TODO: Organizar exibição de mensagens para o usuário
  // --> TODO: Sistema permite exibir Pacientes
  // --> TODO: Sistema permite exibir Medicos
  // --> TODO: Sistema permite exibir Agendas
  // --> TODO: Sistema permite exibir Consultas
  // --> TODO: Código de interface estár organizado entre Main e CadastraDados
  // --> TODO: Classe Consultório foi impelmentada confrome o modelo UML
  // --> TODO: Classe consultório foi implementada, sem acoplamentes ou redundâncias
  // --> TODO: Representação da classe consultorio foi incluída corretamente no modelo UML
  // --> TODO: Representação do método emitirNota() foi incluida corretamente no modelo UML, classe conslutório
  // --> TODO: Método emitirNota() - gera cobrança de R$ 400
  // --> TODO: Método emitirNota() - gera cobrança R$ 200 para a primeira consulta
  // --> TODO: Método emitirNota() - gera cobrança R$ 100 para plano de saúde
  // --> TODO: Método emitirNota() - cobranças atendem às regras de negócios definidas


// Modificações identificadas pelos alunos
  // --> TODO: Verificar se o código está de acordo com o diagrama de classes
  // --> TODO: Testar a interface 
  // --> TODO: Realizar teste de cobrança
  // --> TODO: Organizar exibição de mensagens para o usuário (Nos aquivos que tiverem output de informações)
  // --> TODO: Implementar método hashCode e Equals (Nos arquivos que possuirem essa mensagem no final do arquivo)
  // --> TODO: Adicionar método getCOnsultorio() no arquivo Agenda.java

class Main {
  public static void main(String[] args) {
    CadastraDados banco = new CadastraDados();
    String menu, opcao;

    Scanner scanner = new Scanner(System.in);
    
    menu = "\nSistema de agendamento de consultas\n";
    menu += "Informe a opção desejada:\n";
    menu += "1 - Cadastrar paciente\n";
    menu += "2 - Exibir pacientes cadastrados\n";
    menu += "3 - Cadastrar médico\n";
    menu += "4 - Cadastrar paciente\n";
    menu += "5 - Cadastrar clinica\n";
    menu += "Qualquer outra tecla - Sair do programa\n";
    opcao = "-";

    while ( opcao != "" ) {
      System.out.println(menu);
      opcao = scanner.nextLine();
      switch (opcao) {
        case "1":
          System.out.println("opção 1: Cadastrar paciente!");
          banco.cadastrarPaciente();
          break;
        case "2":
          System.out.println("opção 2: Exibir pacientes cadastrados!");
          // TODO: Criar método para exibir os pacientes cadastrados
          banco.exibeInfo();
          break;
        case "3":
          System.out.println("opção 3: Cadastrar médico!");
          banco.cadastrarMedico();
          break;
        case "4":
          System.out.println("opção 4: Exibir médicos cadastrados!");
          // TODO: Criar método para exibir os médicos cadastrados
          banco.exibeInfo();
          break;
        case "5":
          System.out.println("opção 5: Cadastrar Agenda!");
          banco.cadastraAgenda();
          break;
        case "6":
          System.out.println("opção 6: Cadastrar Consulta!");
          banco.cadastrarConsulta();
          break;
        case "7":
          System.out.println("opção 7: Cadastrar Clinica!");
          banco.cadastrarClinica();
          break;
        default:
          System.out.println("Volte sempre!");
          opcao = "";
        scanner.close();
      }
    }
  }
}

//     static void testaInterface() {
//       Exame[] exames = new Exame[5];
//     }
// }

    //Emição de nota de cobrança:
    // Paciente paciente1 = new Paciente("José", "1234", "email_real@gmail.com", LocalDate.of(1958, 8, 25));
    // Medico medico1 = new Medico("Aurélio", "98765", "email_de_medico@yahoo.com", "65651", "ortopedista");
    // Consulta exibe = new Consulta(true, paciente1, medico1);
    // System.out.println("opção 4: Emitir nota de cobrança!"+ "\n" + exibe.emitirNotaCobranca());

  // --> TODO: Implementar método hashCode e Equals
  // --> TODO: Organizar exibição de mensagens para o usuário