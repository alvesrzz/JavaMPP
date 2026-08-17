public class Main {

    public static void main(String[] args) {

        FabricaInterface fabrica = new FabricaWindows();

        Botao botao = fabrica.criarBotao();
        CaixaSelecao caixa = fabrica.criarCaixaSelecao();

        botao.exibir();
        caixa.exibir();
    }
}