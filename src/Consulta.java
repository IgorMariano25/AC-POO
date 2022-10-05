import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class Consulta {
    private LocalDate data;
    private LocalTime hora;
    private boolean consultaRevisao;
    private Paciente paciente;
    private Medico medico;

    public Consulta(boolean consultaRevisao, Paciente paciente, Medico medico) {
        this.consultaRevisao = consultaRevisao;
        this.paciente = paciente;
        this.medico = medico;
    }

    public boolean marcarConsulta(LocalDate dia, LocalTime horario, Clinica clinica) {
        Agenda agendas[] = this.medico.getAgendas();

        for (Agenda agenda : agendas) {
            if (agenda.getClinicaCnpj() == clinica.getCnpj()) {
                if (agenda.agendarHorario(dia, horario, this)) {
                    this.data = dia;
                    this.hora = horario;
                    System.out.println("Consulta agendada!");
                    return true;
                }
            }
        }
        
        System.out.println("Houve um erro no agendamento!");
        return false;
    }

    public String emitirNotaCobranca(consultaRevisa){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        return "Pagamento por: " + this.paciente.getNome() + "\n" +
        "Dia: " + this.data.format(df) + "\n" +
        "Valor da consulta: " + verificarValorCobranca() + "\n" +
        "CNPJ: " + this.clinica.getCnpj();
        }
    
    public Integer verificarValorCobranca(){
        int valorCobranca = 0;
            if (getPlanoParticular() = true) {
                valorCobranca += 100;
            } else if (consultaRevisao = true){ 
                valorCobranca += 400;
            } else if (consultaRevisao = false){
                valorCobranca += 200;
            }
        switch (valorCobranca) {
            case 100:
                banco.cadastraPaciente();
                System.out.("opção 1!\n");
                break;
            case "2":
                System.out.println("opção 2!\n");
                break;
            case "3":
                System.out.println("opção 3!\n");
                break;
            default:
                System.out.println("Volte sempre!\n");
                opcao = "";
            return
        }
    }

    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm");

        return "Consulta de " + this.paciente.getNome() + " com dr(a). " + this.medico.getNome() + ":\n" +
               "Dia " + this.data.format(df) + "\n" +
               "Às " + this.hora.format(tf);
    }
}