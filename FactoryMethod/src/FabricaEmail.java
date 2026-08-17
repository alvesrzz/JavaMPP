public class FabricaEmail extends FabricaNotificacao {

    @Override
    public Notificacao criarNotificacao() {
        return new Email();
    }
}