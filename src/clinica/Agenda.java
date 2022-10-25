package clinica;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class Agenda {
    private int diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private int intervaloConsulta;
    private Clinica clinica;
    private Consulta consultas[];
    //TODO: Adicionar método getConsultorio()
    private Consultorio consultorio;

    public Agenda(int diaSemana, Clinica clinica, Consultorio consultorio ) {
        this.diaSemana = diaSemana;
        // Objeto LocalTime possui método of(), que define um horário em
        // horas e minutos
        // https://docs.oracle.com/javase/8/docs/api/java/time/LocalTime.html
        this.horaInicio = LocalTime.of(8, 0);
        this.horaFim = LocalTime.of(17, 0);
        this.intervaloConsulta = 30;
        this.clinica = clinica;
        this.definirHorariosAgendamento();
        this.consultorio = consultorio;
    }

    public String getClinicaCnpj() {
        return this.clinica.getCnpj();
    }
  
    private String converteDiaSemana() {
        String dia;
        switch (this.diaSemana) {
            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda-feira";
                break;
            case 3:
                dia = "terça-feira";
                break;
            case 4:
                dia = "quarta-feira";
                break;
            case 5:
                dia = "quinta-feira";
                break;
            case 6:
                dia = "sexta-feira";
                break;
            case 7:
                dia = "sábado";
                break;
            default:
                dia = "erro! dia não definido";
        }
        return dia;
    }

    // Objeto ChronoUnit calcula unidades de tempo entre dois objetos LocalTime
    // https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoUnit.html
    private void definirHorariosAgendamento() {
        int numAgendas = (int) (ChronoUnit.MINUTES.between(this.horaInicio, this.horaFim) / this.intervaloConsulta);
        this.consultas = new Consulta[numAgendas];
    }

    public void definirIntervaloConsulta(int intervaloConsulta) {
        this.intervaloConsulta = intervaloConsulta;
    }

    public void definirHorario(LocalTime horaInicio, LocalTime horaFim) {
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
    }

    // Objeto LocalDate possui método get(), que permite obter um valor inteiro
    // para um determinado campo
    // https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html

    // Objeto ChronoField possui vários padrões de campos de unidades de tempo
    // https://docs.oracle.com/javase/8/docs/api/java/time/temporal/ChronoField.html
    public boolean agendarHorario(LocalDate dia, LocalTime horario, Consulta consulta) {
        if (dia.get(ChronoField.DAY_OF_WEEK) != this.diaSemana) {
            System.out.println("Dia da semana incompatível!");
            return false;
        }
        int intervalo = (int) (ChronoUnit.MINUTES.between(this.horaInicio, horario) / this.intervaloConsulta);
        if (this.consultas[intervalo] == null) {
            this.consultas[intervalo] = consulta;
            return true;
        }

        System.out.println("Já há uma consulta nesse horário!");
        return false;
    }

    // Objeto DateTimeFormatter formata objetos de tempo e data para String
    // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html
    @Override
    // TODO: Organizar exibição de mensagens para o usuário
    public String toString() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");
        return this.clinica.getNome() + " - " + this.converteDiaSemana() +
               ": " + this.horaInicio.format(dtf) + " - " + this.horaFim.format(dtf);
    }
}
// TODO: Implementar método hashCode e Equals
// TODO: Organizar exibição de mensagens para o usuário
