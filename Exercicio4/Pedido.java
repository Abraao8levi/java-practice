package Exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
     private String id;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private  StatusPedido status;
    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }
    private List<ItemPedido> itens;

    public Pedido(String id){
        this.id = id;
        this.status = StatusPedido.PAGAMENTO_PENDENTE;
        this.itens = new  ArrayList<>();
    }

    public  void addItem(ItemPedido item){
        this.itens.add(item);

    }
    public  void removeItem(ItemPedido item){
        this.itens.remove(item);
    }
    public double calcularValorTotal(){
        double total = 0;
        for(ItemPedido item: itens) {
            total += item.calcularSubtotal();
        }
        return total;

    }
}

    
