package Exercicio4;

public class ItemPedido {
private int quantidade;
public  int getQuantidade(){
    return quantidade;
}

public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
}
private  double valorTotal;
public double getValorTotal() {
    return valorTotal;
}
 public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
    private  Produto produto;
    public ItemPedido(int quantidade, Produto produto){
        this.quantidade = quantidade;
        this.produto = produto;
        this.valorTotal = calcularSubtotal();
    }
    public  double calcularSubtotal(){
        return this.quantidade * this.produto.getValor();
    }
}
