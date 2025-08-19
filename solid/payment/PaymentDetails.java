package solid.payment;

public class PaymentDetails {
    public enum Method { CREDIT_CARD, PIX }
    private final Method method;
    private final String tokenOrKey; // token de cartão ou chave PIX

    public PaymentDetails(Method method, String tokenOrKey) {
        this.method = method; this.tokenOrKey = tokenOrKey;
    }
    public Method method() { 
        return method; 
    }
    public String tokenOrKey() { 
        return tokenOrKey;
     }
}
