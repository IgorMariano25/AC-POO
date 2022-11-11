package entidades;

import java.util.Objects;

public class Clinica {
    private String cep;
    private String endereco;

    public Clinica(String cep) {
        this.cep = cep;
        this.endereco = "";
    }

    public Clinica(String cep, String endereco) {
        this.cep = cep;
        this.endereco = endereco;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (!(obj instanceof Clinica)) {
            return false;
        }
        Clinica clinica = (Clinica) obj;
        return clinica.cep.equals(this.cep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cep, endereco);
    }

    @Override
    public String toString() {
        return cep + " - " + endereco;
    }
}
