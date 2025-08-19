package solid.payment;

import java.util.Objects;

public class PaymentResult {
    private final boolean success;
    private final String transactionId;
    private final String message;

    private PaymentResult(boolean success, String transactionId, String message) {
        this.success = success; this.transactionId = transactionId; this.message = message;
    }
    public static PaymentResult ok(String tx) { return new PaymentResult(true, tx, "OK"); }
    public static PaymentResult fail(String msg) { return new PaymentResult(false, null, Objects.requireNonNullElse(msg, "FAIL")); }

    public boolean success() { return success; }
    public String transactionId() { return transactionId; }
    public String message() { return message; }
}
