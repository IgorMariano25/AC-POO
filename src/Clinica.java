public class Clinica {
    private String nome;
    private String cnpj;
    private Endereco endereco;
    private Telefone[] telefones;
    private int numTels;

    public Clinica(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefones = new Telefone[5];
        this.numTels = 0;
    }

    public String getCnpj() {
        return this.cnpj;
    }
  
    public void cadastraEndereco(String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String uf) {
        this.endereco = new Endereco(logradouro, numero, complemento, bairro, cep, cidade, uf);
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

    public String getNome() {
        return this.nome;
    }

    @Override
    public String toString() {
        return "Unidade " + this.cnpj + ":\n" +
               this.endereco + "\n" +
               this.listaTelefones();
    }
}

// TODO: Implementar método hashCode e Equals
// TODO: Organizar exibição de mensagens para o usuário