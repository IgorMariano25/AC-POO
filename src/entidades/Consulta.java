package entidades;

import java.util.Objects;

public class Consulta {
    private String nome;
    public String paciente;
    private String cpfPaciente;
    private String endereco;

    public Consulta(String cpfPaciente) {
        this.cpfPaciente = cpfPaciente;
    }

    public Consulta(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public static void exibeOpcoesMenu() {
        System.out.println( "\nSistema de agendamento de consultas");
        System.out.println( "Informe a opção desejada:");
        System.out.println( "1 - Cadastrar paciente");
        System.out.println( "2 - Exibir pacientes cadastrados");
        System.out.println( "3 - Cadastrar médico");
        System.out.println(" 4 - Exibir Médicos cadastrados");
        System.out.println( "5 - Cadastrar clinica");
        System.out.println(" 6 - Exibir clinica cadastrada");
        System.out.println( "Qualquer outra tecla - Sair do programa");
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
