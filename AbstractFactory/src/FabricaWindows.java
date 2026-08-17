public class FabricaWindows implements FabricaInterface {

    public Botao criarBotao() {
        return new BotaoWindows();
    }

    public CaixaSelecao criarCaixaSelecao() {
        return new CaixaSelecaoWindows();
    }
}
