package Exercicio1;

public class Main {

    public static void main(String[] args) {
        // 1. Criar um objeto Departamento.
        // O departamento ainda não tem gerente nem empregados.
        Departamento ti = new Departamento(101);
        ti.setCodigo(101); // O construtor já faz isso, mas é um exemplo de uso do setter.

        // 2. Criar objetos Empregado, associando-os ao departamento 'ti'.
        Empregado gerenteTI = new Empregado("111.222.333-44", "Ana Silva", 15000.0f, ti);
        Empregado desenvolvedor = new Empregado("555.666.777-88", "Carlos Souza", 8000.0f, ti);

        // 3. Definir o gerente e o empregado do departamento.
        // Note que estamos associando os objetos que já foram criados.
        ti.setGerente(gerenteTI);
        ti.setEmpregados(desenvolvedor); // Atribuindo um empregado ao departamento.

        // 4. Imprimir as informações para verificar.
        System.out.println("--- Detalhes do Departamento ---");
        System.out.println(ti);

        System.out.println("\n--- Detalhes dos Empregados ---");
        System.out.println("Gerente: " + gerenteTI);
        System.out.println("Desenvolvedor: " + desenvolvedor);

        // Exemplo de como acessar informações através dos objetos
        System.out.println("\n--- Acessando dados ---");
        System.out.println("O nome do gerente do departamento de TI é: " + ti.getGerente().getNome());
        System.out.println("O departamento do empregado " + desenvolvedor.getNome() + " é o de código: " + desenvolvedor.getDepartamento().getCodigo());
    }
}