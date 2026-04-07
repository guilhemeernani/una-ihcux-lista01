import java.util.Scanner;

public class chocolate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // =========================================
        // 1ª SITUAÇÃO: CLASSIFICAÇÃO POR CACAU
        // =========================================
        System.out.println("=== CLASSIFICAÇÃO POR TEOR DE CACAU ===");
        System.out.print("Digite a porcentagem de cacau: ");
        double teorCacau = sc.nextDouble();

        if (teorCacau < 25) {
            System.out.println("ALERTA: Produto 'Fake'. Classificar como 'Sabor Chocolate'");
        } else if (teorCacau >= 25 && teorCacau < 35) {
            System.out.println("Chocolate Comum (Padrão Nacional Atual)");
        } else {
            System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");
        }

        // =========================================
        // 2ª SITUAÇÃO: CATEGORIA E RÓTULO
        // =========================================
        System.out.println("\n=== VERIFICAÇÃO DE CATEGORIA ===");
        System.out.print("Digite o tipo do chocolate (AO_LEITE ou AMARGO): ");
        String tipo = sc.next();

        System.out.print("Digite as gramas de açúcar por porção: ");
        int acucar = sc.nextInt();

        if (tipo.equals("AO_LEITE") && acucar > 15) {
            System.out.println("Classificação: Doce de leite com cacau (Excesso de açúcar)");
        } else {
            System.out.println("Classificação: Chocolate balanceado");
        }

        // =========================================
        // 3ª SITUAÇÃO: EXPORTAÇÃO
        // =========================================
        System.out.println("\n=== PRECIFICAÇÃO DE EXPORTAÇÃO ===");
        System.out.print("Digite o preço do ovo: R$ ");
        double preco = sc.nextDouble();

        System.out.print("Digite a nota de pureza (0 a 10): ");
        double pureza = sc.nextDouble();

        if (preco > 100.00 || pureza < 5) {
            System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões");
        } else {
            System.out.println("APROVADO: Produto competitivo para o mercado externo");
        }

        sc.close();
    }
}