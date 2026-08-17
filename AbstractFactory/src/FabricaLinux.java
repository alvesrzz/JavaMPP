public class FabricaLinux implements FabricaInterface {

    public Botao criarBotao() {
        return new BotaoLinux();
    }

    public CaixaSelecao criarCaixaSelecao() {
        return new CaixaSelecaoLinux();
    }
}