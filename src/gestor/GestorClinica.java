package gestor;

import java.io.IOException;
import persistencia.ClinicaDB;
import util.LeitoraDados;

public class GestorClinica {
    LeitoraDados leitoraDados;
    ClinicaDB db;

    public GestorClinica(ClinicaDB db) throws IOException {
        this.leitoraDados = new LeitoraDados();
        this.db = db;
    }

    public static void exibeOpcoes() {
        System.out.println("Selecione um número, ou aperte qualquer outra tecla para voltar ao menu anterior: ");
        System.out.println("1 - Cadastrar uma clínica");
        System.out.println("2 - Atualizar uma clínica");
        System.out.println("3 - Remover uma clínica");
        System.out.println("4 - Pesquisar uma clínica pelo CEP");
        System.out.println("5 - Exibir todas as clínicas");
    }

    public String processaOpcoes() throws IOException {
        String opcao = this.leitoraDados.lerTexto();
        String cep;

        switch (opcao) {
            case "1":
                this.db.adicionar(leitoraDados.lerNovaClinica());
            break;

            case "2":
                System.out.println("Digite o cep da clínica a ser alterada: ");
                cep = leitoraDados.lerTexto();
                if (this.db.consultar(cep) != null) {
                    this.db.alterar(leitoraDados.lerClinicaAlteracao(cep));
                } else {
                    System.out.println("O CEP inserido não foi localizado!");
                }
            break;
            
            case "3":
                System.out.println("Digite o cep da clínica a ser excluída: ");
                cep = leitoraDados.lerTexto();
                if (this.db.consultar(cep) != null) {
                    this.db.excluir(cep);
                    System.out.println("Clínica excluída com sucesso!");
                } else {
                    System.out.println("O CEP inserido não foi localizado!");
                }
            break;

            case "4":
                System.out.println("Digite o cep da clínica a ser pesquisada: ");
                cep = leitoraDados.lerTexto();
                if (this.db.consultar(cep) != null) {
                    System.out.println(this.db.consultar(cep));
                } else {
                    System.out.println("O CEP inserido não foi localizado!");
                }
            break;

            case "5":
            System.out.println(this.db);
            break;

            default:
                this.db.exportar();
                opcao = "";
            break;
        }

        return opcao;
    }
    
}
