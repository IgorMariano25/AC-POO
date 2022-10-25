package util;
public class Telefone {
    private String numero;
    private String tipo;

    public Telefone(String numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return this.tipo + " - " + this.numero;
    }
}

    // TODO: Implementar método hashCode e Equals
    // TODO: Organizar exibição de mensagens para o usuário
