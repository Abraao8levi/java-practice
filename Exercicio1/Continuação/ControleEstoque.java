package Exercicio1.Continuação;
import java.util.*;;

public class ControleEstoque {
    String[] nomes = new String[100];
    int[] quantidades = new int[100];

    public void cadastrarProduto(int idProduto, String nomeProduto, int estoque) {
    if (idProduto < 0 || idProduto >= 100)  {
        System.out.println("Erro: O ID do produto deve estar entre 0 e 99.");
        return; 
    }
    nomes[idProduto] = nomeProduto;
    quantidades[idProduto] = estoque;

}
    public void atualizarQuantidade(int idProduto, int novaQuantidade) {
        quantidades[idProduto] = novaQuantidade;
    }

    public int consultarQuantidade(int idProduto) {
        return quantidades[idProduto];
    }

    public static void main(String[] args) {
        ControleEstoque controle = new ControleEstoque();
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Digite a opcao Desejada: ");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Opcao 1 - Cadastrar Produto. ");
                    System.out.println("Digite o id do produto( de 0 a 100): ");
                    int idProduto = scanner.nextInt();
                    System.out.println("Digite o nome do produto:");
                    scanner.nextLine();
                    String nomeProduto = scanner.nextLine();
                    System.out.println("Digite a quantidade em estoque do produto: ");
                    int estoque = scanner.nextInt();
                    controle.cadastrarProduto(idProduto, nomeProduto, estoque);
                    break;
                case 2:
                    System.out.println("Opcao 2 - Atualizar quantidade.");
                    System.out.println("Digite o id do produto (de 0 a 100): ");
                    idProduto = scanner.nextInt();
                    System.out.println("Digite a nova quantidade em estoque do produto: ");
                    int novaQuantidade = scanner.nextInt();
                    controle.atualizarQuantidade(idProduto, novaQuantidade);
                    break;
                case 3:
                    System.out.println("Opcao 3 - Consultar quantidade.");
                    System.out.println("Digite o id do produto (de 0 a 100): ");
                    idProduto = scanner.nextInt();
                    System.out.println("Quantidade em estoque: " + controle.consultarQuantidade(idProduto));
                    break;
            }
        }
    }


    }








    

