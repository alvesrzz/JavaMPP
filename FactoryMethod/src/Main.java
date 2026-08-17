public class Main {

    public static void main(String[] args) {

        FabricaNotificacao fabrica;

        fabrica = new FabricaEmail();
        Notificacao email = fabrica.criarNotificacao();
        email.enviar();

        fabrica = new FabricaSMS();
        Notificacao sms = fabrica.criarNotificacao();
        sms.enviar();
    }
}