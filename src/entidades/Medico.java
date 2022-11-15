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
        System.out.println("\n===================================");
        System.out.println("        Menu de opções Médico      ");
        System.out.println("===================================");
        System.out.println("1 - Cadastrar Médico");
        System.out.println("2 - Exibir Médicos cadastrados");
        System.out.println("Qualquer outra tecla - Sair do programa");
        System.out.print("\nInforme a opção desejada: ");
    }
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Medico)) {
            return false;
        }
        Medico medico = (Medico) o;
        return Objects.equals(cpfMedico, medico.cpfMedico) && 
        Objects.equals(nomeMedico, medico.nomeMedico) && 
        Objects.equals(emailMedico, medico.emailMedico) && 
        Objects.equals(especialidadeMedico, medico.especialidadeMedico) && 
        Objects.equals(crmMedico, medico.crmMedico);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cpfMedico, nomeMedico, emailMedico, 
                            especialidadeMedico, crmMedico);
    }

    @Override
    public String toString() {
        return cpfMedico + " - " + nomeMedico;
    }
}
