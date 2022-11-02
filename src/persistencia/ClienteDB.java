package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Cliente;
import util.Arquivo;

public class ClienteDB {
    private List<Cliente> clientes = new ArrayList<>();
    private String caminho;
    
    public ClienteDB(String caminho) throws IOException {
        this.caminho = caminho;
        this.importar(); //pra opder faezr a importação dos dados
    }

    //adicionar
    public void adicionar(String[] dadosCliente) {
        //pra cada classe de entidade ter uma classe de DB, boa prática
        //colocar limite d 20 clientes aqui, mas vitor vai tirar a restrição da quantidade de clientes
        Cliente cliente = new Cliente(dadosCliente[0], dadosCliente[1]);
        if (!this.clientes.contains(cliente)) {
            this.clientes.add(cliente);
        }
    }

    //alterar
    public void alterar(String[] dadosCliente) {
        Cliente cliente = new Cliente(dadosCliente[0], dadosCliente[1]);
        int posicao = this.clientes.indexOf(cliente); //método indexOf retorna a posição do dado na estrutura de dados
        //se o cliente não estiver no banco de dados retorna -1
        //criando nova instancia
        if (posicao != -1) {
            this.clientes.set(posicao, cliente);
        }
    }

    //excluir
    public void excluir(String cpf) {
        //cpf teria que ter um equals pois não pode ser igual
        Cliente cliente = new Cliente(cpf);
        if(this.clientes.contains(cliente)){
            this.clientes.remove(cliente);
        }
    }

    //consultar (pelo cpf)
    public Cliente consultar(String cpf) {
        Cliente cliente = new Cliente(cpf);
        int posicao = this.clientes.indexOf(cliente);
        if (posicao != -1) {
            return this.clientes.get(posicao);
        }
        return null;
        //significa que não encontrou
    }

    //listar
    public List<Cliente> listar() {
        return Collections.unmodifiableList(this.clientes);
        //exibe as informações
    }

    //importar (mesma coisa pra qualquer classe de DB que existir, poderia ser método da superclasse se existisse)
    public void importar() throws IOException{
        //populando com dados do arquivo
        List<String> linhas = Arquivo.ler(this.caminho);

        for (String linha : linhas) { 
            //quebra minha linha com o -
            this.adicionar(linha.split(" - ")); //faz várias adições sucessivas 
        }
    }

    //exportar (mesma coisa pra qualquer classe de DB que existir, poderia ser método da superclasse se existisse)
    public void exportar() throws IOException{
        List<String> linhas = new ArrayList<>();

        for (Cliente cliente : this.clientes) {
            linhas.add(cliente.toString());
        }

        Arquivo.escrever(this.caminho, linhas); //método estático, por isso se chama assim
    }

    //toString
    @Override
    public String toString() {
        String msg = "";
        for (Cliente cliente : this.listar()){
            msg += cliente + "\n";
        }
        return msg;
    }
}