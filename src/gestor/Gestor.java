package gestor;
import java.io.IOException;

import persistencia.ClienteDB;
import persistencia.MedicoDB;
import persistencia.ClinicaDB;
import util.LeitoraDados;

public class Gestor {
    LeitoraDados leitoraDados;
    ClienteDB db;
    GestorCliente gestorCliente;
    GestorMedico gestorMedico;
    GestorClinica gestorClinica;

    public Gestor(String caminho) throws IOException {
        //caminho pra salvar a lista de arquivos
        this.leitoraDados = new LeitoraDados();
        this.db = new ClienteDB(caminho);
        this.gestorCliente = new GestorCliente(this.db);
    }

    public void exibeOpcoes() {
        System.out.println("Selecione um número, ou aperte qualquer outra tecla para encerrar o programa: ");
        System.out.println("1 - menu clientes");
        System.out.println("2 - menu médicos");
        System.out.println("3 - menu clínicas"); //TODO - entidades da clínica e seus bancos de dado
    }

    //método pra processar as opções
    public String processaOpcoes() throws IOException {
        String opcao = this.leitoraDados.lerTexto();
        String opcaoMenu = "0";

        switch (opcao) {
            case "1": //cliente
            while (!opcaoMenu.equals("")){
                gestorCliente.exibeOpcoes();
                opcaoMenu = gestorCliente.processaOpcoes();
                    }

            break;

            case "2": //médicos
            while (!opcaoMenu.equals("")){
                gestorMedico.exibeOpcoes();
                opcaoMenu = gestorMedico.processaOpcoes();
                    }

            case "3": //clínicas
            while (!opcaoMenu.equals("")){
                GestorClinica.exibeOpcoes();
                opcaoMenu = gestorClinica.processaOpcoes();
                    }

            default:
                System.out.println("Volte sempre!");
                opcao = "";
            break;
        }

        return opcao;
    }

    // a classe gestor ficou um pouco grande
    //trabalhar com menus e sub menus para o código não ficar tão grande
    //GestorConsulta, GestorCliente, GestorConsultorio
    //para cada classe ser mais enxuta, e para que não seja uma classe enorme com várias opções
    //não fazer um único processo com 500 opções

}
