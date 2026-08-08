package aula13;

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o seu genero (M/F)");
        String sexo = scanner.nextLine();

        System.out.println("Informe o seu Altura:");
        float altura = scanner.nextFloat();

        double pesoIdeal;
        if (sexo.equals("M")){
            pesoIdeal = 72.7 * altura - 58;
        }else {
            pesoIdeal = 62.1 * altura - 44.7;
        }

        System.out.println("Seu peso ideal é: " + pesoIdeal);

        System.out.println("Agora informe seu peso: ");
        float peso = scanner.nextFloat();

        if (peso == pesoIdeal){
            System.out.println("Parabéns! Você está dentro do peso ideal.");
        } else if (peso < pesoIdeal){
            System.out.println("Ooops. Você esta abaixo do seu peso ideial.");
        }else {
            System.out.println("Você está acima do seu peso ideal.");
        }

    }
}
