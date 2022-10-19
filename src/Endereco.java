public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String cep;
    private String cidade;
    private String uf;

    public Endereco(String logradouro, int numero, String complemento, String bairro, String cep, String cidade, String uf) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    @Override
    public String toString() {
        return this.logradouro + ", " + this.numero + ", " + this.complemento + " - " + this.bairro + " - " +
               this.cidade + "/" + this.uf + "\nCEP: " + this.cep;
    }
}
    // TODO: Implementar método hashCode e Equals
    // TODO: Organizar exibição de mensagens para o usuário