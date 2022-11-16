import util.Gerenciador;
public class Main{
    public static void main(String[] args) throws Exception {
        String opcao = "0";
        while (!opcao.equals("")){
            Gerenciador.exibeOpcoesMenu();
            opcao = Gerenciador.processaOpcoesMenu();
        }
    }
}
