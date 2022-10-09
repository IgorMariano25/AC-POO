public class PlanoSaude {
    private String nome;
    private int limiteConsultasMes;

    public PlanoSaude(String nome, int limiteConsultasMes) {
        this.nome = nome;
        this.limiteConsultasMes = limiteConsultasMes;
    }

    public void exibeInfo() {
        String informaçoesPlanoSaude = "";

        informaçoesPlanoSaude = "Nome: " + this.nome;
        informaçoesPlanoSaude = "Limite de consultas do plano: " + this.limiteConsultasMes;
        System.out.println(informaçoesPlanoSaude);
    }
}