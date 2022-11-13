import util.Gerenciador;

//import gestor.GestorCliente;

public class Main{
    public static void main(String[] args) throws Exception {
        String opcao = "0";
        while (!opcao.equals("")){
            Gerenciador.exibeOpcoesMenu();
            opcao = Gerenciador.processaOpcoesMenu();
        }
    }
}
