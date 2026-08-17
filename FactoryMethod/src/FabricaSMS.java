public class FabricaSMS extends FabricaNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new SMS();
    }
}