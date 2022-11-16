package clinica;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import pessoas.Medico;
import pessoas.Paciente;
public class Consulta {
    private LocalDate data;
    private LocalTime hora;
    private boolean consultaRevisao;
    private Paciente paciente;
    private Medico medico;
    private Clinica clinica;

    public Consulta(boolean consultaRevisao, Paciente paciente, Medico medico) {
        this.consultaRevisao = consultaRevisao;
        this.paciente = paciente;
        this.medico = medico;
    }

    
    public String emitirNotaCobranca(){
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        return "Pagamento por: " + this.paciente.getNome() + "\n" +
        "Dia: " + this.data.format(df) + "\n" +
        "Valor da consulta: " + verificarValorCobranca() + "\n" +
        "CNPJ: " + this.clinica.getCnpj();
        }
    
    public Integer verificarValorCobranca(){
        int valorCobranca = 0;
            if (paciente.getPlanoParticular() == true) {
                valorCobranca += 100;
            } else if (consultaRevisao == true){ 
                valorCobranca += 400;
            } else if (consultaRevisao == false){
                valorCobranca += 200;
            }
        return valorCobranca;
    }
    @Override
    public String toString() {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter tf = DateTimeFormatter.ofPattern("hh:mm");

        return "Consulta de " + this.paciente.getNome() + " com Dr(a). " + this.medico.getNome() + "\n" +
               "Dia: " + this.data.format(df) + "\n" +
               "Às: " + this.hora.format(tf);
    }
}