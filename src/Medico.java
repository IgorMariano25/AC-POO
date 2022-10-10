public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    private Agenda agendas[];
    private int agendasOcupadas;
    private Consultorio consultorio;

    public Medico(String nome, String cpf, String eMail, String crm, String especialidade) {
        super(nome, cpf, eMail);
        this.crm = crm;
        this.especialidade = especialidade;
        this.agendas = new Agenda[10];
        this.agendasOcupadas = 0;
    }

    @Override
    public void exibeInfo() {
        String msg = "";

        msg += this.nome + " - " + this.especialidade + "\n";
        msg += this.eMail + "\n";
        msg += "CPF: " + this.cpf + "\n";
        msg += "CRM: " + this.crm + "\n";
        msg += "Telefones:" + "\n";
        msg += this.listaTelefones();
        System.out.println(msg);
    }

    public void incluirAgenda(int diaSemana, Clinica clinica) {
        if (this.agendasOcupadas > 10) {
            this.agendasOcupadas = 0;
        }

        agendas[this.agendasOcupadas] = new Agenda(diaSemana, clinica, consultorio);
        this.agendasOcupadas += 1;
    }

    public Agenda[] getAgendas() {
        return this.agendas;
    }
  
    public void exibirAgendas() {
        System.out.println("Agenda de " + this.nome + ":\n");
        for (Agenda agenda : this.agendas) {
            System.out.println(agenda);
        }
    }
}
