//Alt+Shif+F > coloca os dentes

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        imprimirTitulo();
        int opcaoEscolhida = -1;
        while (opcaoEscolhida != 0) {
            imprimirOpcoesPrincipais();
            opcaoEscolhida = scanner.nextInt();

            switch (opcaoEscolhida) {
                case 0:
                    break;
                case 1:
                    //Chamar função de reserva
                    break;
                case 2:
                    impirmirCardapio();
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        }
        System.out.println("Programa encerrado, espero que você aproveite nosso jantar em breve");
    }

    static void imprimirTitulo() {
        System.out.println("-----------------------------------");
        System.out.println("---------CANTINA DA NONNA----------");
        System.out.println("-----------------------------------");
    }
    static void imprimirOpcoesPrincipais() {
        System.out.println("O que deseja? ");
        System.out.println("1 - Reserva.");
        System.out.println("2 - Consultar cardápio.");
        System.out.println("0 - Encerrar programa.");

    }
    static void impirmirCardapio() {
       /* List<String>categorias = new ArrayList<>();
        categorias.add ("Massas");
        categorias.add ("Bebidas");
        categorias.add ("Pizzas");
        categorias.add ("Sobremesas");
        categorias.add ("Aperitivos");*/
        Map<String, List<String>> cardapio = new HashMap<>();
        cardapio.put("Massas", List.of("Lasanha", "Espaguete", "Talharin", "Penne"));
        cardapio.put("Bebidas", List.of("Refrigerante", "Água sem gás", "Água com gás", "Vinho", "Cerveja"));
        for (String cardapioChaveAtual : cardapio.keySet()) {
            System.out.println("- " + cardapioChaveAtual);
            List<String> categoriaAtual = cardapio.get(cardapioChaveAtual);
            for (int pos = 0; pos < categoriaAtual.size(); pos++) {
                System.out.println("-- " + categoriaAtual.get(pos));
            }
        /*List<String> categorias = List.of("Massas", "Bebidas", "Pizzas", "Sobremesas", "Aperitivos", "Rissoto", "Vinhos");
        System.out.println("Categorias");
        for (int pos = 0; pos < categorias.size(); pos++) {
            System.out.println(categorias.get(pos));
        }*/
        }
    }
}
