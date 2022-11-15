package entidades;

import java.util.Objects;

public class Medico {
    private String cpfMedico;
    private String nomeMedico;
    private String emailMedico;
    private String especialidadeMedico;
    private String crmMedico;

    public Medico(String cpfMedico) {
        this.cpfMedico = cpfMedico;
        this.nomeMedico = "";
        this.emailMedico = "";
        this.crmMedico = "";
    }

    public Medico(String cpfMedico, String nomeMedico, String emailMedico, String crmMedico) {
        this.cpfMedico = cpfMedico;
        this.nomeMedico = nomeMedico;
        this.emailMedico = emailMedico;
        this.crmMedico = crmMedico;
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

    public static String processaOpcoesMenu() throws IOException {
        Scanner scanner = new Scanner(System.in);
        String opcaoMenu = scanner.nextLine();
        switch (opcaoMenu){
            case "1":
            new CadastraDados().cadastrarMedico();
            break;

            case "2":
            new CadastraDados().exibeInformacoesMedico();
            break;
        }
        scanner.close();
        return opcaoMenu;
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
        return Objects.hash(cpfMedico, nomeMedico, emailMedico, especialidadeMedico, crmMedico);
    }

    @Override
    public String toString() {
        return cpfMedico + " - " + nomeMedico + " - " + emailMedico + " - " + especialidadeMedico + " - " + crmMedico;
    }
}
