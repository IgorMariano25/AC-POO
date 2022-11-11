package entidades;

import java.util.Objects;

public class Consulta {
    private String nome;
    public Paciente paciente;
    private String cpfPaciente;
    private String endereco;

    public Consulta(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public Consulta(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Consulta)) {
            return false;
        }
        Consulta consulta = (Consulta) obj;
        return consulta.nome.equals(this.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco, cpfPaciente);
    }

    @Override
    public String toString() {
        return nome + " - " + endereco;
    }
}
