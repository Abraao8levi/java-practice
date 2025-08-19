package solid.notify;

public class EmailNotifier implements ReceiptSender, MessageSender {
    @Override
    public void sendReceipt(String to, String receiptText) {
        System.out.printf("[EMAIL] to=%s\n%s\n\n", to, receiptText);
    }

    @Override
    public void sendMessage(String to, String message) {
        System.out.printf("[EMAIL] to=%s | %s\n", to, message);
    }
}
