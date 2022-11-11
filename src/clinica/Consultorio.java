package clinica;
import util.Telefone;


public class Consultorio extends Clinica {
    private String unidade;
    private Telefone[] telefones;
    private int numTels;

    public Consultorio(String unidade, Telefone[] telefones, int numTels, String nome, String cnpj) {
        super(nome, cnpj);
        this.unidade = unidade;
        this.telefones =  new Telefone[1];
        this.numTels = numTels;
    }

    public void cadastraTelefone(String numero, String tipo) {
        if (this.numTels > 4) {
            this.numTels = 0;
        }

        this.telefones[this.numTels] = new Telefone(numero, tipo);
        this.numTels += 1;
    }

    private String listaTelefones() {
        String msg = "";

        for ( Telefone tel : this.telefones ) {
            if ( tel == null ) {
                break;
            }
            msg += tel + "\n";
        }

        return msg;
    }

    @Override
    public String toString() {
        return "Consultorio " + this.unidade + ":\n" +
               this.listaTelefones();
    }
}
    // TODO: Implementar método hashCode e Equals
    // TODO: Organizar exibição de mensagens para o usuário
