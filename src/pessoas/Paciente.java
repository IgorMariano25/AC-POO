package pessoas;
import java.time.LocalDate;

import clinica.Endereco;
import util.PlanoSaude;

public class Paciente extends Pessoa {
    private LocalDate dataNascimento;
    private boolean planoParticular;
    private PlanoSaude plano;
    private Endereco endereco;

    public Paciente(String nome, String cpf, String eMail, LocalDate dataNascimento) {
        super(nome, cpf, eMail);
        this.dataNascimento = dataNascimento;
        this.planoParticular = false;
    }

    public void cadastraPlano(PlanoSaude plano) {
        this.planoParticular = true;
        this.plano = plano;
    }

    public void cadastraEndereco(String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String uf) {
        this.endereco = new Endereco(logradouro, numero, complemento, bairro, cep, cidade, uf);
    }

    public boolean getPlanoParticular() {
        return this.planoParticular;
    }

    @Override
    public void exibeInfo() {
        String msg = "";

        msg += "Nome: " + this.nome + "\n";
        msg += "Data de nascimento: " + this.dataNascimento + "\n";
        msg += "E-mail: " + this.eMail + "\n";
        msg += "CPF: " + this.cpf + "\n";
        msg += "Telefones:" + "\n";
        msg += "Plano de Saúde: " + this.plano;
        msg += "Endereço: " + this.endereco;
        msg += this.listaTelefones();
        System.out.println(msg);
    }
}