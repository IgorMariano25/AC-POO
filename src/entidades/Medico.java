package entidades;

import java.util.Objects;

public class Medico {
    private String cpf;
    private String nome;

    public Medico(String cpf) {
        this.cpf = cpf;
        this.nome = "";
    }

    public Medico(String cpf, String nome) {
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Medico)) {
            return false;
        }
        Medico medico = (Medico) obj;
        return medico.cpf.equals(this.cpf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpf, nome);
    }

    @Override
    public String toString() {
        return cpf + " - " + nome;
    }
}
