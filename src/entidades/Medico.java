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
