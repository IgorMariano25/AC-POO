package pessoas;
import util.Telefone;

public abstract class Pessoa {
    protected String nome;
    protected String cpf;
    protected String eMail;
    protected Telefone[] telefones;
    private int numTels;

    public Pessoa (String cpf, Telefone[] telefones) {
        this.nome = "";
        this.cpf = cpf;
        this.eMail = "";
        this.telefones = telefones;
        this.numTels = 0;
    }

    public Pessoa(String nome, String cpf, String eMail) {
        this.nome = nome;
        this.cpf = cpf;
        this.eMail = eMail;
        this.telefones = new Telefone[5];
        this.numTels = 0;
    }

    public void cadastraTelefone(String numero, String tipo) {
        if (this.numTels > 4) {
            this.numTels = 0;
        }

        this.telefones[this.numTels] = new Telefone(numero, tipo);
        this.numTels += 1;
    }

    protected String listaTelefones() {
        String msg = "";

        for ( Telefone tel : this.telefones ) {
            if ( tel == null ) {
                break;
            }
            msg += tel + "\n";
        }

        return msg;
    }

    public String getNome() {
        return this.nome;
    }

    public abstract void exibeInfo();
}