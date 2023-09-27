import java.util.Scanner;

/*

Pedro Gonçalves Classen BCC4A

Exercícios da árvore binária de busca 1, 2, 3, 4
Exercício 5 esta no outro projeto

 */

public class ArvoreBinariaDeBusca {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArvoreBinaria arvore = new ArvoreBinaria();

        int K;
        int N;
        while (true) {
            System.out.println("\n----- ACOES -----");
            System.out.println("1 - Inserir");
            System.out.println("2 - Preordem");
            System.out.println("3 - Inordem");
            System.out.println("4 - Posordem");
            System.out.println("5 - Remover maior");
            System.out.println("6 - Remover menor");


            K = scanner.nextInt();
            switch (K) {
                case 1:
                    System.out.print("numero: ");
                    N = scanner.nextInt();
                    arvore.inserir(N);
                    arvore.imprimir(0, null);
                    break;

                case 2:
                    arvore.percorrerPreordem();
                    break;
                case 3:
                    arvore.percorrerInordem();
                    break;
                case 4:
                    arvore.percorrerPosordem();
                    break;

                case 5:
                    arvore.removerMaior();
                    break;
                case 6:
                    arvore.removerMenor();
                    break;
            }
        }
    }
}
