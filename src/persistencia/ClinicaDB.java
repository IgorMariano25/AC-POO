package persistencia;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Clinica;
import util.Arquivo;

public class ClinicaDB {
    private List<Clinica> clinicas = new ArrayList<>();
    private String caminho;
    
    public ClinicaDB(String caminho) throws IOException {
        this.caminho = caminho;
        this.importar();
    }

    public void adicionar(String[] dadosClinica) {
        Clinica clinica = new Clinica(dadosClinica[0], dadosClinica[1]);
        if (!this.clinicas.contains(clinica)) {
            this.clinicas.add(clinica);
        }
    }

    public void alterar(String[] dadosClinica) {
        Clinica clinica = new Clinica(dadosClinica[0], dadosClinica[1]);
        int posicao = this.clinicas.indexOf(clinica);
        if (posicao != -1) {
            this.clinicas.set(posicao, clinica);
        }
    }

    public void excluir(String cep) {
        Clinica clinica = new Clinica(cep);
        if(this.clinicas.contains(clinica)){
            this.clinicas.remove(clinica);
        }
    }

    public Clinica consultar(String cep) {
        Clinica clinica = new Clinica(cep);
        int posicao = this.clinicas.indexOf(clinica);
        if (posicao != -1) {
            return this.clinicas.get(posicao);
        }
        return null;
        //significa que não encontrou
    }


    public List<Clinica> listar() {
        return Collections.unmodifiableList(this.clinicas);
    }
    
    public void importar() throws IOException{
        List<String> linhas = Arquivo.ler(this.caminho);

        for (String linha : linhas) { 
            this.adicionar(linha.split(" - "));
        }
    }

    public void exportar() throws IOException{
        List<String> linhas = new ArrayList<>();
        for (Clinica clinica : this.clinicas) {
            linhas.add(clinica.toString());
        }
        Arquivo.escrever(this.caminho, linhas);
    }

    @Override
    public String toString() {
        String msg = "";
        for (Clinica clinica : this.listar()){
            msg += clinica + "\n";
        }
        return msg;
    }

}
