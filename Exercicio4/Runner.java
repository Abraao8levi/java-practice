package Exercicio4;

public class Runner {
    public static void main(String[] args) {
        // Criando um produto
        Produto produto1 = new Produto(1, "Camiseta", "Camiseta de algodão", 29.99f);
        // Criando um item de pedido
        ItemPedido item1 = new ItemPedido(2, produto1);
        // Criando um pedido
        Pedido pedido1 = new Pedido("PED001");
        pedido1.addItem(item1);
        // Exibindo o valor total do pedido
        System.out.println("Valor total do pedido: " + pedido1.calcularValorTotal());
    }
    
}
