package solid.notify;

/**
 * ISP: interfaces pequenas e específicas.
 * CheckoutService só precisa enviar recibo, não SMS genérico.
 */
public interface ReceiptSender {
    void sendReceipt(String to, String receiptText);
}
