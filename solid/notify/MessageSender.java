package solid.notify;

/**
 * Outro cliente do sistema poderia depender apenas de mensagens genéricas.
 * (Ex.: avisos de status.) CheckoutService não é forçado a usar isso.
 */
public interface MessageSender {
    void sendMessage(String to, String message);
}
