package util;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

import clinica.Agenda;
import entidades.Clinica;
import clinica.Consulta;
import pessoas.Medico;
import pessoas.Paciente;

public class CadastraDados {
    static Set<String> pacientes = new HashSet<String>();
    static Set<String> consultas = new HashSet<String>();
    static Set<String> medicos = new HashSet<String>();
    static Set<String> agendas = new HashSet<String>();
  
    public static void cadastrarPaciente() {
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("===================================");
        System.out.println("        Cadastro de Paciente       ");
        System.out.println("===================================");

        String inputNome;
        String inputCPF;
        String inputEmail;

        while (pacientes.size() < 6) {
            System.out.print("Digite o nome do paciente: ");
            inputNome = scanner.nextLine().trim();
            System.out.print("Digite o cpf do paciente: ");
            inputCPF = scanner.nextLine().trim();
            System.out.print("Digite o email do paciente: ");
            inputEmail = scanner.nextLine().trim();
            if (inputNome.isEmpty()) {
                System.out.println("Por favor digite um nome válido");
                continue;
            }
            if (!pacientes.add(inputCPF))
                System.out.println("Esse paciente já foi cadastrado (" + inputCPF + ')');
            }
        }
    }

    public static void cadastrarConsulta() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println( "===================================");
            System.out.println( "        Cadastro de Consulta       ");
            System.out.println( "===================================");

            String inputMedico;
            String inputHora;
            String inputDiaSemana;

            while (consultas.size() < 5) {
                System.out.print("Digite o nome do médico: ");
                inputMedico = scanner.nextLine().trim();
                System.out.print("Digite o horário da consulta: ");
                inputDiaSemana = scanner.nextLine().trim();
                System.out.print("Digite o horário da consulta: ");
                inputHora = scanner.nextLine().trim();
                if (inputMedico.isEmpty()) {
                    System.out.println("Por favor digite nome válido");
                    continue;
                }
                if (!consultas.add(inputHora + inputDiaSemana))
                    System.out.println("Esse médico está com o horário ocupado");
            }
        }
        }

        public static void cadastrarMedico() {
            try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===================================");
            System.out.println("        Cadastro de Médico         ");
            System.out.println("===================================");
        
            String inputNome;
            String inputCPF;
            String inputEmail;
            String inputCRM;
        
            while (medicos.size() < 6) {
                System.out.print("Digite o nome do méedico: ");
                inputNome = scanner.nextLine().trim();
                System.out.print("Digite o cpf do médico: ");
                inputCPF = scanner.nextLine().trim();
                System.out.print("Digite o email do médico: ");
                inputEmail = scanner.nextLine().trim();
                System.out.print("Digite o crm do médico: ");
                inputCRM = scanner.nextLine().trim();
                if (inputNome.isEmpty()) {
                    System.out.println("Por favor digite um nome válido");
                    continue;
                }
                if (!medicos.add(inputCPF + inputCRM))
                    System.out.println("Esse médico já foi cadastrado (" + inputCRM + ')');
                }
            }
          }

          private void mostraAgenda() {
            agendas.addAll(consultas);
            System.out.println("Agenda: " + agendas);
          }

          public void getAgendas(){}
  
  // Retorna o inteiro referente ao índice do próximo elemento
  // vazio dentro do array.
  public int proximoElementoVazio(Object[] dado) {
    return 0;
  }

    public void adicionaPaciente(){
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("===================================");
            System.out.println("        Adição de Paciente       ");
            System.out.println("===================================");
    
            String inputNome;
            String inputCPF;
            String inputEmail;
    
            while (pacientes.size() < 6) {
                System.out.print("Digite o nome do paciente: ");
                inputNome = scanner.nextLine().trim();
                System.out.print("Digite o cpf do paciente: ");
                inputCPF = scanner.nextLine().trim();
                System.out.print("Digite o email do paciente: ");
                inputEmail = scanner.nextLine().trim();
                if (inputNome.isEmpty()) {
                    System.out.println("Por favor digite um nome válido");
                    continue;
                }
                if (!pacientes.add(inputCPF))
                    System.out.println("Esse paciente já foi cadastrado (" + inputCPF + ')');
                }
            }
    
            System.out.println("Pacientes cadastrados: " + pacientes);
  }

  String nomeClinica, cnpjClinica, enderecoClinica, telefoneClinica;
  public void cadastrarClinica() {
    Scanner cadastroClinicaScanner = new Scanner(System.in);
    System.out.println("===================================");
    System.out.println("        Cadastro de Clinica        ");
    System.out.println("===================================");

    System.out.print("Informe o nome da clinica: ");
      nomeClinica = cadastroClinicaScanner.nextLine();

    System.out.print("Informe o cnpj da clinica: ");
      cnpjClinica = cadastroClinicaScanner.nextLine();
    
    System.out.print("Informe o endereço da clinica: ");
      enderecoClinica = cadastroClinicaScanner.nextLine();

    System.out.print("Informe o telefone da clinica: ");
      telefoneClinica = cadastroClinicaScanner.nextLine();

    cadastroClinicaScanner.close();
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
    System.out.println("               Paciente            ");
    System.out.println("===================================");

    System.out.println("Pacientes cadastrados: " + pacientes);
  }  

  String informacoesCadastroMedico;
    public void exibeInformacoesMedico(){
    System.out.println("===================================");
    System.out.println("                Médicoa            ");
    System.out.println("===================================");

    System.out.println("Pacientes cadastrados: " + medicos);
    }

  String informacoesCadastroConsulta;
    public void exibeInformacoesConsulta(){
    System.out.println("===================================");
    System.out.println("              Consultas            ");
    System.out.println("===================================");

    System.out.println("Consultas marcadas: " + consultas);
    }

    String informacoesCadastroClinica;
    public void exibeInformacoesClinica(){
    System.out.println("===================================");
    System.out.println("              Clinicas             ");
    System.out.println("===================================");

    informacoesCadastroClinica += "Nome: " + nomeClinica  ;
    informacoesCadastroClinica += "CNPJ: " + cnpjClinica ;
    informacoesCadastroClinica += "Endereco: " + enderecoClinica;
    informacoesCadastroClinica += "Telefone: " + telefoneClinica  + "\n";
    System.out.println(informacoesCadastroClinica);
    }

}
