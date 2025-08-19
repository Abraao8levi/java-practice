package solid.notify;

public class SmsNotifier implements MessageSender {
    @Override
    public void sendMessage(String to, String message) {
        System.out.printf("[SMS] to=%s | %s\n", to, message);
    }
}
